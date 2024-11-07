/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persona;

/**
 *
 * @author AUTOMATION_HPU
 */
public class Persona {
    // Atributos
    // No accesibles directamente desde fuera de la clase
    // Ese es el porque de usar el modificador de acceso "Private"
    private String nombre; 
    private int edad; 
 
    // Constructor por Defecto
    public Persona(){
        this.nombre = "Simeon";
        this.edad = 38;
    }
    
    // Constructor Parametrico
    public Persona(String nombre, int edad) { 
        this.nombre = nombre; 
        this.edad = edad;
    }
    
     public Persona(String nombre) { 
        this.nombre = nombre; 
        this.edad = 35;
    }
 
    // Método 
    public void saludar() { 
        System.out.println("Hola, soy " + this.nombre + " y tengo " + this.edad + " años."); 
    } 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p_01 = new Persona("Bryan");
        p_01.saludar();
        
    }
    
}
