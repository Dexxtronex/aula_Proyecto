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
public abstract  class Reservaciones implements INTERFAZ_OperacionesReservaciones,INTERFAZ_Reserva_Horario,Materia{
    
 public void registrarReservacion(){
     
 }

 @Override
 public void registrarTiempodeUso(){
    
 }
    

 @Override
 public void registrarMateria(){
     
   
 }
 
 @Override
 public void busquedaReservacion(){
     
 }
 
}
