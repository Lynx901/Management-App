/**
 * UsuarioSpringController.java
 *
 * Created on 08-sep-2017, 14:01:56
 * This file is inside the GestionScout project.
 *
 * Copyright(c) 2017 Daniel Moya. All Rights Reserved.
 *
 */

package com.daml.gestionscout.controladores;

import com.daml.gestionscout.modelos.*;
import com.daml.gestionscout.clases.*;
import java.io.IOException;
import java.security.Principal;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


/**
 * @author dani
 * @brief
 */
@Controller
@RequestMapping("/admin")
@SessionAttributes("usuario")
public class UsuarioSpringController {

    @Autowired
    @Qualifier("UsuarioDAOJDBC")
    private UsuarioDAO usuariosDAO;

    public UsuarioSpringController() {
    }

    @ModelAttribute
    private void configView(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
        //Common variables for Views
        model.addAttribute("srvUrl", request.getContextPath() + request.getServletPath() + "/admin");
        model.addAttribute("imgUrl", request.getContextPath() + "/img");
    }
    
    /* GET para mostrar el index*/
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homepage() {
        return "index";
    }
    

    /* GET para mostrar el perfil*/
    @RequestMapping(value = "/perfil", method = RequestMethod.GET)
    public String verUsuario(ModelMap model,
                             Principal principal) {
        Usuario u = usuariosDAO.encontrarPorLogin(principal.getName());
        model.addAttribute("usuario", u);
        return "admin/perfil";
    }
    
    /* POST para eliminar un usuario */
    @RequestMapping(value = "/perfil", method = RequestMethod.POST)
    public String editarUsuario(@ModelAttribute("usuario") Usuario u,
                                BindingResult result,
                                ModelMap model) {
        usuariosDAO.eliminar(u);
        return "index";
    }


    /* GET para registrar un usuario */
    @RequestMapping(value = "/registro", method = RequestMethod.GET)
    public String registroUsuario(ModelMap model) {
        model.addAttribute("usuario", new Usuario());
        
        return "admin/registro";
    }
    
    /* POST para registrar un usuario */
    @RequestMapping(value = "/registro", method = RequestMethod.POST)
    public String registroUsuario(@ModelAttribute("usuario") @Valid Usuario u,
                                  BindingResult result, 
                                  ModelMap model) {
        String vista = "redirect:perfil"; 
        if (!result.hasErrors()) {
            usuariosDAO.nuevoUsuario(u);
            model.clear();
            model.addAttribute("usuario", u);
        }else {
            vista = "admin/registro";
        }
        return vista;
    }
}