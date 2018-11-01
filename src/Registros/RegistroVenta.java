/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registros;

import java.sql.*;
import Conexion.conexion;
import Objetos.objeto;
import java.util.ArrayList;

/**
 *
 * @author Javier
 */
public class RegistroVenta {

    public RegistroVenta() {
    }
    
    public static boolean agregarVenta(objeto o){
        try{
            Connection Conexion = conexion.getConnection();
            String query = "insert into game(serial,nombre,descripcion,restriccion,valor) values (?,?,?,?,?)";
            PreparedStatement insertar = Conexion.prepareStatement(query);
            insertar.setInt(1,o.getSerial());
            insertar.setString(2,o.getNombre());
            insertar.setString(3,o.getDescripcion());
            insertar.setString(4,o.getRestriccion());
            insertar.setInt(5,o.getValor());
            insertar.execute();
            Conexion.close();
            return true;
        }catch(SQLException s){
            System.out.println("Error SQL al agregar Objeto"+s.getMessage());
            return false;
        }catch(ClassNotFoundException e){
            System.out.println("Error al agregar Objeto"+e.getMessage());
            return false;
        }
    }
    
    public static ArrayList<objeto> mostrarVentas(){
        
        ArrayList<objeto> listainventario = new ArrayList<>();
        
        try{
            Connection Conexion = conexion.getConnection();
            String query = "select * from game";
            PreparedStatement mostrarVentas = Conexion.prepareStatement(query);
            ResultSet rs = mostrarVentas.executeQuery();
            while(rs.next()){
                
                objeto o = new objeto();
                o.setSerial(rs.getInt("serial"));
                o.setNombre(rs.getString("nombre"));
                o.setDescripcion(rs.getString("Descripcion"));
                o.setRestriccion(rs.getString("Restriccion"));
                o.setValor(rs.getInt("Valor"));
                listainventario.add(o);
                
            }
            Conexion.close();
        }catch(SQLException s){
            System.out.println("Error SQL al listar Objeto"+s.getMessage());
        }catch(ClassNotFoundException e){
            System.out.println("Error al listar Objeto"+e.getMessage());
        }
        return listainventario;
        
    }
    
}
