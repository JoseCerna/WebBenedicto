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
public class Curso implements Serializable {
    private int idCurso;
    private String nombreCurso;
    private int nroHoras;
    private double costo;
    private int estado;
    
    public Curso(){
        
    }
    
    public Curso(String NombreCurso,int horas,double costo,int estado){
        this.nombreCurso = NombreCurso;
        this.nroHoras = horas;
        this.costo = costo;
        this.estado = estado;
    }
    
    /**
     * @return the idCurso
     */
    public int getidCurso() {
        return idCurso;
    }

    /**
     * @param idCurso the idCurso to set
     */
    public void setidCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    /**
     * @return the nombreCurso
     */
    public String getnombreCurso() {
        return nombreCurso;
    }

    /**
     * @param nombreCurso the nombreCurso to set
     */
    public void setnombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    /**
     * @return the nroHoras
     */
    public int getnroHoras() {
        return nroHoras;
    }

    /**
     * @param nroHoras the nroHoras to set
     */
    public void setnroHoras(int nroHoras) {
        this.nroHoras = nroHoras;
    }

    /**
     * @return the costo
     */
    public double getcosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setcosto(double costo) {
        this.costo = costo;
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
