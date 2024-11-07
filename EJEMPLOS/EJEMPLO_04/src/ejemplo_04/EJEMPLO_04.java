/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_04;
import javax.swing.*;
/**
 *
 * @author AUTOMATION_HPU
 */
public class EJEMPLO_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciamos nuestra clase JFrame
        JFrame f=new JFrame("EJEMPLO 04: Botones"); 
        // Instanciamos nuestra clase JButton
        JButton b=new JButton("OK");
        // Configuramos su posicion x,y
        // Configuramos sus dimensiones
        b.setBounds(150,150,95,30); 
        // b.setBounds(50,50,45,30);
        // Agregamos el icono al marco actual
        // f.add(b);
        // Configuramos las dimensiones del marco
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);   
    }
    
}
