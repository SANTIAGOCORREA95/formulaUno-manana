/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula1.modelos;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author 503
 */
public class ModeloBD {
    
    //Donde vive la BD
    private String servidorBD="jdbc:mysql://localhost/formula1";
    private String usuarioBD="root";
    private String passwordBD="";

    public ModeloBD() {
    }
    
    public Connection conectar(){
        
        Connection conexion=null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion=DriverManager.getConnection(servidorBD,usuarioBD,passwordBD);
            System.out.println("Exito conectandonos");
            return conexion;
            
        }catch(Exception error){
            System.out.println("upss.. "+error);
            return null;
        }
        
    }
    
    
    
    
}
