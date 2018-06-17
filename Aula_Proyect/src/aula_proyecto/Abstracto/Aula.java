/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_proyecto.Abstracto;

import aula_proyecto.Interfaces.INTERFAZ_Aula_Horarios;
import aula_proyecto.Interfaces.INTERFAZ_OperacionesReservaciones;
import Interfaces.INTERFAZ_Resarvar;
import Interfaces.INTERFAZ_OperacionesSalas;
import aula_proyecto.Interfaces.INTERFAZ_Reserva_Horario;
import java.util.ArrayList;

/**
 *
 * @author dexxtronex
 */
public abstract class Aula extends Reservaciones implements INTERFAZ_OperacionesSalas
        ,INTERFAZ_Resarvar, INTERFAZ_Aula_Horarios
{
   
    public String Numeracion_aula;
    private int Capacidad_alumnos;
    private int Cantidad_Pizarras;
    private int numeros_pupitres;
    private String tipo_ventilacion;
    private int cantidad_ventilacion;
    
    public Aula() {
    }

    public Aula(String Numeracion_aula, int Capacidad_alumnos, int Cantidad_Pizarras, int numeros_pupitres, String tipo_ventilacion, int cantidad_ventilacion) {
        this.Numeracion_aula = Numeracion_aula;
        this.Capacidad_alumnos = Capacidad_alumnos;
        this.Cantidad_Pizarras = Cantidad_Pizarras;
        this.numeros_pupitres = numeros_pupitres;
        this.tipo_ventilacion = tipo_ventilacion;
        this.cantidad_ventilacion = cantidad_ventilacion;
    }

     public String getNumeracion_aula() {
        return Numeracion_aula;
    }

    public void setNumeracion_aula(String Numeracion_aula) {
        this.Numeracion_aula = Numeracion_aula;
    }

    public int getCapacidad_alumnos() {
        return Capacidad_alumnos;
    }

    public void setCapacidad_alumnos(int Capacidad_alumnos) {
        this.Capacidad_alumnos = Capacidad_alumnos;
    }

    public int getCantidad_Pizarras() {
        return Cantidad_Pizarras;
    }

    public void setCantidad_Pizarras(int Cantidad_Pizarras) {
        this.Cantidad_Pizarras = Cantidad_Pizarras;
    }

    public int getNumeros_pupitres() {
        return numeros_pupitres;
    }

    public void setNumeros_pupitres(int numeros_pupitres) {
        this.numeros_pupitres = numeros_pupitres;
    }

    public String getTipo_ventilacion() {
        return tipo_ventilacion;
    }

    public void setTipo_ventilacion(String tipo_ventilacion) {
        this.tipo_ventilacion = tipo_ventilacion;
    }

    public int getCantidad_ventilacion() {
        return cantidad_ventilacion;
    }

    public void setCantidad_ventilacion(int cantidad_ventilacion) {
        this.cantidad_ventilacion = cantidad_ventilacion;
    }
    
    /*
    @Override
    public String toString() {
       
        return "\nNUMERACION DEL AULA: "+this.getNumeracion_aula()
                +"\nCAPACIDAD SE ALUMNOS: "+this.getCapacidad_alumnos()
                +"\nNUMEROS DE PIZARRONES: "+this.getCantidad_Pizarras()
                +"\nNUMEROS DE PUPITRES: "+this.getNumeros_pupitres()
                +"\nTIPO DE VENTILACIÓN: "+this.getTipo_ventilacion()
                +"\nCANTIDAD"+this.getCantidad_ventilacion();

}
*/

    @Override
    public String toString() {
        return this.getClass().getName();
    }

   
    
    
    
    
    
}
