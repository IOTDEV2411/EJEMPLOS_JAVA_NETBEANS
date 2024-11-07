/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestAbstract;

import java.util.Calendar;

/**
 *
 * @author Instructor
 */
public class ProfesorInterino extends Profesor{
    
    // Atributos
    private Calendar fechaComienzoInterinidad;
    
    // Constructores
    
    public ProfesorInterino (Calendar fechaInicioInterinidad) {
    super(); fechaComienzoInterinidad = fechaInicioInterinidad; }
    
    public ProfesorInterino (String nombre, String apellidos, int edad, String id, Calendar fechaInicioInterinidad) {
    super(nombre, apellidos, edad, id);
    fechaComienzoInterinidad = fechaInicioInterinidad; }
    
    // Metodos Getter
    public Calendar getFechaComienzoInterinidad () { return fechaComienzoInterinidad;} //Método
    
    // Metodos
    @Override
    public String toString () { // Sobreescritura del método  
    return super.toString().concat (" Fecha comienzo interinidad: ").concat(fechaComienzoInterinidad.getTime().toString()); }
    @Override
    public float importeNomina () { return 30f * 35.60f ; } //Método abstracto sobreescrito 
    
}
