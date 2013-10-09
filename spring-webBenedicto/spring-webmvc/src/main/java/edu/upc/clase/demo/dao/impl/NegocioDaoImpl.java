/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.dao.impl;
import edu.upc.clase.demo.dao.NegocioDao;
import edu.upc.clase.demo.entity.Negocio;
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
 * @author alumno
 */
@Repository
public class NegocioDaoImpl extends SimpleJdbcDaoSupport implements NegocioDao {
    
    private static Logger log = LoggerFactory.getLogger(NegocioDaoImpl.class);

    @Autowired
    public NegocioDaoImpl(DataSource dataSource) {
        log.info("Asignando el dataSource");
        setDataSource(dataSource);
    }

    
    @Override
    public Integer insertar(Negocio negocio) {
        getJdbcTemplate().update("Insert into negocios (nombre,website,facebook,twitter) values (?,?,?,?)",
        negocio.getNombre(),negocio.getWebsite(),negocio.getFacebook(),negocio.getTwitter());
        return getJdbcTemplate().queryForInt("select last_insert_id()");
    }

    @Override
    public void actualizar(Negocio negocio) {
        getJdbcTemplate().update(
                "update Negocios set nombre = ?, website = ?, facebook = ?,twitter = ? where id = ?",
                negocio.getNombre(),negocio.getWebsite(),negocio.getFacebook(),negocio.getTwitter(), negocio.getId());
    }
    
    
}
