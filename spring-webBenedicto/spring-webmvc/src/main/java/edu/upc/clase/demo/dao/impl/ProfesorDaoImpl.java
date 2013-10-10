/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.dao.impl;

import edu.upc.clase.demo.dao.ProfesorDao;
import edu.upc.clase.demo.entity.Alumno;
import edu.upc.clase.demo.entity.Profesor;
import java.util.List;
import javax.sql.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jose
 */
/**
 *
 * @author Jose
 */
@Repository
public class ProfesorDaoImpl  extends SimpleJdbcDaoSupport implements ProfesorDao {

    private static Logger log = LoggerFactory.getLogger(NegocioDaoImpl.class);

    @Autowired
    public ProfesorDaoImpl(DataSource dataSource) {
        log.info("Asignando el dataSource");
        setDataSource(dataSource);
    }

        
    @Override
    public Integer Insertar(Profesor objProfesor) {
        getJdbcTemplate().update("Insert into Profesor (nombre,apePaterno,apeMaterno,fechaNacimiento,email,direccion,telefono,celular,estado) values (?,?,?,?,?,?,?,?,?)",
        objProfesor.getNombre(),objProfesor.getApePaterno(),objProfesor.getApeMaterno(),objProfesor.getFechaNacimiento() ,objProfesor.getEmail(),objProfesor.getDireccion(),objProfesor.getTelefono(),objProfesor.getCelular(),objProfesor.getEstado());
        return getJdbcTemplate().queryForInt("select last_insert_id()");
    }

    @Override
    public void Actualizar(Profesor objProfesor) {
         getJdbcTemplate().update(
                "update Profesor set nombre = ?, apePaterno = ?, apeMaterno = ?, fechaNacimiento = ? email= ?,direccion = ?,telefono = ?,celular = ?,estado = ? where idProfesor = ?",
                objProfesor.getNombre(),objProfesor.getApePaterno(),objProfesor.getApeMaterno(),objProfesor.getFechaNacimiento() ,objProfesor.getEmail(),objProfesor.getDireccion(),objProfesor.getTelefono(),objProfesor.getCelular(),objProfesor.getEstado());
    }

    @Override
    public List<Profesor> buscarTodos() {
    return getSimpleJdbcTemplate().query(
                "select idProfesor,nombre,apePaterno,apeMaterno,fechaNacimiennto,email,direccion,telefono,celular,estado from profesor",
                new BeanPropertyRowMapper<Profesor>(Profesor.class));
    }
    
}
