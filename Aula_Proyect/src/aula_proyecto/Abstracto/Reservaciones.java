/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_proyecto.Abstracto;

import aula_proyecto.Interfaces.INTERFAZ_OperacionesReservaciones;
import aula_proyecto.Interfaces.INTERFAZ_Reserva_Horario;

/**
 *
 * @author TOSHIBA
 */
public abstract class Reservaciones implements INTERFAZ_OperacionesReservaciones,INTERFAZ_Reserva_Horario,Materia{
    private int codigo;
    private String nombre;
    private int horaioduso;
    private int fchinicio;
    private int fchfinaliz;
    private int diasduso;
    private String nombmateria;
    private int horasd;
 public Reservaciones(){}
 public Reservaciones(int codigo, String nombre, int horarioduso,String materia,int fchinicio,
         int fchfinaliz,int diasduso,String nombmateria){
     this.codigo=codigo;
     this.nombre=nombre;
     this.horaioduso=horarioduso;
     this.fchinicio=fchinicio;
     this.fchfinaliz=fchfinaliz;
     this.diasduso=diasduso;
     this.nombmateria=nombmateria;
     this.horasd=horasd;
 }
 
 public void registrarReservacion(){
     System.out.println("Nombre: "+this.nombre);
     System.out.println("Codigo: "+this.codigo);
 
 }
    @Override
 public void registrarTiempodeUso(){
    System.out.println("Fecha de inicio: "+this.fchinicio);
     System.out.println("Fecha de finalizacion: "+this.fchfinaliz);
     System.out.println("Dias de uso: "+this.diasduso); 
     
 }
    
    @Override
 public void registrarMateria(){
     System.out.println("Nombre: "+this.nombmateria);
     System.out.println("Horas de duracion: "+this.horasd);
   
 }
    @Override
 public String toString(){
 return "Nombre: "+this.nombre + "Cogido: "+this.codigo + "Fecha de inicio: "+this.fchinicio +
         "Fecha de finalizacion: "+this.fchfinaliz + "Dias de uso: "+this.diasduso+  "Nombre de la materia: "+
                 this.nombmateria+ "Horas de duracion: "+this.horasd ;
 }
    @Override
 public void busquedaReservacion(){
     
 }
 
}
