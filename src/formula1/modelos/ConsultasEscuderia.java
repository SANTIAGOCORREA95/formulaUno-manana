/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula1.modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author 503
 */
public class ConsultasEscuderia extends ModeloBD {
    
    private PreparedStatement consultaSQL;
    private ResultSet resultadoSQL;

    public ConsultasEscuderia() {
    }
    
    public boolean insertarEscuderia(Escuderia escuderia){
        
        Connection conexion = conectar();
        
        String query = "INSERT INTO escuderías(id, nombre, presupuesto, tipo_motor) " 
                + "VALUES (?,?,?,?)";
        
        try {
            
            consultaSQL = conexion.prepareStatement(query);
            
            consultaSQL.setString(1, escuderia.getId());
            consultaSQL.setString(2, escuderia.getNombre());
            consultaSQL.setInt(3, escuderia.getPresupuesto());
            consultaSQL.setString(4, escuderia.getTipoMoto());
            
            int resultado = consultaSQL.executeUpdate();
            
            if(resultado>0){
                
                return true;
            
            }else{
                
                return false;
            
            }
            
        
        }catch(Exception error){
            
            System.out.println("upsss.. " + error);
            return false;
        
        }
        
    }
    
    public Escuderia buscarEscuderia(String id){
        
        Escuderia escuderia = new Escuderia();
        
        Connection conexion = conectar();
        
        String query = "SELECT * FROM escuderías WHERE id = ?";
        
        
        try{
            
            consultaSQL = conexion.prepareStatement(query);
            
            consultaSQL.setString(1, id);
            
            resultadoSQL = consultaSQL.executeQuery();
            
            if(resultadoSQL.next()){
                
                escuderia.setId(resultadoSQL.getString("id"));
                escuderia.setNombre(resultadoSQL.getString("nombre"));
                escuderia.setPresupuesto(resultadoSQL.getInt("presupuesto"));
                escuderia.setTipoMotor(resultadoSQL.getString("tipo_motor"));
                return escuderia;
            
            }else{
                
                return null;
            
            }
        
        }catch(Exception error){
            
            System.out.println("upsss.. " + error);
            return null;
        
        }
        
    
    }
    
}
