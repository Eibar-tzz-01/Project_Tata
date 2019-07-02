/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

/**
 *
 * @author eibar
 */
public class Persona {
    private int id;
    private String nombre;
    private String apaterno;
    private String amaterno;
    private Date fechanac;
    private double percepcion;

    public Persona(int id, String nombre, String apaterno, String amaterno, Date fechanac, double percepcion) {
        this.id = id;
        this.nombre = nombre;
        this.apaterno = apaterno;
        this.amaterno = amaterno;
        this.fechanac = fechanac;
        this.percepcion = percepcion;
    }
    
    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApaterno() {
        return apaterno;
    }

    public void setApaterno(String apaterno) {
        this.apaterno = apaterno;
    }

    public String getAmaterno() {
        return amaterno;
    }

    public void setAmaterno(String amaterno) {
        this.amaterno = amaterno;
    }

    public Date getFechanac() {
        return fechanac;
    }

    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }

    public double getPercepcion() {
        return percepcion;
    }

    public void setPercepcion(double percepcion) {
        this.percepcion = percepcion;
    }
    
    
}
