/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patrones_diseno;

/**
 *
 * @author fulco
 */
public class Patron_Iterator {
 
interface Iterador {
    boolean tieneSiguiente();
    Object siguiente();
}

// Interfaz para la Colección
interface Coleccion {
    Iterador crearIterador();
}


class Bodega implements Coleccion {
    static final int MAX_ITEMS = 6;
    int numeroDeProductos = 0;
    Producto[] listaDeProductos;

    public Bodega() {
        listaDeProductos = new Producto[MAX_ITEMS];

        
        agregarProducto("Producto 1", "Descripción del producto 1");
        agregarProducto("Producto 2", "Descripción del producto 2");
        agregarProducto("Producto 3", "Descripción del producto 3");
    }

    public void agregarProducto(String nombre, String descripcion) {
        Producto producto = new Producto(nombre, descripcion);
        if (numeroDeProductos >= MAX_ITEMS) {
            System.err.println("La lista está llena! No se puede agregar más productos.");
        } else {
            listaDeProductos[numeroDeProductos] = producto;
            numeroDeProductos = numeroDeProductos + 1;
        }
    }

    public Iterador crearIterador() {
        return new BodegaIterador(listaDeProductos);
    }

   
}


class BodegaIterador implements Iterador {
    Producto[] listaDeProductos;
    int posicion = 0;

    public BodegaIterador(Producto[] listaDeProductos) {
        this.listaDeProductos = listaDeProductos;
    }

    public boolean tieneSiguiente() {
        if (posicion >= listaDeProductos.length || listaDeProductos[posicion] == null) {
            return false;
        } else {
            return true;
        }
    }

    public Object siguiente() {
        Producto producto = listaDeProductos[posicion];
        posicion = posicion + 1;
        return producto;
    }
}


class Producto {
    String nombre;
    String descripcion;

    public Producto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    
}
   
}
