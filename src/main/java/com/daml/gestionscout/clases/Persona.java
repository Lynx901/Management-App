/**
 * Persona.java
 *
 * Created on 08-sep-2017, 10:43:53
 * This file is inside the GestionScout project.
 *
 * Copyright(c) 2017 Daniel Moya. All Rights Reserved.
 *
 */

package com.daml.gestionscout.clases;

import java.util.Date; /* Para la fecha de nacimiento */
import org.springframework.web.multipart.MultipartFile; /* Para la foto de perfil */
import javax.validation.constraints.*; /* Para la validación de datos */

/**
 * @author dani
 * @brief
 */
public class Persona {
    
    private int id;
    private boolean activo;
    
    /* Parte general. Identificación */
    private MultipartFile foto;

    @NotNull(message="No puede estar vacío")
    private String  dni;
    private int     seguridadSocial;
    private int     seguridadSocialInt;
    
    /* Parte general. Datos Personales */
    @NotNull(message="No puede estar vacío")
    private String  nombre;
    @NotNull(message="No puede estar vacío")
    private String  apellidos;
    private boolean sexo;
    @NotNull(message="No puede estar vacío")
    private Date    fechaNacimiento;
    private String  nacionalidad;
    
    /* Parte general. Lugar de Residencia */
    @NotNull(message="No puede estar vacío")
    private String direccion;
    @NotNull(message="No puede estar vacío")
    private int    codigoPostal;
    @NotNull(message="No puede estar vacío")
    private String localidad;
    @NotNull(message="No puede estar vacío")
    private String provincia;
    
    /* Parte general. Datos de Contacto */
    private int     telefono;
    private int     movil;
    @NotNull(message="No puede estar vacío")
    private String  email;
    
    /* Parte del censo */
    private int     grupo;
    private boolean censable;
    
    /* Parte formación. Estudios */
    @NotNull(message="No puede estar vacío")
    private String nivel;
    private String titulacion;
    
    /* Parte documentación. */
    private String        alergias;
    private String        enfermedades;
    private MultipartFile cartilla;
    private MultipartFile fichaMedica;
    private MultipartFile vacunas;
    private MultipartFile lopd;
    
    /* Parte otros. */
    private String  rama;
    private boolean censoPagado;
    private Date    fechaIngreso;
    private Date    fechaPromesa;

    /**
     * Constructor por defecto
     */
    public Persona (){
        id = 0;
        activo = true;
        
        foto = null;
        
        dni = "";
        seguridadSocial = 0;
        seguridadSocialInt = 0;
        
        nombre = "";
        apellidos = "";
        sexo = false;
        fechaNacimiento = null;
        nacionalidad = "";
        
        direccion = "";
        codigoPostal = 0;
        localidad = "";
        provincia = "";
        
        telefono = 0;
        movil = 0;
        email = "";
        
        grupo = 0;
        censable = true;
        
        nivel = "";
        titulacion = "";
        
        alergias = "";
        enfermedades = "";
        cartilla = null;
        fichaMedica = null;
        vacunas = null;
        lopd = null;
        
        rama = "";
        censoPagado = false;
        fechaIngreso = null;
        fechaPromesa = null;
                
    }
    
