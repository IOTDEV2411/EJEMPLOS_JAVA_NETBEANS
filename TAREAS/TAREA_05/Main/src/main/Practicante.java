/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author AUTOMATION_HPU
 */
public class Practicante extends Alumno {
    // Atributos Propios de la Clase
    private String IdPracticante; 
    
    //Constructor Parametrico
    public Practicante (String nombre, String apellidos, int edad) { 
        super(nombre, apellidos, edad); 
        IdPracticante = " "; 
    } 
    // Método Setter 
    public void setIdPracticante (String IdPracticante) { this.IdPracticante = IdPracticante; 
    }
    
    // Metodo Getter
    public String getIdPracticante () { return IdPracticante; } 
    
    //Metodo
    @Override
    public String toString() { 
        return "" + getNombre() + " " + getApellidos() + " - " + getEdad() + " - " + getIdPracticante(); 
    }
    
}
