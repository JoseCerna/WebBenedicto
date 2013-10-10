/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.dao;

import edu.upc.clase.demo.entity.Alumno;
import java.util.List;

/**
 *
 * @author jose_cerna
 */
public interface AlumnoDao {
    public Integer Insertar(Alumno objAlumno);
    public void Actualizar(Alumno objAlumno);
    public List<Alumno> buscarTodos();
}
