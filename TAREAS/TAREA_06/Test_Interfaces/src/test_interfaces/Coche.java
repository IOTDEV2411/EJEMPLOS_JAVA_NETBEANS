/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_interfaces;

/**
 *
 * @author Instructor
 */
public class Coche implements Vehiculo{
    
    private String modelo;
    private String placa;
    
    public Coche(){
        this.modelo = " ";
        this.placa = " ";
    }
    
    public Coche(String modelo, String placa){
        this.modelo = modelo;
        this.placa = placa;
    }
    
    @Override
    public void arrancar() {
    System.out.println("Arrancando el coche...");
    }
    @Override
    public void detener() {
    System.out.println("Deteniendo el coche...");
    }
    
}
