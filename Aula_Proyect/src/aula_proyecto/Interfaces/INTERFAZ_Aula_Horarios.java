/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_proyecto.Interfaces;

/**
 *
 * @author dexxtronex
 */
public interface INTERFAZ_Aula_Horarios {
       
        void RegistraHora_Disponible(String []dias,int horaDisponible_inicio,int horaDisponible_fin);
        
        void MostrarDisponibilidad();
        
        void ModificarDisponibilidad();
}
