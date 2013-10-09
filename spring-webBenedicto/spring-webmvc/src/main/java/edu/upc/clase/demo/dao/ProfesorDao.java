/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.dao;

import edu.upc.clase.demo.entity.Profesor;
import java.util.List;

/**
 *
 * @author Jose
 */
public interface ProfesorDao {
    public Integer Insertar(Profesor objProfesor);
    public void Actualizar(Profesor objProfesor);
    public List<Profesor> buscarTodos();
}