    public Persona (int _id, boolean _activo,
                    MultipartFile _foto, String _dni, int _seguridadSocial, int _seguridadSocialInt,
                    String _nombre, String _apellidos, boolean _sexo, Date _fechaNacimiento, String _nacionalidad,
                    String _direccion, int _codigoPostal, String _localidad, String _provincia,
                    int _telefono, int _movil, String _email,
                    int _grupo, boolean _censable,
                    String _nivel, String _titulacion,
                    String _alergias, String _enfermedades, MultipartFile _cartilla, MultipartFile _fichaMedica, MultipartFile _vacunas, MultipartFile _lopd,
                    String _rama, boolean _censoPagado, Date _fechaIngreso, Date _fechaPromesa){
        id = _id;
        activo = _activo;
        
        foto = _foto;
        
        dni = _dni;
        seguridadSocial = _seguridadSocial;
        seguridadSocialInt = _seguridadSocialInt;
        
        nombre = _nombre;
        apellidos = _apellidos;
        sexo = _sexo;
        fechaNacimiento = _fechaNacimiento;
        nacionalidad = _nacionalidad;
        
        direccion = _direccion;
        codigoPostal = _codigoPostal;
        localidad = _localidad;
        provincia = _provincia;
        
        telefono = _telefono;
        movil = _movil;
        email = _email;
        
        grupo = _grupo;
        censable = _censable;
        
        nivel = _nivel;
        titulacion = _titulacion;
        
        alergias = _alergias;
        enfermedades = _enfermedades;
        cartilla = _cartilla;
        fichaMedica = _fichaMedica;
        vacunas = _vacunas;
        lopd = _lopd;
        
        rama = _rama;
        censoPagado = _censoPagado;
        fechaIngreso = _fechaIngreso;
        fechaPromesa = _fechaPromesa;
              
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
     * @return the foto
     */
    public MultipartFile getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(MultipartFile foto) {
        this.foto = foto;
    }

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return the seguridadSocial
     */
    public int getSeguridadSocial() {
        return seguridadSocial;
    }

    /**
     * @param seguridadSocial the seguridadSocial to set
     */
    public void setSeguridadSocial(int seguridadSocial) {
        this.seguridadSocial = seguridadSocial;
    }

    /**
     * @return the seguridadSocialInt
     */
    public int getSeguridadSocialInt() {
        return seguridadSocialInt;
    }

    /**
     * @param seguridadSocialInt the seguridadSocialInt to set
     */
    public void setSeguridadSocialInt(int seguridadSocialInt) {
        this.seguridadSocialInt = seguridadSocialInt;
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
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the sexo
     */
    public boolean isSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the nacionalidad
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * @param nacionalidad the nacionalidad to set
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
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
     * @return the movil
     */
    public int getMovil() {
        return movil;
    }

    /**
     * @param movil the movil to set
     */
    public void setMovil(int movil) {
        this.movil = movil;
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
     * @return the grupo
     */
    public int getGrupo() {
        return grupo;
    }

    /**
     * @param grupo the grupo to set
     */
    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    /**
     * @return the censable
     */
    public boolean isCensable() {
        return censable;
    }

    /**
     * @param censable the censable to set
     */
    public void setCensable(boolean censable) {
        this.censable = censable;
    }

    /**
     * @return the nivel
     */
    public String getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the titulacion
     */
    public String getTitulacion() {
        return titulacion;
    }

    /**
     * @param titulacion the titulacion to set
     */
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    /**
     * @return the alergias
     */
    public String getAlergias() {
        return alergias;
    }

    /**
     * @param alergias the alergias to set
     */
    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    /**
     * @return the enfermedades
     */
    public String getEnfermedades() {
        return enfermedades;
    }

    /**
     * @param enfermedades the enfermedades to set
     */
    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    /**
     * @return the cartilla
     */
    public MultipartFile getCartilla() {
        return cartilla;
    }

    /**
     * @param cartilla the cartilla to set
     */
    public void setCartilla(MultipartFile cartilla) {
        this.cartilla = cartilla;
    }

    /**
     * @return the fichaMedica
     */
    public MultipartFile getFichaMedica() {
        return fichaMedica;
    }

    /**
     * @param fichaMedica the fichaMedica to set
     */
    public void setFichaMedica(MultipartFile fichaMedica) {
        this.fichaMedica = fichaMedica;
    }

    /**
     * @return the vacunas
     */
    public MultipartFile getVacunas() {
        return vacunas;
    }

    /**
     * @param vacunas the vacunas to set
     */
    public void setVacunas(MultipartFile vacunas) {
        this.vacunas = vacunas;
    }

    /**
     * @return the lopd
     */
    public MultipartFile getLopd() {
        return lopd;
    }

    /**
     * @param lopd the lopd to set
     */
    public void setLopd(MultipartFile lopd) {
        this.lopd = lopd;
    }

    /**
     * @return the rama
     */
    public String getRama() {
        return rama;
    }

    /**
     * @param rama the rama to set
     */
    public void setRama(String rama) {
        this.rama = rama;
    }

    /**
     * @return the censoPagado
     */
    public boolean isCensoPagado() {
        return censoPagado;
    }

    /**
     * @param censoPagado the censoPagado to set
     */
    public void setCensoPagado(boolean censoPagado) {
        this.censoPagado = censoPagado;
    }

    /**
     * @return the fechaIngreso
     */
    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * @param fechaIngreso the fechaIngreso to set
     */
    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    /**
     * @return the fechaPromesa
     */
    public Date getFechaPromesa() {
        return fechaPromesa;
    }

    /**
     * @param fechaPromesa the fechaPromesa to set
     */
    public void setFechaPromesa(Date fechaPromesa) {
        this.fechaPromesa = fechaPromesa;
    }
    
    
}
