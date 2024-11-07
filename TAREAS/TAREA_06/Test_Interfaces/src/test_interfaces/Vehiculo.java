/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package test_interfaces;

public interface Vehiculo {
    public String matricula = " ";
    public float maxVel = 180.0f;
    public void arrancar();
    public void detener();
    default void hacer_sonido(){
    System.out.println("Sonando claxon");}

}
