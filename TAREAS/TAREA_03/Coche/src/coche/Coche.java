/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coche;

/**
 *
 * @author AUTOMATION_HPU
 */
public class Coche {

     // Atributos 
    private String modelo; 
    private int velocidadMaxima; 
    private int potenciaMotor; 
    private boolean enMarcha;
 
    // Constructor Parametrico
    public Coche(String modelo, int velocidadMaxima, int potenciaMotor) { 
        this.modelo = modelo; 
        this.velocidadMaxima = velocidadMaxima; 
        this.potenciaMotor = potenciaMotor; 
        this.enMarcha = false; // El coche comienza apagado 
    } 
 
    // Métodos 
    public void acelerar() { 
        if (enMarcha) { 
            System.out.println("El coche " + modelo + " está acelerando."); 
        } else { 
            System.out.println("Primero enciende el coche."); 
        } 
    } 
    
    public void frenar() { 
        if (enMarcha) { 
            System.out.println("El coche " + modelo + " está frenando."); 
        } else { 
            System.out.println("El coche está apagado, no se puede frenar."); 
        } 
    } 
    public void encender() { 
        enMarcha = true; 
        System.out.println("El coche " + modelo + " se ha encendido."); 
    } 

    public void apagar() { 
        enMarcha = false; 
        System.out.println("El coche " + modelo + " se ha apagado."); 
    } 
    
    public static void main(String[] args) {
        // TODO code application logic here
        Coche c_01 = new Coche("Toyota",100,25);
        // Coche c_02 = new Coche("Mazda",150,50);
        c_01.encender();
        c_01.acelerar();
        c_01.frenar();
        c_01.apagar();
        
    }
    
}
