/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registros;

import java.sql.*;
import Conexion.conexion;
import Objetos.Personal;
import Objetos.objeto;
import Objetos.venta;
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
    
    public static boolean ModificarVenta(objeto o,int seri){
        try{
            Connection Conexion = conexion.getConnection();
            String query = "UPDATE game SET nombre,descripcion,restriccion,valor WHERE serial = '"+seri+"' values (?,?,?,?)";
            PreparedStatement insertar = Conexion.prepareStatement(query);
            insertar.setString(1,o.getNombre());
            insertar.setString(2,o.getDescripcion());
            insertar.setString(3,o.getRestriccion());
            insertar.setInt(4,o.getValor());
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
    
    public static boolean agregarCompraVenta(venta v){
        try{
            int numero = (int) (Math.random() * 500) + 1;
            Connection Conexion = conexion.getConnection();
            String query = "insert into venta(id,correo,juego,cantidad,total) values (?,?,?,?,?)";
            PreparedStatement insertar = Conexion.prepareStatement(query);
            insertar.setInt(1, numero);
            insertar.setString(2,v.getCorreo());
            insertar.setString(3,v.getJuego());
            insertar.setInt(4,v.getCantidad());
            insertar.setInt(5,v.getTotal());
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
    
    public static ArrayList<objeto> mostrarValor(String qry){
        
        ArrayList<objeto> listainventario = new ArrayList<>();
        
        try{
            Connection Conexion = conexion.getConnection();
            String query = qry;
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
    
    public static ArrayList<venta> EnviarDatos(String qry){
        
        ArrayList<venta> listainventario = new ArrayList<>();
        
        try{
            Connection Conexion = conexion.getConnection();
            String query = qry;
            PreparedStatement mostrarVentas = Conexion.prepareStatement(query);
            ResultSet rs = mostrarVentas.executeQuery();
            while(rs.next()){
                
                venta v = new venta();
                v.setId(rs.getInt("id"));
                v.setCorreo(rs.getString("correo"));
                v.setJuego(rs.getString("juego"));
                v.setCantidad(rs.getInt("cantidad"));
                v.setTotal(rs.getInt("total"));
                listainventario.add(v);
                
            }
            Conexion.close();
        }catch(SQLException s){
            System.out.println("Error SQL al listar Objeto"+s.getMessage());
        }catch(ClassNotFoundException e){
            System.out.println("Error al listar Objeto"+e.getMessage());
        }
        return listainventario;
        
    }
    
    public static ArrayList<venta> mostrarCompraVentas(){
        
        ArrayList<venta> listaventa = new ArrayList<>();
        
        try{
            Connection Conexion = conexion.getConnection();
            String query = "select * from venta";
            PreparedStatement mostrarVentas = Conexion.prepareStatement(query);
            ResultSet rs = mostrarVentas.executeQuery();
            while(rs.next()){
                
                venta v = new venta();
                v.setId(rs.getInt("id"));
                v.setCorreo(rs.getString("correo"));
                v.setJuego(rs.getString("juego"));
                v.setCantidad(rs.getInt("cantidad"));
                v.setTotal(rs.getInt("total"));
                listaventa.add(v);
                
            }
            Conexion.close();
        }catch(SQLException s){
            System.out.println("Error SQL al listar Objeto"+s.getMessage());
        }catch(ClassNotFoundException e){
            System.out.println("Error al listar Objeto"+e.getMessage());
        }
        return listaventa;
        
    }
    
    public static ArrayList<Personal> mostrarPersonal(String qry){
        
        ArrayList<Personal> listainventario = new ArrayList<>();
        
        try{
            Connection Conexion = conexion.getConnection();
            String query = qry;
            PreparedStatement mostrarPersonal = Conexion.prepareStatement(query);
            ResultSet rs = mostrarPersonal.executeQuery();
            while(rs.next()){
                
                Personal p = new Personal();
                p.setUsuario(rs.getString("usuario"));
                p.setCorreo(rs.getString("correo"));
                p.setPassword(rs.getString("password"));
                p.setRut(rs.getString("rut"));
                listainventario.add(p);
                
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
