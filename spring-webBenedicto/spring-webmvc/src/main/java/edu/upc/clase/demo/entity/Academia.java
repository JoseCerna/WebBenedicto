/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.entity;

import java.io.Serializable;

/**
 *
 * @author jose_cerna
 */
public class Academia implements Serializable {
    private int idAcademia;
    private String descripcion;
    private String direccion;
    private String telefono;
    private int estado;

    public Academia() {
        
    }
    
    public Academia (String descripcion,String direccion,String telefono,int estado){
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estado = estado;
    }

    /**
     * @return the idAcademia
     */
    public int getidAcademia() {
        return idAcademia;
    }

    /**
     * @param idAcademia the idAcademia to set
     */
    public void setidAcademia(int idAcademia) {
        this.idAcademia = idAcademia;
    }

    /**
     * @return the descripcion
     */
    public String getdescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setdescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the direccion
     */
    public String getdireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setdireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String gettelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void settelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the estado
     */
    public int getestado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setestado(int estado) {
        this.estado = estado;
    }
 
}
