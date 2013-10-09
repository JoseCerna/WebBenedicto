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
public class Alumno implements Serializable{
    private int IdAlumno;
    private String Nombre;
    private String ApePaterno;
    private String ApeMaterno;
    private String DNI;
    private String Email;
    private String Telefono;
    private String Celular;
    private int Estado;

    public Alumno(){    }
    
    public Alumno(String Nombre,String ApePaterno,String ApeMaterno,String DNI,String Email,String Telefono,String Celular,int Estado){
        this.Nombre = Nombre;
        this.ApePaterno = ApePaterno;
        this.ApeMaterno = ApeMaterno;
        this.DNI = DNI;
        this.Email = Email;
        this.Telefono = Telefono;
        this.Celular = Celular;
        this.Estado = Estado;
    }
    
    /**
     * @return the IdAlumno
     */
    public int getIdAlumno() {
        return IdAlumno;
    }

    /**
     * @param IdAlumno the IdAlumno to set
     */
    public void setIdAlumno(int IdAlumno) {
        this.IdAlumno = IdAlumno;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the ApePaterno
     */
    public String getApePaterno() {
        return ApePaterno;
    }

    /**
     * @param ApePaterno the ApePaterno to set
     */
    public void setApePaterno(String ApePaterno) {
        this.ApePaterno = ApePaterno;
    }

    /**
     * @return the ApeMaterno
     */
    public String getApeMaterno() {
        return ApeMaterno;
    }

    /**
     * @param ApeMaterno the ApeMaterno to set
     */
    public void setApeMaterno(String ApeMaterno) {
        this.ApeMaterno = ApeMaterno;
    }

    /**
     * @return the DNI
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * @param DNI the DNI to set
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the Telefono
     */
    public String getTelefono() {
        return Telefono;
    }

    /**
     * @param Telefono the Telefono to set
     */
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    /**
     * @return the Celular
     */
    public String getCelular() {
        return Celular;
    }

    /**
     * @param Celular the Celular to set
     */
    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    /**
     * @return the Estado
     */
    public int getEstado() {
        return Estado;
    }

    /**
     * @param Estado the Estado to set
     */
    public void setEstado(int Estado) {
        this.Estado = Estado;
    }
    
    
}
