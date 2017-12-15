/**
 * GruposDAO.java
 *
 * Created on 08-sep-2017, 12:00:40
 * This file is inside the GestionScout project.
 *
 * Copyright(c) 2017 Daniel Moya. All Rights Reserved.
 *
 */

package com.daml.gestionscout.modelos;

import java.util.List;
import com.daml.gestionscout.clases.*;

/**
 * @author dani
 * @brief
 */
public interface GruposDAO {
    List<Grupo> listar();
    boolean nuevoGrupo(Grupo g);
    Grupo encontrarID(int id);
    Grupo encontrarNombre(String nombre);
    boolean editar(Grupo g);
    boolean borrar(int id);
}
