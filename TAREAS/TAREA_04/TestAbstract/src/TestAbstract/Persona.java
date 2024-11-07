/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TestAbstract;

/**
 *
 * @author Instructor
 */
public class Persona {

    // Atributos de la Clase
    private String nombre; 
    private String apellidos; 
    private int edad;

    // Constructor por Defecto
    public Persona() { nombre = ""; apellidos = ""; edad = 0; }

    // Constructor parametrico
    public Persona (String nombre, String apellidos, int edad) { this.nombre = nombre; 
    this.apellidos = apellidos; this.edad = edad; }

    // Metodos Getter
    public String getNombre() { return nombre; }

    public String getApellidos() { return apellidos; }

    public int getEdad() { return edad; }

    // Metodos Setter

    public void setNombre(String nombre){this.nombre=nombre;}

    public void setApellidos(String apellidos){this.apellidos=apellidos;}

    public void setEdad(int edad){this.edad=edad;}

    // Metodos de la clase Persona
    public String toString() { Integer datoEdad = edad;
    return "-Nombre: ".concat(nombre).concat(" -Apellidos: ").concat(apellidos).concat(" -Edad: ").concat(datoEdad.toString()); }
    
}
