/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.dao;

import edu.upc.clase.demo.entity.Academia;
import java.util.List;

/**
 *
 * @author Omar
 */
public interface AcademiaDao {
    public Integer Insertar(Academia objAcademia);
    public void Actualizar(Academia objAcadobjAcademiaemia);
    public List<Academia> buscarTodos();
    public Academia buscarporNombre(String nombreAcademia);
}
