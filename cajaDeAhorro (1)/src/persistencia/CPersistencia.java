/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import objetosNegocio.Ahorro;
import objetosNegocio.Pago;
import objetosNegocio.Persona;
import objetosNegocio.Prestamo;

/**
 *
 * @author melis
 */
public class CPersistencia {

    final static String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    final static String CONEXION = "jdbc:sqlserver://localhost"
            + ":1433;databaseName=CajaDeAhorro";
    final static String USER = "ahorros";
    final static String PASS = "caja";

    Connection conectar;

    public Persona buscarPersona(Persona p) {
        Persona persona = null;
        try {
            Class.forName(DRIVER);
            conectar = DriverManager.getConnection(CONEXION, USER, PASS);
            PreparedStatement sentenciaBuscar
                    = conectar.prepareStatement("SELECT * FROM Personas WHERE ClavePersona = ?");
            sentenciaBuscar.setString(1, p.getClavePersona());
            ResultSet rs = sentenciaBuscar.executeQuery();

            if (rs.next() == true) {
                persona = new Persona(rs.getString(1), rs.getString(2),
                        rs.getString(3), rs.getString(4), rs.getString(5).charAt(0), rs.getString(6));
            }
            sentenciaBuscar.close();
            rs.close();
            conectar.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CPersistencia.class.getName()).log(Level.SEVERE, null, ex);

        }

        return persona;
    }

    public List<Ahorro> obtenerCuentas(Persona persona) {
        List<Ahorro> ahorros = new ArrayList();
        List<Pago> pagos = obtenerPagos(persona);
        for (int i = 0; i < pagos.size(); i++) {
            if (pagos.get(i).getTipo() != 'a') {
                pagos.remove(i);
            }
        }
        try {
            Class.forName(DRIVER);
            conectar
                    = DriverManager.getConnection(CONEXION, USER, PASS);

            Statement sentencia
                    = conectar.createStatement();
            ResultSet rs = sentencia.executeQuery("SELECT * FROM Ahorros "
                    + "WHERE Propietario = " + persona.getClavePersona());

            while (rs.next()) {
                ahorros.add(new Ahorro(rs.getString("noCuenta"),
                        rs.getString("Propietario"), rs.getString("Titular"),
                        rs.getFloat("AhorroFijo"), pagos));
            }

            sentencia.close();
            rs.close();
            conectar.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ahorros;
    }

    public Pago registrarPago(Pago p) {
        Pago pago = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conectar
                    = DriverManager.getConnection("jdbc:sqlserver://RAMIRO-PC:1433;databaseName=sistemaAurora", "sistemaaurora", "123");

            PreparedStatement sentenciaBuscar
                    = conectar.prepareStatement("SELECT * FROM Pagp WHERE ClavePago = ?");
            sentenciaBuscar.setString(1, p.getClavePago());
            ResultSet rs = sentenciaBuscar.executeQuery();
            PreparedStatement sentenciaAgregar
                    = conectar.prepareStatement("INSERT INTO Pagos VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)");
            sentenciaAgregar.setString(1, p.getClavePago());
            sentenciaAgregar.setDate(2, p.getFecha());
            sentenciaAgregar.setString(3, String.valueOf(p.getTipo()));
            sentenciaAgregar.setFloat(4, p.getImporte());
            sentenciaAgregar.setFloat(5, p.getMulta());
            sentenciaAgregar.setFloat(6, p.getEfectivo());
            sentenciaAgregar.setFloat(7, p.getIntereses());
            sentenciaAgregar.setString(8, p.getTicket());
            sentenciaAgregar.setString(9, p.getClaveAbonado());

            if (rs.next() == false) {
                sentenciaAgregar.executeUpdate();
                pago = p;
            }
            sentenciaBuscar.close();
            rs.close();
            sentenciaAgregar.close();
            conectar.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pago;
    }

    public List<Prestamo> obtenerPrestamos(Persona persona) {
        List<Prestamo> prestamos = new ArrayList();
        List<Pago> pagos = obtenerPagos(persona);
        for (int i = 0; i < pagos.size(); i++) {
            if (pagos.get(i).getTipo() != 'p') {
                pagos.remove(i);
            }
        }
        try {
            Class.forName(DRIVER);
            conectar
                    = DriverManager.getConnection(CONEXION, USER, PASS);

            Statement sentencia
                    = conectar.createStatement();
            ResultSet rs = sentencia.executeQuery("SELECT * FROM Prestamos "
                    + "WHERE Propietario = " + persona.getClavePersona());

            while (rs.next()) {
                prestamos.add(new Prestamo(rs.getString("ClavePrestamo"),
                        rs.getDate("Fecha"), rs.getDate("FechaProxPago"),
                        rs.getString("Pagare"), rs.getFloat("Monto"), pagos));
            }

            sentencia.close();
            rs.close();
            conectar.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return prestamos;
    }

    public List<Pago> obtenerPagos(Persona persona) {
        List<Pago> p = new ArrayList();
        try {
            Class.forName(DRIVER);
            conectar
                    = DriverManager.getConnection(CONEXION, USER, PASS);

            Statement sentencia
                    = conectar.createStatement();
            ResultSet rs = sentencia.executeQuery("SELECT * FROM Pagos "
                    + "WHERE ClaveAbonado = " + persona.getClavePersona());

            while (rs.next()) {
                p.add(new Pago(rs.getString("ClavePago"),
                        rs.getString("ClaveAbonado"), rs.getDate("Fecha"),
                        rs.getString("Tipo").charAt(0), rs.getFloat("Importe"),
                        rs.getFloat("Multa"), rs.getFloat("Efectivo"),
                        rs.getFloat("Intereses"), rs.getString("Ticket")));
            }

            sentencia.close();
            rs.close();
            conectar.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }

}
