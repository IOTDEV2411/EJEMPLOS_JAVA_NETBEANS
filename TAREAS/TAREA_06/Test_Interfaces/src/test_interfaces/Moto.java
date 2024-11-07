/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_interfaces;

public class Moto implements Vehiculo{
    
    private String modelo;
    private String placa;
    private int anio;
    
    public Moto(){
        this.modelo = " ";
        this.placa = " ";
        this.anio = 1984;
    }
    
    public Moto(String modelo, String placa,int anio){
        this.modelo = modelo;
        this.placa = placa;
        this.anio = anio;
    }
    
    @Override
    public void arrancar() {
    System.out.println("Arrancando la moto...");
    }
    @Override
    public void detener() {
    System.out.println("Deteniendo la moto...");
    }
    
}
