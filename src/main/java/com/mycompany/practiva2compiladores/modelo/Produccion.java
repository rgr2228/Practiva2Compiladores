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
public class Produccion{
    private DNode ladoIzquierdo;
    private List<DNode> ladoDerecho;
    private List<String> primeros;
    private List<String> seleccion;

    public DNode getLadoIzquierdo() {
        return ladoIzquierdo;
    }

    public List<DNode> getLadoDerecho() {
        return ladoDerecho;
    }

    public List<String> getPrimeros() {
        return primeros;
    }

    public List<String> getSeleccion() {
        return seleccion;
    }
    
    public void setLadoIzquierdo(DNode ladoIzquierdo) {
        this.ladoIzquierdo = ladoIzquierdo;
    }

    public void setLadoDerecho(List<DNode> ladoDerecho) {
        this.ladoDerecho = ladoDerecho;
    }

    public void setPrimeros(List<String> primeros) {
        this.primeros = primeros;
    }

    public void setSeleccion(List<String> seleccion) {
        this.seleccion = seleccion;
    }    
}
