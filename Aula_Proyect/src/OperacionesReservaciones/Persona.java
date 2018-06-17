/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperacionesReservaciones;

/**
 *
 * @author TOSHIBA
 */
public abstract class Persona extends Reservaciones{
    public Persona(){
        
    }
    
    public Persona(int codigo, String nombre, int horarioduso,String materia,int fchinicio,
         int fchfinaliz,int diasduso,String nombmateria){
        super( codigo,  nombre,  horarioduso, materia, fchinicio,
          fchfinaliz, diasduso ,nombmateria);
    
}
}
