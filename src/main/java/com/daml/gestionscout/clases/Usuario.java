/**
 * Usuario.java
 *
 * Created on 08-sep-2017, 14:04:28
 * This file is inside the GestionScout project.
 *
 * Copyright(c) 2017 Daniel Moya. All Rights Reserved.
 *
 */

package com.daml.gestionscout.clases;

import javax.validation.constraints.NotNull;

/**
 * @author dani
 * @brief
 */
public class Usuario {
    private int id;
    
    @NotNull(message="No puede estar vacío")
    private String usuario;
    @NotNull(message="No puede estar vacío")
    private String pass;
    
    private int grupo;
    
    public Usuario() {
        id = 0;
        usuario = "";
        pass = "";
        grupo = -1;
    }
    
    public Usuario(int _id, String _usuario, String _pass, int _grupo) {
        id = _id;
        usuario = _usuario;
        pass = _pass;
        grupo = _grupo;
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
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @return the Grupo
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
}
