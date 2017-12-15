/**
 * Responsable.java
 *
 * Created on 08-sep-2017, 10:58:18
 * This file is inside the GestionScout project.
 *
 * Copyright(c) 2017 Daniel Moya. All Rights Reserved.
 *
 */

package com.daml.gestionscout.clases;

import java.util.Date;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author dani
 * @brief
 */
public class Responsable extends Persona {
    /* Parte formación. Formación Scout */
    private boolean previa;
    private boolean responUnidad;
    private boolean coordinadorRama;
    private boolean adf;
    private boolean ictys;
    private boolean cra;
    
    /* Parte formación. Formación Oficial */
    private boolean mtl;
    private boolean formDeForm;
    private boolean necesidadesEsp;
    private boolean directorForm;
    
    /**
     * Constructor por defecto
     */
    public Responsable() {
        super();
        
        previa = false;
        responUnidad = false;
        coordinadorRama = false;
        adf = false;
        ictys = false;
        cra = false;
        
        mtl = false;
        formDeForm = false;
        necesidadesEsp = false;
        directorForm = false;
    }
    
    public Responsable(int _id, boolean _activo,
                    MultipartFile _foto, String _dni, int _seguridadSocial, int _seguridadSocialInt,
                    String _nombre, String _apellidos, boolean _sexo, Date _fechaNacimiento, String _nacionalidad,
                    String _direccion, int _codigoPostal, String _localidad, String _provincia,
                    int _telefono, int _movil, String _email,
                    int _grupo, boolean _censable,
                    String _nivel, String _titulacion,
                    String _alergias, String _enfermedades, MultipartFile _cartilla, MultipartFile _fichaMedica, MultipartFile _vacunas, MultipartFile _lopd,
                    String _rama, boolean _censoPagado, Date _fechaIngreso, Date _fechaPromesa,
                    boolean _previa, boolean _responUnidad, boolean _coordinadorRama, boolean _adf, boolean _ictys, boolean _cra,
                    boolean _mtl, boolean _formDeForm, boolean _necesidadesEsp, boolean _directorForm) {
        super(_id, _activo,
              _foto, _dni, _seguridadSocial, _seguridadSocialInt, 
              _nombre, _apellidos, _sexo, _fechaNacimiento, _nacionalidad, 
              _direccion, _codigoPostal, _localidad, _provincia,
              _telefono, _movil, _email, 
              _grupo, _censable, 
              _nivel, _titulacion, 
              _alergias, _enfermedades, _cartilla, _fichaMedica, _vacunas, _lopd, 
              _rama, _censoPagado, _fechaIngreso, _fechaPromesa);
        
        previa = _previa;
        responUnidad = _responUnidad;
        coordinadorRama = _coordinadorRama;
        adf = _adf;
        ictys = _ictys;
        cra = _cra;
        
        mtl = _mtl;
        formDeForm = _formDeForm;
        necesidadesEsp = _necesidadesEsp;
        directorForm = _directorForm;
        
    }

    /**
     * @return the previa
     */
    public boolean isPrevia() {
        return previa;
    }

    /**
     * @param previa the previa to set
     */
    public void setPrevia(boolean previa) {
        this.previa = previa;
    }

    /**
     * @return the responUnidad
     */
    public boolean isResponUnidad() {
        return responUnidad;
    }

    /**
     * @param responUnidad the responUnidad to set
     */
    public void setResponUnidad(boolean responUnidad) {
        this.responUnidad = responUnidad;
    }

    /**
     * @return the coordinadorRama
     */
    public boolean isCoordinadorRama() {
        return coordinadorRama;
    }

    /**
     * @param coordinadorRama the coordinadorRama to set
     */
    public void setCoordinadorRama(boolean coordinadorRama) {
        this.coordinadorRama = coordinadorRama;
    }

    /**
     * @return the adf
     */
    public boolean isAdf() {
        return adf;
    }

    /**
     * @param adf the adf to set
     */
    public void setAdf(boolean adf) {
        this.adf = adf;
    }

    /**
     * @return the ictys
     */
    public boolean isIctys() {
        return ictys;
    }

    /**
     * @param ictys the ictys to set
     */
    public void setIctys(boolean ictys) {
        this.ictys = ictys;
    }

    /**
     * @return the cra
     */
    public boolean isCra() {
        return cra;
    }

    /**
     * @param cra the cra to set
     */
    public void setCra(boolean cra) {
        this.cra = cra;
    }

    /**
     * @return the mtl
     */
    public boolean isMtl() {
        return mtl;
    }

    /**
     * @param mtl the mtl to set
     */
    public void setMtl(boolean mtl) {
        this.mtl = mtl;
    }

    /**
     * @return the formDeForm
     */
    public boolean isFormDeForm() {
        return formDeForm;
    }

    /**
     * @param formDeForm the formDeForm to set
     */
    public void setFormDeForm(boolean formDeForm) {
        this.formDeForm = formDeForm;
    }

    /**
     * @return the necesidadesEsp
     */
    public boolean isNecesidadesEsp() {
        return necesidadesEsp;
    }

    /**
     * @param necesidadesEsp the necesidadesEsp to set
     */
    public void setNecesidadesEsp(boolean necesidadesEsp) {
        this.necesidadesEsp = necesidadesEsp;
    }

    /**
     * @return the directorForm
     */
    public boolean isDirectorForm() {
        return directorForm;
    }

    /**
     * @param directorForm the directorForm to set
     */
    public void setDirectorForm(boolean directorForm) {
        this.directorForm = directorForm;
    }
}
