/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.dao;

import edu.upc.clase.demo.entity.Curso;
import java.util.List;

/**
 *
 * @author jose_cerna
 */
public interface CursoDao {
    public Integer Insertar(Curso objCurso);
    public void Actualizar(Curso objCurso);
    public List<Curso> buscarTodos();
    public List<Curso> buscarporNombre(Curso objCurso);
}
