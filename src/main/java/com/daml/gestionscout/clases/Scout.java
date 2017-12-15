/**
 * Scout.java
 *
 * Created on 08-sep-2017, 11:02:49
 * This file is inside the GestionScout project.
 *
 * Copyright(c) 2017 Daniel Moya. All Rights Reserved.
 *
 */

package com.daml.gestionscout.clases;

import java.util.Date;
import javax.validation.constraints.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author dani
 * @brief
 */
public class Scout extends Persona {
    /* Parte padres */
    @NotNull(message="No puede estar vacío")
    private String situacionParental;
    
    /* Parte padres. Padre */
    @NotNull(message="No puede estar vacío")
    private String nombrePadre;
    @NotNull(message="No puede estar vacío")
    private String apellidosPadre;
    private String emailPadre;
    private int    movilPadre;
    
    /* Parte padres. Madre */
    @NotNull(message="No puede estar vacío")
    private String nombreMadre;
    @NotNull(message="No puede estar vacío")
    private String apellidosMadre;
    private String emailMadre;
    private int    movilMadre;
    
    public Scout() {
        situacionParental = "";
        
        nombrePadre = "";
        apellidosPadre = "";
        emailPadre = "";
        movilPadre = 0;
        
        nombreMadre = "";
        apellidosMadre = "";
        emailMadre = "";
        movilMadre = 0;
    }
    
    public Scout (int _id, boolean _activo,
                    MultipartFile _foto, String _dni, int _seguridadSocial, int _seguridadSocialInt,
                    String _nombre, String _apellidos, boolean _sexo, Date _fechaNacimiento, String _nacionalidad,
                    String _direccion, int _codigoPostal, String _localidad, String _provincia,
                    int _telefono, int _movil, String _email,
                    int _grupo, boolean _censable,
                    String _nivel, String _titulacion,
                    String _alergias, String _enfermedades, MultipartFile _cartilla, MultipartFile _fichaMedica, MultipartFile _vacunas, MultipartFile _lopd,
                    String _rama, boolean _censoPagado, Date _fechaIngreso, Date _fechaPromesa,
                    String _situacionParental,
                    String _nombrePadre, String _apellidosPadre, String _emailPadre, int _movilPadre,
                    String _nombreMadre, String _apellidosMadre, String _emailMadre, int _movilMadre) {
        super(_id, _activo,
              _foto, _dni, _seguridadSocial, _seguridadSocialInt, 
              _nombre, _apellidos, _sexo, _fechaNacimiento, _nacionalidad, 
              _direccion, _codigoPostal, _localidad, _provincia,
              _telefono, _movil, _email, 
              _grupo, _censable, 
              _nivel, _titulacion, 
              _alergias, _enfermedades, _cartilla, _fichaMedica, _vacunas, _lopd, 
              _rama, _censoPagado, _fechaIngreso, _fechaPromesa);
        
        situacionParental = _situacionParental;
        
        nombrePadre = _nombrePadre;
        apellidosPadre = _apellidosPadre;
        emailPadre = _emailPadre;
        movilPadre = _movilPadre;
        
        nombreMadre = _nombreMadre;
        apellidosMadre = _apellidosMadre;
        emailMadre = _emailMadre;
        movilMadre = _movilMadre;
    }

    /**
     * @return the situacionParental
     */
    public String getSituacionParental() {
        return situacionParental;
    }

    /**
     * @param situacionParental the situacionParental to set
     */
    public void setSituacionParental(String situacionParental) {
        this.situacionParental = situacionParental;
    }

    /**
     * @return the nombrePadre
     */
    public String getNombrePadre() {
        return nombrePadre;
    }

    /**
     * @param nombrePadre the nombrePadre to set
     */
    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    /**
     * @return the apellidosPadre
     */
    public String getApellidosPadre() {
        return apellidosPadre;
    }

    /**
     * @param apellidosPadre the apellidosPadre to set
     */
    public void setApellidosPadre(String apellidosPadre) {
        this.apellidosPadre = apellidosPadre;
    }

    /**
     * @return the emailPadre
     */
    public String getEmailPadre() {
        return emailPadre;
    }

    /**
     * @param emailPadre the emailPadre to set
     */
    public void setEmailPadre(String emailPadre) {
        this.emailPadre = emailPadre;
    }

    /**
     * @return the movilPadre
     */
    public int getMovilPadre() {
        return movilPadre;
    }

    /**
     * @param movilPadre the movilPadre to set
     */
    public void setMovilPadre(int movilPadre) {
        this.movilPadre = movilPadre;
    }

    /**
     * @return the nombreMadre
     */
    public String getNombreMadre() {
        return nombreMadre;
    }

    /**
     * @param nombreMadre the nombreMadre to set
     */
    public void setNombreMadre(String nombreMadre) {
        this.nombreMadre = nombreMadre;
    }

    /**
     * @return the apellidosMadre
     */
    public String getApellidosMadre() {
        return apellidosMadre;
    }

    /**
     * @param apellidosMadre the apellidosMadre to set
     */
    public void setApellidosMadre(String apellidosMadre) {
        this.apellidosMadre = apellidosMadre;
    }

    /**
     * @return the emailMadre
     */
    public String getEmailMadre() {
        return emailMadre;
    }

    /**
     * @param emailMadre the emailMadre to set
     */
    public void setEmailMadre(String emailMadre) {
        this.emailMadre = emailMadre;
    }

    /**
     * @return the movilMadre
     */
    public int getMovilMadre() {
        return movilMadre;
    }

    /**
     * @param movilMadre the movilMadre to set
     */
    public void setMovilMadre(int movilMadre) {
        this.movilMadre = movilMadre;
    }
    
}
