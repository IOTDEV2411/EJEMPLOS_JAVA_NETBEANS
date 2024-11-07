/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test_interfaces;


public class Test_Interfaces {

    public static void main(String[] args) {
        Coche tesla = new Coche();
        tesla.arrancar();
        System.out.println(tesla.maxVel);
        tesla.hacer_sonido();
        Moto yamaha = new Moto();
        yamaha.arrancar();
        System.out.println(yamaha.maxVel);
        yamaha.hacer_sonido();
    }
    
}
