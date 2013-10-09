/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.dao.impl;
import edu.upc.clase.demo.entity.Alumno;
import edu.upc.clase.demo.dao.AlumnoDao;
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
 * @author jose_cerna
 */
@Repository
public class AlumnoDaoImpl  extends SimpleJdbcDaoSupport implements AlumnoDao {
    
    private static Logger log = LoggerFactory.getLogger(NegocioDaoImpl.class);

    @Autowired
    public AlumnoDaoImpl(DataSource dataSource) {
        log.info("Asignando el dataSource");
        setDataSource(dataSource);
    }

    @Override
    public Integer Insertar(Alumno objAlumno) {
        getJdbcTemplate().update("Insert into Alumno (nombre,apePaterno,apeMaterno,dni,email,telefono,celular,estado) values (?,?,?,?,?,?,?,?)",
        objAlumno.getNombre(),objAlumno.getApePaterno(),objAlumno.getApeMaterno(),objAlumno.getDNI(),objAlumno.getEmail(),objAlumno.getTelefono(),objAlumno.getCelular(),objAlumno.getEstado());
        return getJdbcTemplate().queryForInt("select last_insert_id()");
    }
    
    @Override
    public List<Alumno> buscarTodos() {
        return getSimpleJdbcTemplate().query(
                "select id,nombre,correo,password from usuarios",
                new BeanPropertyRowMapper<Alumno>(Alumno.class));
    }

    @Override
    public void Actualizar(Alumno objAlumno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
