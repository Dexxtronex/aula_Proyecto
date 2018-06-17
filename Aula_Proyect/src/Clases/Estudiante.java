package Clases;


import aula_proyecto.Abstracto.Persona;
import aula_proyecto.Abstracto.Materia;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author TOSHIBA
 */
public class Estudiante extends Persona{

ArrayList<Materia>materia=new ArrayList<Materia>();
public Estudiante (){}
public Estudiante(int codigo, String nombre,String cedula){
    super(codigo,nombre,cedula);
    this.materia=materia;
}
   public String toString(){
       return "Materia: : "+this.materia;
   }
}

    
    

