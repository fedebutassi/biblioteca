/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.publiclibrary2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Interfaz extends Biblioteca{

    
    
    Biblioteca biblio = new Biblioteca();
    
    private int opcion;
    Scanner scann = new Scanner(System.in);
    
    private int pedirOpcion(){
        System.out.println("Ingrese la opcion que desea realizar:");
        return scann.nextInt();
    }
    
    private void mostrarMenu(){
        System.out.println("Opciones que tenemos disponible para usted:");
        System.out.println("1 _ Buscar libro por nombre");
        System.out.println("2 _ Buscar libro por autor");
        System.out.println("3 _ Agregar libro");
        System.out.println("4 _ Eliminar libro");
        System.out.println("5 _ Agregar usuario");
        System.out.println("6 _ Eliminar usuario");
        System.out.println("7 _ Exit");
    }
    
    public void run(){
        System.out.println("Bienvenido a la Biblioteca publica");
        while(opcion != 7){
            mostrarMenu();
            opcion = pedirOpcion();
            switch(opcion){
                case 1:
                    biblio.buscarLibroPorNombreYMostrar();
                    break;
                case 2:
                    biblio.buscarLibroPorAutorYMostrar();
                    break;
                case 3:
                    biblio.agregarLibro();
                    break;
                case 4:
                {
                    Libro libro = null;
                    biblio.eliminarLibro(libro);
                }
                    break;

                case 5:
                    biblio.agregarUsuario();
                    break;
                case 6:
                    biblio.eliminarUsuario();
                case 7:
                    System.out.println("FIN.");
                
        }
    }
    }
}
