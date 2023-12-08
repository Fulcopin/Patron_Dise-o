/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patrones_diseno;

/**
 *
 * @author fulco
 */
public class Ptron_Chain_Responsability {
    // Interfaz para el manejador
interface Handler {
    void setNext(Handler handler);
    void manejoDeProducto(String producto);
}

// Clases concretas que implementan el manejador
class Persona implements Handler {
    private Handler next;

    public void setNext(Handler handler) {
        this.next = handler;
    }

    public void manejoDeProducto(String producto) {
        if (next != null) {
            next.manejoDeProducto(producto);
        } else {
            System.out.println("Persona maneja el producto: " + producto);
        }
    }
}

class AsistenteDeAtencionAlUsuario implements Handler {
    private Handler next;

    public void setNext(Handler handler) {
        this.next = handler;
    }

    public void manejoDeProducto(String producto) {
        if (next != null) {
            next.manejoDeProducto(producto);
        } else {
            System.out.println("Asistente de Atención al Usuario maneja el producto: " + producto);
        }
    }
}

class Tecnico implements Handler {
    private Handler next;

    public void setNext(Handler handler) {
        this.next = handler;
    }

    public void manejoDeProducto(String producto) {
        if (next != null) {
            next.manejoDeProducto(producto);
        } else {
            System.out.println("Técnico maneja el producto: " + producto);
        }
    }
}

// Clases adicionales como JefeDeInventario y Gerente pueden ser implementadas de manera similar

}
