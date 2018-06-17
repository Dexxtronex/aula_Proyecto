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
        int validación_do_while_Principal   = 1; // identificador para finalizar bucle general (menu general) 
        int validacion_Menu_1;                   // validaciones para menu
        String op ;                                  // string que obtendrá las respuestas de cada menú
        do{                                         // do del bucle general 
            do{                                     // do del primer menu (menu general ) 
                
            
             op = JOptionPane.showInputDialog(null,"PROYECTO- AULA "        // obtención de la respuesta de un "mensaje-jframe"  
                    + "\n 1.- Ingreso de Sala - AULA"
                    + "\n 2.- Reservar Sala-Aula"
                    + "\n 3.- Mostrar Aulas"
                    + "\n 4.- Mostrar Reservaciones"
                    + "\n 0.- Salir");
                       
            

            if (isNumeric(op) == true) {        // metodo statico que devuelve verdadero si es un numero
                                                // sirve para hacer una validación de que si digita algó erroneo salga un mensaje

                 
                 
            validacion_Menu_1 = Integer.parseInt(op);   // obtengo el valor de op y lo convierto a Entero
                                                        // se hace este proceso ya que estamos seguros de que no saldrá error ya no es
                                                        // un caracter y solo es un numero.
             if((validacion_Menu_1 >=0) && (validacion_Menu_1 <= 4)){   // hago la validación para ver si el usuario escogió numeros en el rango establecido
                                // fin de todo el ciclo

                 if(validacion_Menu_1 == 0){               // si el usuario digita 0 el programa hará cambiar el indicador del bucle 
                                                            // general para poder finalizar el bucle y que finalice el programa
                    validación_do_while_Principal = 0;      // asignar 0 a la variable de indicador
                }
                 validacion_Menu_1 = 0;                     // asignar 0 a la variable del primer menu para finalizarlo
               
            }
            else{                                               // si el usuario digito un numero superando el rango saldrá un mensaje de error
                JOptionPane.showMessageDialog(null,"Digite digitos validos entre rango de 0 a 4");
            }
            
             }
            
                                                                // si el String de op no es un numero saldrá un mensaje diciendo que 
                                                                // digite los valores correctos
             else{
                                                                
                if(op == null){                                 // si el usuario presionó cancelar se asignará a los indice 0 para cancelar todo proceso de do-while
                    // fin de bucle de menu 1
                    validación_do_while_Principal = 0;         // asignar 0 a la variable de indicador
                
                            validacion_Menu_1= 0;            // asignar 0 a la variable del primer menu para finalizarlo
                }
                else{
                                                            // si el usuario digitó una opcion incorrecta como letras hará que repita el bucle
                                        JOptionPane.showMessageDialog(null,"Digite digitos validos entre rango de 0 a 4");

                                     validacion_Menu_1 = 1;

                }
             }
        
            }while(validacion_Menu_1 != 0);                 // fin del bucle y aceptación del mismo 
            
            if(Integer.parseInt(op) == 1){                  // convierto a entero el valor obtenido del primer menú para hacer los procesos
                                                            // no saldrá error ya que se hizo la validación al principio
                // menu de creacion de sala
                
                
                 do{                                          // do del Menú de Registrar un Aula, lo cual existen 3 opciones              
            
             op = JOptionPane.showInputDialog(null,"Creación de Sala "
                    + "\n 1.- Registrar Aula Normal"
                    + "\n 2.- Registrar Aula Grande"
                    + "\n 3.- Registrar Aula Laboratorio"
                    + "\n 0.- Salir");
                       
            

            if (isNumeric(op) == true) {                    // validación si a digitado un número el usuario

                 
                 
            validacion_Menu_1 = Integer.parseInt(op);       // convertir la variable de String a Int y a la vez asignarla
             if((validacion_Menu_1 >=0) && (validacion_Menu_1 <= 4)){           // comprobar si está en el rango valido de opciones
                
                                            // switch que permitirá la creación del objeto dependiendo El tipo de OBjeto
                                             // ya sea Aula normal, Aula grande, Aula Laboratorio
                
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
                // No se han tomado en consideración desde aquí validaciones 
                
             String Numeracion_aula  = JOptionPane.showInputDialog(null,"Digite el Codigo del curso a registrar");
                
     int Capacidad_alumnos  = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite capacidad Alumnos"));
     int Cantidad_Pizarras  = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite cantidad Pizarras"));
     int numeros_pupitres   = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite cantidad Pupitres"));
     String tipo_ventilacion = (JOptionPane.showInputDialog(null,"Digite Tipo Ventilador (Normales,Autonomas, etc"));
     int cantidad_ventilacion = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite cantidad Ventiladores"));
                
                obj_aula.setNumeracion_aula(Numeracion_aula);
                obj_aula.setCapacidad_alumnos(Capacidad_alumnos);
                obj_aula.setCantidad_Pizarras(Cantidad_Pizarras);
                obj_aula.setNumeros_pupitres(numeros_pupitres);
                obj_aula.setTipo_ventilacion(tipo_ventilacion);
                obj_aula.setCantidad_ventilacion(cantidad_ventilacion);
                
                 JOptionPane.showMessageDialog(null,"Se a creado el Aula: "+obj_aula.toString()+"\n"+obj_aula.getClass().getName());
                  // muestro si se a creado la clase o no teniendo en consideración que el to string mostrará el nombre de la clase
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
                                    JOptionPane.showMessageDialog(null,"Digite digitos validos entre rango de 0 a 3");

                                     validacion_Menu_1 = 1;

                }
             }
        
            }while(validacion_Menu_1 != 0); // fin del menú 2 Creación de Aula
                
                
                
                
                
            } // fin de la opcion 1 
            
                
            
            }while(validación_do_while_Principal != 0);

           
    }
    
}
