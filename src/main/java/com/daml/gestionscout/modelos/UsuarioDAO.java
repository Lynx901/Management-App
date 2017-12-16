/**
 * UsuarioDAO.java
 *
 * Created on 08-sep-2017, 14:07:25
 * This file is inside the GestionScout project.
 *
 * Copyright(c) 2017 Daniel Moya. All Rights Reserved.
 *
 */

package com.daml.gestionscout.modelos;

import com.daml.gestionscout.clases.*;
import java.util.List;

/**
 * @author dani
 * @brief
 */
public interface UsuarioDAO {
    
    List<Usuario> listar();
    boolean nuevoUsuario(Usuario u);
    Usuario encontrarPorID(int id);
    Usuario encontrarPorLogin(String user);
    boolean eliminar(Usuario u);
 
}
