/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patrones_diseno;

/**
 *
 * @author fulco
 */
public class Patron_Strategy {
    // Interfaz para la estrategia
interface Distribucion {
    void realizarEntrega(String articulo);
}

// Clases concretas que implementan la estrategia
class ViaAutomotriz implements Distribucion {
    public void realizarEntrega(String articulo) {
        System.out.println("Entregando " + articulo + " vía automotriz.");
    }
}

class ViaCiclista implements Distribucion {
    public void realizarEntrega(String articulo) {
        System.out.println("Entregando " + articulo + " vía ciclista.");
    }
}

class ViaAerea implements Distribucion {
    public void realizarEntrega(String articulo) {
        System.out.println("Entregando " + articulo + " vía aérea.");
    }
}

class ViaFluvial implements Distribucion {
    public void realizarEntrega(String articulo) {
        System.out.println("Entregando " + articulo + " vía fluvial.");
    }
}

// Clase Contexto
class Contexto {
    private Distribucion distribucion;

    public Contexto(Distribucion distribucion) {
        this.distribucion = distribucion;
    }

    public void cambiarTransporte(Distribucion distribucion) {
        this.distribucion = distribucion;
    }

    public void realizarEntrega(String articulo) {
        distribucion.realizarEntrega(articulo);
    }
}

}
