package aula_proyecto.Abstracto;


import aula_proyecto.Abstracto.Reservaciones;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author TOSHIBA
 */
public abstract class Persona {
    private int codigo;
    private String nombre;
    private String cedula;
    public Persona(){
        
    }
    
    public Persona(int codigo, String nombre,String cedula){
        this.codigo=codigo;
        this.nombre=nombre;
        this.cedula=cedula;
            
}
    public String toString(){
        return "Codigo: "+this.codigo +"Nombre: "+this.nombre +"Cedula: "+this.cedula;
    }
}
