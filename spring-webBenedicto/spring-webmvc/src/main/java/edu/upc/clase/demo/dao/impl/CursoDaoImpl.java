/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.dao.impl;

import edu.upc.clase.demo.dao.CursoDao;
import edu.upc.clase.demo.entity.Curso;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

/**
 *
 * @author jose_cerna
 */
public class CursoDaoImpl extends SimpleJdbcDaoSupport implements CursoDao {

    private static Logger log = LoggerFactory.getLogger(NegocioDaoImpl.class);

    @Autowired
    public CursoDaoImpl(DataSource dataSource) {
        log.info("Asignando el dataSource");
        setDataSource(dataSource);
    }
    
    @Override
    public Integer Insertar(Curso objCurso) {
        getJdbcTemplate().update("Insert into Curso (nombre,nroHoras,costo,estado) values (?,?,?,?)",
        objCurso.getnombreCurso(),objCurso.getnroHoras(),objCurso.getcosto(),objCurso.getestado());
        return getJdbcTemplate().queryForInt("select last_insert_id()");
        
    }

    @Override
    public void Actualizar(Curso objCurso) {
        getJdbcTemplate().update(
                "update Curso set nombre = ?, nroHoras = ?, costo = ? where id = ?",
                objCurso.getnombreCurso(), objCurso.getnroHoras(), objCurso.getcosto(), objCurso.getidCurso());
    }

    @Override
    public List<Curso> buscarTodos() {
         return getSimpleJdbcTemplate().query(
                "select id,nombre,nroHoras,costo,estado from curso",
                new BeanPropertyRowMapper<Curso>(Curso.class));
    }

    @Override
    public List<Curso> buscarporNombre(String nombreCurso) {
        try {
            Map<String,String> parametros = new HashMap<String,String>();
            parametros.put("nombre","%"+nombreCurso+"%");
            return getSimpleJdbcTemplate().query(
                    "select * from curso where nombre like :nombre",
                    new BeanPropertyRowMapper<Curso>(Curso.class),parametros);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
        
    }
    
}
