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
public class DNode{
    private boolean esTerminal;
    private String valor;
    private DNode ligaIzquierda;
    private DNode ligaDerecha;
    private List<String> primeros;
    private List<String> siguientes;

    public boolean getTipo() {
        return esTerminal;
    }

    public String getValor() {
        return valor;
    }

    public DNode getLigaIzquierda() {
        return ligaIzquierda;
    }

    public DNode getLigaDerecha() {
        return ligaDerecha;
    }

    public List<String> getPrimeros() {
        return primeros;
    }

    public List<String> getSiguientes() {
        return siguientes;
    }

    public void setTipo(boolean esTerminal) {
        this.esTerminal = esTerminal;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }  

    public void setLigaIzquierda(DNode ligaIzquierda) {
        this.ligaIzquierda = ligaIzquierda;
    }

    public void setLigaDerecha(DNode ligaDerecha) {
        this.ligaDerecha = ligaDerecha;
    }

    public void setPrimeros(List<String> primeros) {
        this.primeros = primeros;
    }

    public void setSiguientes(List<String> siguientes) {
        this.siguientes = siguientes;
    }
}
