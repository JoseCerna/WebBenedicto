/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.dao.impl;

import edu.upc.clase.demo.dao.AcademiaDao;
import edu.upc.clase.demo.entity.Academia;
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
import org.springframework.stereotype.Repository;

/**
 *
 * @author Omar
 */
@Repository
public class AcademiaDaoImpl extends SimpleJdbcDaoSupport implements AcademiaDao {

    private static Logger log = LoggerFactory.getLogger(AcademiaDaoImpl.class);

    @Autowired
    public AcademiaDaoImpl(DataSource dataSource) {
        log.info("Asignando el dataSource");
        setDataSource(dataSource);
    }

    @Override
    public Integer Insertar(Academia objAcademia) {
        getJdbcTemplate().update("Insert into Academia (descripcion,direccion,telefono,estado) values (?,?,?,?)",
                objAcademia.getdescripcion(), objAcademia.getdireccion(), objAcademia.gettelefono(), objAcademia.getestado());
        return getJdbcTemplate().queryForInt("select last_insert_id()");
    }

    @Override
    public void Actualizar(Academia objAcademia) {
        getJdbcTemplate().update(
                "update Academia set descripcion = ?, direccion = ?, telefono = ? where id = ?",
                objAcademia.getdescripcion(), objAcademia.getdireccion(), objAcademia.gettelefono(), objAcademia.getestado());
    }

    @Override
    public List<Academia> buscarTodos() {
        return getSimpleJdbcTemplate().query(
                "select id,descripcion,direccion,telefono,estado from academia",
                new BeanPropertyRowMapper<Academia>(Academia.class));
    }

    @Override
    public Academia buscarporNombre(String nombreAcademia) {
        try {
            Map<String, String> parametros = new HashMap<String, String>();
            parametros.put("nombre", "%" + nombreAcademia + "%");
            return (Academia) getSimpleJdbcTemplate().query(
                    "select * from academia where nombre like :nombre",
                    new BeanPropertyRowMapper<Academia>(Academia.class), parametros);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
}
