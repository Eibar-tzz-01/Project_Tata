/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import Model.Persona;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author eibar
 */
public class Transactions extends DBManager {
    
    public boolean alta(String nombre, String apaterno, String amaterno, String fechanac, String percepcion) throws SQLException {
        PreparedStatement pst = null;
        
        try {
            String consulta = "INSERT INTO Persona (nombre, apaterno, amaterno, fechanac, percepcion) VALUES (?, ?, ?, ?, ?)";
            pst = getConnection().prepareStatement(consulta);
            pst.setString(1, nombre);
            pst.setString(2, apaterno);
            pst.setString(3, amaterno);
            pst.setString(4, fechanac);
            pst.setString(5, percepcion);

            if (pst.executeUpdate() == 1){
                return true;
            }
	} catch(Exception e){
            System.err.println("Error " + e);
	} finally{
            if (getConnection() != null) getConnection().close();
            if (pst != null) pst.close();
	}
        return false;
    }
    
    public List<Persona> busca(String id) throws SQLException {
        PreparedStatement pst = null;
        List<Persona> ls = new ArrayList<>();
        
        try {
            String consulta = "SELECT * FROM Persona WHERE id = ?";
            pst = getConnection().prepareStatement(consulta);
            pst.setString(1, id);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Persona pers = new Persona(rs.getString("id"), rs.getString("nombre"), rs.getString("apaterno"), rs.getString("amaterno"), rs.getString("fechanac"), rs.getString("percepcion"));
                ls.add(pers);
            }
            rs.close();
        } catch(Exception e){
            System.err.println("Error " + e);
	} finally{
            if (getConnection() != null) getConnection().close();
            if (pst != null) pst.close();
	}
        
        return ls;
    }
    
    public boolean borra(String id) throws SQLException {
        PreparedStatement pst = null;
        
        try {
            String consulta = "DELETE FROM Persona WHERE id = ?";
            pst = getConnection().prepareStatement(consulta);
            pst.setString(1, id);

            if (pst.executeUpdate() == 1){
                return true;
            }
	} catch(Exception e){
            System.err.println("Error " + e);
	} finally{
            if (getConnection() != null) getConnection().close();
            if (pst != null) pst.close();
	}
        return false;
    }
    
    public List<Persona> lista() throws SQLException {
        PreparedStatement pst = null;
        List<Persona> ls = new ArrayList<>();
        
        try {
            String consulta = "SELECT * FROM Persona";
            pst = getConnection().prepareStatement(consulta);
            
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Persona pers = new Persona(rs.getString("id"), rs.getString("nombre"), rs.getString("apaterno"), rs.getString("amaterno"), rs.getString("fechanac"), rs.getString("percepcion"));
                ls.add(pers);
            }
            rs.close();
        } catch(Exception e){
            System.err.println("Error " + e);
	} finally{
            if (getConnection() != null) getConnection().close();
            if (pst != null) pst.close();
	}
        
        return ls;
    }
}
