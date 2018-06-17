/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *<
 * @author TOSHIBA
 */
public class Docente extends Persona {
    private String especializacion;
public Docente (){}
public Docente (int codigo, String nombre,String cedula){
    super(codigo,nombre,cedula);
    this.especializacion=especializacion;
}
   public String toString(){
       return "Especializacion: "+this.especializacion;
   }
}
