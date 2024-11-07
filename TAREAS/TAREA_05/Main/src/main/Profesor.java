/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

public class Profesor extends Persona {
    
    //Atributos propios de la subclase 
    private String IdProfesor; 
    
    //Constructor por Defecto 
    public Profesor(){
    super(" "," ",0);
    IdProfesor = " ";
    }
    
    //Constructor Parametrico 
    public Profesor(String nombre, String apellidos, int edad) { 
        super(nombre, apellidos, edad); 
        IdProfesor = " "; 
    }
    
    // Método Setter 
    public void setIdProfesor (String IdProfesor) { this.IdProfesor = IdProfesor; } 
    
    // Método Getter
    public String getIdProfesor () { return IdProfesor; } 
    
    // Metodo
    @Override
    public String toString() { 
        return "" + getNombre() + " " + getApellidos() + " - " + getEdad() + " - " + getIdProfesor(); 
    }   
}
