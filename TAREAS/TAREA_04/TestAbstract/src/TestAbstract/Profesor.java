/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestAbstract;

/**
 *
 * @author Instructor
 */
public abstract class Profesor extends Persona {
    
    // Atributos de la Clase Heredada
    private String IdProfesor; 
 
    // Constructores
    public Profesor () { super(); IdProfesor = "Unknown"; } 
    public Profesor (String nombre, String apellidos, int edad, String id) { super(nombre, apellidos, edad) ; IdProfesor = id; }
 
    // Métodos
    public void setIdProfesor (String IdProfesor) { this.IdProfesor = IdProfesor; }
    public String getIdProfesor () { return IdProfesor; }
    public void mostrarDatos() {
    System.out.println ("Datos Profesor. Profesor de nombre: " + getNombre() + " " + getApellidos() + " con Id de profesor: " + getIdProfesor() ); }
    @Override
    public String toString () { return super.toString().concat(" -IdProfesor:").concat(IdProfesor); }
    abstract public float importeNomina (); // Método abstracto
    
}
