package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDao implements CRUD{
    
    PreparedStatement pst;
    ResultSet rs;
    Connection cn;
    Conexion con  = new Conexion();
    
    @Override
    public List listar(){
        List<User> datos = new ArrayList<>();
        String sql = "select * from user";
        
        try{
            cn = con.getCn();
            pst = cn.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()){
                User u = new User();
                
                u.setId(rs.getInt("id"));
                u.setFname(rs.getString("fname"));
                u.setLname(rs.getString("lname"));
                datos.add(u);
            }
            
        }catch(Exception e){
            
        }
        
        return datos;
    }
    
    
    @Override
    public User listarID(int id){
        
    }
    
    @Override
    public String add(String nombre, String ape){
        
    }
    
    @Override
    public String edit(int id, String nombre,String ape){
        
    }
    
    @Override
    public User delete(){
        
    }
}
