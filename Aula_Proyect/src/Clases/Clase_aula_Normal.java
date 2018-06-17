/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import aula_proyecto.Abstracto.Aula;
import java.util.ArrayList;

/**
 *
 * @author dexxtronex
 */
public class Clase_aula_Normal extends Aula {
    private String[] dias;
    private int horaDisponibleInico,HoraFin;

    public Clase_aula_Normal() {
    }
    
    
    public Clase_aula_Normal(String[] dias, int horaDisponibleInico, int HoraFin, String Numeracion_aula, int Capacidad_alumnos, int Cantidad_Pizarras, int numeros_pupitres, String tipo_ventilacion, int cantidad_ventilacion) {
        super(Numeracion_aula, Capacidad_alumnos, Cantidad_Pizarras, numeros_pupitres, tipo_ventilacion, cantidad_ventilacion);
        this.dias = dias;
        this.horaDisponibleInico = horaDisponibleInico;
        this.HoraFin = HoraFin;
    }

    public String[] getDias() {
        return dias;
    }

    public void setDias(String[] dias) {
        this.dias = dias;
    }

    public int getHoraDisponibleInico() {
        return horaDisponibleInico;
    }

    public void setHoraDisponibleInico(int horaDisponibleInico) {
        this.horaDisponibleInico = horaDisponibleInico;
    }

    public int getHoraFin() {
        return HoraFin;
    }

    public void setHoraFin(int HoraFin) {
        this.HoraFin = HoraFin;
    }
    
   private ArrayList<Aula> aulaNormal;
    
    @Override
    public void registrar(Aula aula) {
        aulaNormal.add(aula); 
    }

    @Override
    public Aula buscar(String codigo) {
         for(Aula aula:aulaNormal){
                   
            if(aula.getNumeracion_aula().equals(super.Numeracion_aula)){
                
                return aula;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Aula> buscarAula() {
        return null;
    }
    
    @Override
    public void ModificarAula() {
    }
    
    
    @Override
    public void RegistraHora_Disponible(String[] dias, int horaDisponible_inicio, int horaDisponible_fin) {
       this.setDias(dias);
       this.setHoraDisponibleInico(horaDisponibleInico);
       this.setHoraFin(HoraFin);
    }

       
    @Override
    public void MostrarDisponibilidad() {
       super.toString();
       System.out.println("DISPONIBILIDAD AULA: "+super.getNumeracion_aula()
               +"\nDIAS: "+getDias()
               +"\nHORA INICIO: "+getHoraDisponibleInico()
               +"\nHORA DE FINALIZACIÓN: "+getHoraFin());
    }

    @Override
    public void ModificarDisponibilidad() {
    }

    @Override
    public void registarReservacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
