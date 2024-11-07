/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

public class Alumno extends Persona{
    
    //Atributos propios de la subclase. 
    private String IdAlumno;
    
    //Constructor Parametrico
    public Alumno (String nombre, String apellidos, int edad) { 
        super(nombre, apellidos, edad); 
        IdAlumno = " "; 
    } 
    // Método Setter
    public void setIdAlumno (String IdAlumno) { this.IdAlumno = IdAlumno; }
    
    // Método Getter
    public String getIdAlumno () { return IdAlumno; } 
    
    // Metodo
    @Override
    public String toString() { 
        return "" + getNombre() + " " + getApellidos() + " - " + getEdad() + " - " + getIdAlumno(); 
    }
}
