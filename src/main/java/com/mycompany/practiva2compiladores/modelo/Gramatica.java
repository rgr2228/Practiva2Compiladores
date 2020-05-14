/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practiva2compiladores.modelo;

import java.util.List;

/**
 *
 * @author Raúl Gómez, Alejandro Gallego
 */
public class Gramatica {
    private List<Produccion> producciones;
    private List<DNode> noTerminales;
    private List<DNode> noTerminalesAnulables;
    private List<Integer> produccionesAnulables;

    public List<Produccion> getProducciones() {
        return producciones;
    }

    public List<DNode> getNoTerminales() {
        return noTerminales;
    }

    public List<DNode> getNoTerminalesAnulables() {
        return noTerminalesAnulables;
    }

    public List<Integer> getProduccionesAnulables() {
        return produccionesAnulables;
    }

    public void setProducciones(List<Produccion> producciones) {
        this.producciones = producciones;
    } 

    public void setNoTerminales(List<DNode> noTerminales) {
        this.noTerminales = noTerminales;
    }

    public void setNoTerminalesAnulables(List<DNode> noTerminalesAnulables) {
        this.noTerminalesAnulables = noTerminalesAnulables;
    }

    public void setProduccionesAnulables(List<Integer> produccionesAnulables) {
        this.produccionesAnulables = produccionesAnulables;
    } 
}
