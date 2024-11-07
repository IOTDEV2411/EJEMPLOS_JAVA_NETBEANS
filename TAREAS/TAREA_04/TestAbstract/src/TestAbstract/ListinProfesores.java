/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestAbstract;
// import java.util.*;
import java.util.ArrayList; 
import java.util.Iterator;

/**
 *
 * @author Instructor
 */
public class ListinProfesores {
    
    // Atributos
    private ArrayList <Profesor> listinProfesores;  
    
    //Constructor
    public ListinProfesores () { listinProfesores = new ArrayList <Profesor> (); } 
    
    // Metodos
    public void addProfesor (Profesor profesor) { listinProfesores.add(profesor); } 
  
    public void imprimirListin() {
    String tmpStr1 = ""; //String temporal que usamos como auxiliar
    System.out.println ("Se procede a mostrar los datos de los profesores existentes en el listín \n");
    for (Profesor tmp: listinProfesores) { System.out.println (tmp.toString () );
    if (tmp instanceof ProfesorInterino) { tmpStr1 = "Interino";} else { tmpStr1 = "Titular"; }
    System.out.println("-Tipo de este profesor:"+tmpStr1+" -Nómina de este profesor: "+(tmp.importeNomina())+ "\n");}
    }
    
    public float importeTotalNominaProfesorado() {
    float importeTotal = 0f; //Variable temporal que usamos como auxiliar
    Iterator<Profesor> it = listinProfesores.iterator();
    while (it.hasNext() ) { importeTotal = importeTotal + it.next().importeNomina(); }
    
    return importeTotal; 
 } //Cierre del método importeTotalNominaProfesorado

    
}
