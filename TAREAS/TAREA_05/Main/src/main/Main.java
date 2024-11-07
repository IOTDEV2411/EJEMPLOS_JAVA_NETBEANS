/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Profesor profesor1 = new Profesor ("Profesor", "Mendoza Cuba", 33); 
        //profesor1.setIdProfesor("PROFESOR123456789"); 
        System.out.println(profesor1.toString()); 
        Alumno alumno1 = new Alumno ("Alumno", "Pardo Manila", 15); 
        alumno1.setIdAlumno("ALUMNO123456789"); 
        System.out.println(alumno1.toString()); 
        Practicante practicante1 = new Practicante ("Practicante", "Torres Nilo", 19); 
        practicante1.setIdPracticante("PRACTICANTE123456789"); 
        System.out.println(practicante1.toString()); 
    }
    
}
