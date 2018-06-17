/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_proyect;

import Clases.Clase_aula_Grande;
import Clases.Clase_aula_Laboratorio;
import Clases.Clase_aula_Normal;
import aula_proyecto.Abstracto.Aula;
import javax.swing.JOptionPane;

/**
 *
 * @author dexxtronex
 */


public class Aula_Proyect {

public static boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }

    public static void main(String[] args) {
        Aula obj_aula = null ;
        int validación_do_while_Principal   = 1;
        int validacion_Menu_1;
        String op;
        do{
            do{
                
            
             op = JOptionPane.showInputDialog(null,"PROYECTO- AULA "
                    + "\n 1.- Ingreso de Sala - AULA"
                    + "\n 2.- Reservar Sala-Aula"
                    + "\n 3.- Mostrar Aulas"
                    + "\n 4.- Mostrar Reservaciones"
                    + "\n 0.- Salir");
                       
            

            if (isNumeric(op) == true) {

                 
                 
            validacion_Menu_1 = Integer.parseInt(op);
             if((validacion_Menu_1 >=0) && (validacion_Menu_1 <= 4)){
                                // fin de todo el ciclo

                 if(validacion_Menu_1 == 0){
                    validación_do_while_Principal = 0;
                }
                 validacion_Menu_1 = 0;
               
            }
            else{
                JOptionPane.showMessageDialog(null,"Digite digitos validos entre rango de 0 a 4");
            }
            
             }
            
            
            // else de validación y fin de cancelar 
             else{
                if(op == null){
                    // fin de bucle de menu 1
                    validación_do_while_Principal = 0;
                
                    validacion_Menu_1= 0;
                }
                else{
                                     validacion_Menu_1 = 1;

                }
             }
        
            }while(validacion_Menu_1 != 0);
            
            if(Integer.parseInt(op) == 1){
                // menu de creacion de sala
                
                
                 do{
                
            
             op = JOptionPane.showInputDialog(null,"Creación de Sala "
                    + "\n 1.- Registrar Aula Normal"
                    + "\n 2.- Registrar Aula Grande"
                    + "\n 3.- Registrar Aula Laboratorio"
                    + "\n 0.- Salir");
                       
            

            if (isNumeric(op) == true) {

                 
                 
            validacion_Menu_1 = Integer.parseInt(op);
             if((validacion_Menu_1 >=0) && (validacion_Menu_1 <= 4)){
                
                 System.out.println(""+validacion_Menu_1);
                
                switch (validacion_Menu_1) {
                    case 1:
                        obj_aula = new Clase_aula_Normal();
                        break;
                    case 2:
                        obj_aula = new Clase_aula_Grande();
                        break;
                    case 3:
                        obj_aula = new Clase_aula_Laboratorio();
                        break;
                    default:
                        break;
                }
                
                 System.out.println(""+obj_aula.toString());
                 validacion_Menu_1 = 0;

            }
            else{
                JOptionPane.showMessageDialog(null,"Digite digitos validos entre rango de 0 a 4");
            }
            
             }
            
            
            // else de validación y fin de cancelar 
             else{
                if(op == null){
                    validacion_Menu_1= 0;
                }
                else{
                                     validacion_Menu_1 = 1;

                }
             }
        
            }while(validacion_Menu_1 != 0);
                
                
                
                
                
            }
            
            
            }while(validación_do_while_Principal != 0);

           
    }
    
}
