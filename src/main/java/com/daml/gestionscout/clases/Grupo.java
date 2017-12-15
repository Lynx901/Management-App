/**
 * Grupo.java
 *
 * Created on 08-sep-2017, 10:53:51
 * This file is inside the GestionScout project.
 *
 * Copyright(c) 2017 Daniel Moya. All Rights Reserved.
 *
 */

package com.daml.gestionscout.clases;

import java.util.Date;
import javax.validation.constraints.*;

/**
 * @author dani
 * @brief
 */
public class Grupo {
    private int id;
    private boolean activo;
    
    /* Datos generales */
    @NotNull(message="No puede estar vacío")
    private String nombre;
    @NotNull(message="No puede estar vacío")
    private String diocesana;
    private Date   fechaCreacion;
    
    /* Localización */
    @NotNull(message="No puede estar vacío")
    private String direccion;
    @NotNull(message="No puede estar vacío")
    private int    codigoPostal;
    @NotNull(message="No puede estar vacío")
    private String localidad;
    @NotNull(message="No puede estar vacío")
    private String provincia;
    
    /* Contacto */
    private int     telefono;
    @NotNull(message="No puede estar vacío")
    private String  email;
    private String  web;
    
    /* Otros datos */
    @NotNull(message="No puede estar vacío")
    private String entidadAcogedora;
    @NotNull(message="No puede estar vacío")
    private String nombreEntidadAcogedora;
    
    /**
     * Constructor por defecto
     */
    public Grupo() {
        id     = 0;
        activo = true;
        
        nombre = "";
        diocesana = "";
        fechaCreacion = null;
        
        direccion = "";
        codigoPostal = 0;
        localidad = "";
        provincia = "";
        
        telefono = 0;
        email = "";
        web = "";
        
        entidadAcogedora = "";
        nombreEntidadAcogedora = "";
    }
    
    public Grupo(int _id, boolean _activo, 
                 String _nombre, String _diocesana, Date _fechaCreacion, 
                 String _direccion, int _codigoPostal, String _localidad, String _provincia,
                 int _telefono, String _email, String _web,
                 String _entidadAcogedora, String _nombreEntidadAcogedora) {
        id     = _id;
        activo = _activo;
        
        nombre = _nombre;
        diocesana = _diocesana;
        fechaCreacion = _fechaCreacion;
        
        direccion = _direccion;
        codigoPostal = _codigoPostal;
        localidad = _localidad;
        provincia = _provincia;
        
        telefono = _telefono;
        email = _email;
        web = _web;
        
        entidadAcogedora = _entidadAcogedora;
        nombreEntidadAcogedora = _nombreEntidadAcogedora;
    }

    public Grupo(int aInt, boolean aBoolean, String string, String string0, java.sql.Date date, String string1, int aInt0, String string2, String string3, int aInt1, String string4, String string5) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the activo
     */
    public boolean isActivo() {
        return activo;
    }

    /**
     * @param activo the activo to set
     */
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the diocesana
     */
    public String getDiocesana() {
        return diocesana;
    }

    /**
     * @param diocesana the diocesana to set
     */
    public void setDiocesana(String diocesana) {
        this.diocesana = diocesana;
    }

    /**
     * @return the fechaCreacion
     */
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * @param fechaCreacion the fechaCreacion to set
     */
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the codigoPostal
     */
    public int getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * @param codigoPostal the codigoPostal to set
     */
    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    /**
     * @return the localidad
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * @param localidad the localidad to set
     */
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    /**
     * @return the provincia
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * @param provincia the provincia to set
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the web
     */
    public String getWeb() {
        return web;
    }

    /**
     * @param web the web to set
     */
    public void setWeb(String web) {
        this.web = web;
    }

    /**
     * @return the entidadAcogedora
     */
    public String getEntidadAcogedora() {
        return entidadAcogedora;
    }

    /**
     * @param entidadAcogedora the entidadAcogedora to set
     */
    public void setEntidadAcogedora(String entidadAcogedora) {
        this.entidadAcogedora = entidadAcogedora;
    }

    /**
     * @return the nombreEntidadAcogedora
     */
    public String getNombreEntidadAcogedora() {
        return nombreEntidadAcogedora;
    }

    /**
     * @param nombreEntidadAcogedora the nombreEntidadAcogedora to set
     */
    public void setNombreEntidadAcogedora(String nombreEntidadAcogedora) {
        this.nombreEntidadAcogedora = nombreEntidadAcogedora;
    }
        
}
