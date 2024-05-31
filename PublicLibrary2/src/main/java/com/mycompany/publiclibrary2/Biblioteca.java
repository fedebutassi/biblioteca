/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.publiclibrary2;


import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Biblioteca {
    private List<Libro> libros;
    private List<Persona> personas;
    
    
    
    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.personas = new ArrayList<>();
    }
    
    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public List<Persona> getUsuarios() {
        return personas;
    }

    public void setUsuarios(List<Persona> personas) {
        this.personas = personas;
    }
    
    
    
    public void agregarLibro() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del libro: ");
        String nombreLibro = scanner.nextLine();

        System.out.println("Ingrese el nombre del autor: ");
        String nombreAutor = scanner.nextLine();

        System.out.println("Ingrese el género del libro: ");
        String generoLibro = scanner.nextLine();
        String dni = "0";

        Libro libroNuevo = new Libro(nombreLibro, new Persona(dni, nombreAutor), generoLibro);

        libros.add(libroNuevo);

        System.out.println("Libro agregado exitosamente!");
    }

    public void eliminarLibro(Libro libro) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del libro: ");
        String nombreLibro = scanner.nextLine();

        System.out.println("Ingrese el nombre del autor: ");
        String nombreAutor = scanner.nextLine();

        System.out.println("Ingrese el género del libro: ");
        String generoLibro = scanner.nextLine();
        String dni = "0";
        Libro libroaEliminar = new Libro(nombreLibro,new Persona(dni, nombreAutor),generoLibro);
        libros.remove(libro);
        System.out.println("Libro eliminado correctamente");
    }
    Scanner scanner = new Scanner(System.in);
    
    public Libro buscarLibroPorNombre(String nombreLibro) {
        for (Libro libro : libros) {
            if (libro.getNombre().equalsIgnoreCase(nombreLibro)) {
                return libro;
            }
        }
        return null;
    }
    
    
    public void buscarLibroPorNombreYMostrar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del libro que desea buscar: ");
        String nombreLibro = scanner.nextLine();

        Libro libroBuscado = buscarLibroPorNombre(nombreLibro);

        if (libroBuscado != null) {
            System.out.println("\nLibro encontrado:");
            System.out.println("Nombre: " + libroBuscado.getNombre());
            System.out.println("Autor: " + libroBuscado.getAutor().getNombre());
            System.out.println("Genero: " + libroBuscado.getGenero());
        } else {
            System.out.println("\nNo se encontró el libro especificado.");
        }
    }   

    public List<Libro> buscarLibroPorAutor(String nombreAutor) {
        List<Libro> librosEncontrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAutor().getNombre().equalsIgnoreCase(nombreAutor)) {
                librosEncontrados.add(libro);
            }
        }
        return librosEncontrados;
    }
    
    public void buscarLibroPorAutorYMostrar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del autor que desea buscar: ");
        String nombreAutor = scanner.nextLine();

        List<Libro> librosEncontrados = buscarLibroPorAutor(nombreAutor);

        if (librosEncontrados.isEmpty()) {
            System.out.println("\nNo se encontró el autor especificado.");
            
        } else {
            for (Libro libro : librosEncontrados) {
            System.out.println("\nLibros encontrados del autor: " + nombreAutor);
            System.out.println("Nombre: " + libro.getNombre());
            System.out.println("Autor: " + libro.getAutor().getNombre());
            System.out.println("Genero: " + libro.getGenero());
        }
    }
    }
    public void agregarUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del usuario: ");
        String nombreUsuario = scanner.nextLine();

        System.out.println("Ingrese el DNI del usuario: ");
        String contraseñaUsuario = scanner.nextLine();

        Persona usuarioNuevo = new Persona(nombreUsuario, contraseñaUsuario);
        personas.add(usuarioNuevo);

        System.out.println("Usuario agregado exitosamente!");
    }
    public void eliminarUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del usuario: ");
        String nombreUsuario = scanner.nextLine();

        System.out.println("Ingrese el DNI del usuario: ");
        String contraseñaUsuario = scanner.nextLine();

        Persona usuarioNuevo = new Persona(nombreUsuario, contraseñaUsuario);
        personas.remove(usuarioNuevo);

        System.out.println("Usuario eliminado exitosamente!");
    }
    
}
    
    

