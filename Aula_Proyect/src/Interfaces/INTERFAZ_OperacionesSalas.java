/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import aula_proyecto.Abstracto.Aula;
import aula_proyecto.Abstracto.Reservaciones;
import java.util.ArrayList;

/**
 *
 * @author dexxtronex
 */
public interface INTERFAZ_OperacionesSalas {
    
    void registrar(Aula aula);
       
     Aula buscar(String codigo);
    
     ArrayList<Aula> buscarAula();
     
    
}
