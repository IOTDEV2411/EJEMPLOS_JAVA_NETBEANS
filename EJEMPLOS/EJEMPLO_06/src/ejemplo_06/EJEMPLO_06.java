/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_06;
import javax.swing.*;
/**
 *
 * @author AUTOMATION_HPU
 */
public class EJEMPLO_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instaciamos la clase JFrame 
        // Para crear el objeto "f"
        JFrame f=new JFrame("EJEMPLO 06: Botones de Opcion");
        // Instaciamos la clase JLabel 
        // Para crear los objetos "l1" y "l2"
        JLabel l1 = new JLabel("Responda la encuesta...");
        JLabel l2 = new JLabel("Cual es mejor Lenguaje de Programacion?");
        // Instaciamos la clase JRadioButton 
        // Para crear los objetos "r1", "r2" y "r3"
        JRadioButton r1=new JRadioButton("A) C++");    
        JRadioButton r2=new JRadioButton("B) Java");
        JRadioButton r3=new JRadioButton("C) Python");
        // Asignamos la posicion x,y de cada elemento
        // Asignamos las dimensiones de cada elemento
        l1.setBounds(75,50,200,50);
        l2.setBounds(75,100,300,50);
        r1.setBounds(75,150,100,30);    
        r2.setBounds(75,200,100,30); 
        r3.setBounds(75,250,100,30);
        // Se instancia la clase ButtonGroup
        // El objeto creado agrupara a todos los Botones de Opciones
        // Esto, con el fin de que solo podamos seleccionar a un
        // solo boton de opcion a la vez
        ButtonGroup bg=new ButtonGroup();
        // Agregamos los botones de opcion a "ButtonGroup"
        // Tener presente que este ultimo no es visible y
        // Solo se usa para poder escoger solo un boton de opcion a la vez
        bg.add(r1);bg.add(r2);bg.add(r3);
        // Agregamos elementos al Marco Principal
        f.add(l1);f.add(l2);
        f.add(r1);f.add(r2);f.add(r3);      
        f.setSize(400,400);    
        f.setLayout(null);    
        f.setVisible(true);    
    }
    
}
