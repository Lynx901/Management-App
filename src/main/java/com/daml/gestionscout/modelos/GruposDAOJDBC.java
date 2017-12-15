/**
 * GruposDAOJDBC.java
 *
 * Created on 08-sep-2017, 11:59:46
 * This file is inside the GestionScout project.
 *
 * Copyright(c) 2017 Daniel Moya. All Rights Reserved.
 *
 */
package com.daml.gestionscout.modelos;

import com.daml.gestionscout.clases.Grupo;
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
@Repository("GruposDAOJDBC")
public class GruposDAOJDBC implements GruposDAO {

    private static final String CONNPOOLNAME = "java:/comp/env/jdbc/GestionScout"; //Tomcat connection pool
    private DataSource ds = null;

    public GruposDAOJDBC() {
        if (ds == null) {
            try {
                Context context = new InitialContext(); //Accedemos al contenedor de Servlets
                ds = (DataSource) context.lookup(CONNPOOLNAME); //Localizamos el pool
            } catch (NamingException ex) {
                Logger.getLogger(GruposDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private static Grupo gruposMapper(ResultSet rs) throws SQLException {
        Grupo g = null;
        try {
            g = new Grupo(rs.getInt("id"),
                          rs.getBoolean("activo"),
                          rs.getString("nombre"),
                          rs.getString("diocesana"),
                          rs.getDate("fechaCreacion"),
                          rs.getString("direccion"),
                          rs.getInt("codigoPostal"),
                          rs.getString("localidad"),
                          rs.getString("provincia"),
                          rs.getInt("telefono"),
                          rs.getString("email"),
                          rs.getString("web"));
        } catch (SQLException ex) {
            Logger.getLogger(GruposDAO.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        }
        return g;
    }

    @Override
    public List<Grupo> listar() {
        String SQL_BUSCATODOS = "SELECT * FROM grupos";
        List<Grupo> grupos = new ArrayList<>();
        if (ds == null) {
            try {
                Context context = new InitialContext(); //Accedemos al contenedor de Servlets
                ds = (DataSource) context.lookup(CONNPOOLNAME); //Localizamos el pool
            } catch (NamingException ex) {
                Logger.getLogger(GruposDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try (
                Connection conn = ds.getConnection(); //Obtenemos conexión del pool de conexiones
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(SQL_BUSCATODOS);) {
            while (rs.next()) {
                grupos.add(gruposMapper(rs));
            }
        } catch (SQLException ex) {
            Logger.getLogger(GruposDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return grupos;
    }

    @Override
    public boolean nuevoGrupo(Grupo g) {
        g.setId(listar().size() + 1);

        String SQL_INSERT = "INSERT INTO grupos (id, activo, nombre, diocesana, fecha_creacion, direccion, cp, localidad, provincia, telefono, email, web)"
                            + " VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        int insertados = 0;
        try (Connection conn = ds.getConnection();
             PreparedStatement stmn = conn.prepareStatement(SQL_INSERT)) {

            stmn.setInt(1, g.getId());
            stmn.setBoolean(2, g.isActivo());
            stmn.setString(3, g.getNombre());
            stmn.setString(4, g.getDiocesana());
            java.sql.Date fecha = new java.sql.Date(g.getFechaCreacion().getTime());
            stmn.setDate(5, fecha);
            stmn.setString(6, g.getDireccion());
            stmn.setInt(7, g.getCodigoPostal());
            stmn.setString(8, g.getLocalidad());
            stmn.setString(9, g.getProvincia());
            stmn.setInt(10, g.getTelefono());
            stmn.setString(11, g.getEmail());
            stmn.setString(12, g.getWeb());

            insertados = stmn.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger("GruposDAOJDBC").log(Level.SEVERE, ex.getMessage(), ex);
        }  //Autoclose resources (jdk>7)
        return insertados == 1;
    }

    @Override
    public Grupo encontrarID(int id) {
        String SQL_BUSCA = "SELECT * FROM grupos where id=?";

        Grupo g = null;
        try (Connection conn = ds.getConnection();
             PreparedStatement stmn = conn.prepareStatement(SQL_BUSCA)) {

            stmn.setInt(1, id);
            try (ResultSet rs = stmn.executeQuery()) {
                rs.next();
                g = gruposMapper(rs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GruposDAOJDBC.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        }
        return g;
    }

    @Override
    public Grupo encontrarNombre(String nombre) {
        String SQL_BUSCA = "SELECT * FROM grupos where nombre=?";

        Grupo g = null;
        try (Connection conn = ds.getConnection();
             PreparedStatement stmn = conn.prepareStatement(SQL_BUSCA)) {

            stmn.setString(1, nombre);
            try (ResultSet rs = stmn.executeQuery()) {
                rs.next();
                g = gruposMapper(rs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GruposDAOJDBC.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        }
        return g;
    }

    @Override
    public boolean editar(Grupo g) {
        String SQL_EDIT = "UPDATE grupos "
                          + "SET activo=?, nombre=?, diocesana=?, fecha_creacion=?, direccion=?, cp=?, localidad=?, provincia=?, telefono=?, email=?, web=? "
                          + "WHERE id=?";
        boolean result = false;
        try (Connection conn = ds.getConnection();
             PreparedStatement stmn = conn.prepareStatement(SQL_EDIT)) {

            stmn.setBoolean(1, g.isActivo());
            stmn.setString(2, g.getNombre());
            stmn.setString(3, g.getDiocesana());
            java.sql.Date fecha = new java.sql.Date(g.getFechaCreacion().getTime());
            stmn.setDate(4, fecha);
            stmn.setString(5, g.getDireccion());
            stmn.setInt(6, g.getCodigoPostal());
            stmn.setString(7, g.getLocalidad());
            stmn.setString(8, g.getProvincia());
            stmn.setInt(9, g.getTelefono());
            stmn.setString(10, g.getEmail());
            stmn.setString(11, g.getWeb());
            stmn.setInt(12, g.getId());
            stmn.executeUpdate();
            result = (stmn.executeUpdate() == 1);

        } catch (SQLException ex) {
            Logger.getLogger("GruposDAOJDBC").log(Level.SEVERE, ex.getMessage(), ex);
        }  //Autoclose resources (jdk>7)
        return result;
    }

    @Override
    public boolean borrar(int id) {
        String SQL_BORRAR = "DELETE FROM gurpos WHERE id=?";
        boolean result = false;
        try (Connection conn = ds.getConnection();
             PreparedStatement stmn = conn.prepareStatement(SQL_BORRAR)) {

            stmn.setInt(1, id);
            result = (stmn.executeUpdate() == 1);

        } catch (Exception ex) {
            Logger.getLogger(GruposDAOJDBC.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
        }
        return result;
    }

}
