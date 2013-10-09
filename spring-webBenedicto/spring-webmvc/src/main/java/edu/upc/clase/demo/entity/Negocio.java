/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.clase.demo.entity;
import java.io.Serializable;
/**
 *
 * @author alumno
 */

public class Negocio implements Serializable {
    private Integer id;
    private String nombre;
    private String website;
    private String facebook;
    private String twitter;
    
    public Negocio(){
        
    }
    public Negocio(String nombre,String website,String facebook, String twitter) {
        this.nombre = nombre;
        this.website = website;
        this.facebook = facebook;
        this.twitter = twitter;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }
    
}
