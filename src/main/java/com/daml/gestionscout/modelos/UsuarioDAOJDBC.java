/**
 * UsuarioDAOJDBC.java
 *
 * Created on 08-sep-2017, 14:09:36
 * This file is inside the GestionScout project.
 *
 * Copyright(c) 2017 Daniel Moya. All Rights Reserved.
 *
 */
package com.daml.gestionscout.modelos;

import com.daml.gestionscout.clases.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import org.springframework.stereotype.Repository;

/**
 * @author dani
 * @brief
 */
@Repository("UsuarioDAOJDBC")
public class UsuarioDAOJDBC implements UsuarioDAO {

    private static final String CONNPOOLNAME = "java:/comp/env/jdbc/GestionScout"; //Tomcat connection pool
    private DataSource ds = null;

    public UsuarioDAOJDBC() {
        if (ds == null) {
            try {
                Context context = new InitialContext(); //Accedemos al contenedor de Servlets
                ds = (DataSource) context.lookup(CONNPOOLNAME); //Localizamos el pool
            } catch (NamingException ex) {
                Logger.getLogger(UsuarioDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private static Usuario usuarioMapper(ResultSet rs) throws SQLException {
        Usuario u = null;
        try {
            u = new Usuario(rs.getInt("id"),
                            rs.getString("usuario"),
                            rs.getString("pass"),
                            rs.getInt("idgrupo"));
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        }
        return u;
    }

    @Override
    public List<Usuario> listar() {
        String SQL_BUSCATODOS = "SELECT * FROM usuarios";
        List<Usuario> usuarios = new ArrayList<>();
        try (
                Connection conn = ds.getConnection(); //Obtenemos conexión del pool de conexiones
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(SQL_BUSCATODOS);) {
            while (rs.next()) {
                usuarios.add(usuarioMapper(rs));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuarios;
    }

    @Override
    public boolean nuevoUsuario(Usuario u) {
        String SQL_INSERT = "INSERT INTO usuarios (id, usuario, pass, idgrupo)"
                            + "values(?,?,?,?)";
        
        u.setId(listar().size()+1);
        System.out.println("Aquí llega --nuevoUsuario--");
        Integer insertados = 0;
        try (Connection conn = ds.getConnection();
             PreparedStatement stmn = conn.prepareStatement(SQL_INSERT)) {

            stmn.setInt(1, u.getId());
            stmn.setString(2, u.getUsuario());
            stmn.setString(3, u.getPass());
            stmn.setInt(4, u.getGrupo());
            insertados = stmn.executeUpdate();

            registrar(u);

        } catch (SQLException ex) {
            Logger.getLogger("UsuarioDAOJDBC").log(Level.SEVERE, ex.getMessage(), ex);
        }  //Autoclose resources (jdk>7)
        return insertados == 1;
    }

    @Override
    public Usuario encontrarPorID(int id) {
        String SQL_BUSCA = "SELECT * FROM usuarios WHERE dni=?";

        Usuario u = null;
        try (Connection conn = ds.getConnection();
             PreparedStatement stmn = conn.prepareStatement(SQL_BUSCA)) {

            stmn.setInt(1, id);
            try (ResultSet rs = stmn.executeQuery()) {
                rs.next();
                u = usuarioMapper(rs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAOJDBC.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        }
        return u;
    }

    @Override
    public Usuario encontrarPorLogin(String user) {
        String SQL_BUSCA = "SELECT * FROM usuarios WHERE usuario=?";

        Usuario u = null;
        try (Connection conn = ds.getConnection();
             PreparedStatement stmn = conn.prepareStatement(SQL_BUSCA)) {

            stmn.setString(1, user);
            try (ResultSet rs = stmn.executeQuery()) {
                rs.next();
                u = usuarioMapper(rs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAOJDBC.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        }
        return u;
    }

    public boolean registrar(Usuario u) {
        System.out.println("Aquí llega --registrar--");
        String SQL_INSERT = "INSERT INTO users (usuario, clave) VALUES(?,?)";
        Integer insertados = 0;

        try (Connection conn = ds.getConnection();
             PreparedStatement stmn = conn.prepareStatement(SQL_INSERT)) {
            stmn.setString(1, u.getUsuario());
            stmn.setString(2, u.getPass());
            insertados = stmn.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger("UsuarioDAOJDBC").log(Level.SEVERE, ex.getMessage(), ex);
        }  //Autoclose resources (jdk>7)

        SQL_INSERT = "INSERT INTO roles (usuario, rol) VALUES(?,?)";

        try (Connection conn = ds.getConnection();
             PreparedStatement stmn = conn.prepareStatement(SQL_INSERT)) {
            stmn.setString(1, u.getUsuario());
            stmn.setString(2, "USUARIO");
            insertados = stmn.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger("UsuarioDAOJDBC").log(Level.SEVERE, ex.getMessage(), ex);
        }  //Autoclose resources (jdk>7)

        return insertados == 1;
    }

}
