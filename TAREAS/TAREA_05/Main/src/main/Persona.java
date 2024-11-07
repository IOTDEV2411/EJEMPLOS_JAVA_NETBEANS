package main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AUTOMATION_HPU
 */
public class Persona {
    //Atributos 
    private String nombre; 
    private String apellidos; 
    private int edad; 

    //Constructor Parametrico 
    public Persona (String nombre, String apellidos, int edad) { 
    this.nombre = nombre; 
    this.apellidos = apellidos; 
    this.edad = edad; 
    }
    
    //Metodos Getter 
    public String getNombre() { return nombre; } 
    public String getApellidos() { return apellidos; } 
    public int getEdad() { return edad; }
}
