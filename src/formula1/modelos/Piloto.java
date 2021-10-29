/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula1.modelos;

/**
 *
 * @author 503
 */
public class Piloto {
    
    private int id;
    private String nombres;
    private int salario;
    private String FechaInicio;
    private String fechasalida;
    private String idEscuderia;

    public Piloto() {
    }

    public Piloto(int id, String nombres, int salario, String FechaInicio, String fechasalida, String idEscuderia) {
        this.id = id;
        this.nombres = nombres;
        this.salario = salario;
        this.FechaInicio = FechaInicio;
        this.fechasalida = fechasalida;
        this.idEscuderia = idEscuderia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(String FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public String getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(String fechasalida) {
        this.fechasalida = fechasalida;
    }

    public String getIdEscuderia() {
        return idEscuderia;
    }

    public void setIdEscuderia(String idEscuderia) {
        this.idEscuderia = idEscuderia;
    }
    
    
    
    
}
