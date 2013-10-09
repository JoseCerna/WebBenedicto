/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.entity;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author jose_cerna
 */
public class GrupoEstudio implements Serializable {
    private int IdGrupoEstudio;
    private Academia OAcademia;
    private Curso OCurso;
    private Profesor OProfesor;
    private String Nombre;
    private Date FechaInicio;
    private Date FechaFin;
    private int Estado;
    
    public GrupoEstudio(){ }
    
    public GrupoEstudio(Academia oAcademia,Curso OCurso,Profesor OProfesor,String Nombre,Date FechaInicio,Date FechaFin,int Estado){ 
        this.OAcademia = oAcademia;
        this.OCurso = OCurso;
        this.OProfesor = OProfesor;
        this.Nombre = Nombre;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
        this.Estado = Estado;
    }
    
    /**
     * @return the IdGrupoEstudio
     */
    public int getIdGrupoEstudio() {
        return IdGrupoEstudio;
    }

    /**
     * @param IdGrupoEstudio the IdGrupoEstudio to set
     */
    public void setIdGrupoEstudio(int IdGrupoEstudio) {
        this.IdGrupoEstudio = IdGrupoEstudio;
    }

    /**
     * @return the OAcademia
     */
    public Academia getOAcademia() {
        return OAcademia;
    }

    /**
     * @param OAcademia the OAcademia to set
     */
    public void setOAcademia(Academia OAcademia) {
        this.OAcademia = OAcademia;
    }

    /**
     * @return the OCurso
     */
    public Curso getOCurso() {
        return OCurso;
    }

    /**
     * @param OCurso the OCurso to set
     */
    public void setOCurso(Curso OCurso) {
        this.OCurso = OCurso;
    }

    /**
     * @return the OProfesor
     */
    public Profesor getOProfesor() {
        return OProfesor;
    }

    /**
     * @param OProfesor the OProfesor to set
     */
    public void setOProfesor(Profesor OProfesor) {
        this.OProfesor = OProfesor;
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
     * @return the FechaInicio
     */
    public Date getFechaInicio() {
        return FechaInicio;
    }

    /**
     * @param FechaInicio the FechaInicio to set
     */
    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    /**
     * @return the FechaFin
     */
    public Date getFechaFin() {
        return FechaFin;
    }

    /**
     * @param FechaFin the FechaFin to set
     */
    public void setFechaFin(Date FechaFin) {
        this.FechaFin = FechaFin;
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
