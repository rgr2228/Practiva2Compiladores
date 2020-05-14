/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practiva2compiladores.logica;

import com.mycompany.practiva2compiladores.modelo.DNode;
import com.mycompany.practiva2compiladores.modelo.Gramatica;
import com.mycompany.practiva2compiladores.modelo.Produccion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dulfary
 */
public class TipoGramatica {
    private Gramatica gramatica;

    public TipoGramatica(Gramatica gramatica) {
        this.gramatica = gramatica;
    }
    
    private boolean verificarInicioLadoDerechoS(){
        for(Produccion produccion: gramatica.getProducciones()){
            if(!produccion.getLadoDerecho().get(0).getTipo() || produccion.getLadoDerecho().get(0).getValor().equals("!")){
                return false;
            }
        }
        return true;
    }
    
    private boolean verificarInicioLadoDerechoQ(){
        for(Produccion produccion: gramatica.getProducciones()){
            if(!produccion.getLadoDerecho().get(0).getTipo()){
                return false;
            }
        }
        return true;
    }
    
    private boolean verificarInicioTipoSYQ(){
        int numeroProducciones = gramatica.getProducciones().size();
        for(int i=0; i<numeroProducciones;i++){
            for(int j=0; j<numeroProducciones;j++){
                if(i!=j){
                    if(gramatica.getProducciones().get(i).getLadoIzquierdo().equals(gramatica.getProducciones().get(j).getLadoIzquierdo())){
                        if(gramatica.getProducciones().get(i).getLadoDerecho().get(0).getValor().equals(gramatica.getProducciones().get(j).getLadoDerecho().get(0).getValor())){
                            return false;
                        }
                    }
                }
            }    
        }
        return true;
    }
    
    public boolean esGramaticaS(){
        if(!verificarInicioLadoDerechoS()){
            return false;
        }
        return true;
    }
    
    public boolean esGramaticaQ(){
        if(!verificarInicioLadoDerechoQ()){
            return false;
        }
        return true;
    }
    
    public boolean esGramaticaLl1(){
        return true;
    }  
}
