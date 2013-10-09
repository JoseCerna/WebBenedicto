/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.dao;
import edu.upc.clase.demo.entity.Negocio;
import java.util.List;

/**
 *
 * @author alumno
 */
public interface NegocioDao {
    public Integer insertar(Negocio objnegocio);
    public void actualizar(Negocio objnegocio);
    
}
