/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_02;
import javax.swing.*;  

public class EJEMPLO_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciamos la clase JFrame
        JFrame f= new JFrame("EJEMPLO 02: Campo para Texto"); 
        // Declaramos nuestros objetos tipo JTextField
        JTextField t1,t2;  
        // Instanciamos nuestra clase JTextField
        // Configuramos la posicion (x,y) en la ventana f
        // Asi como las dimensiones de este "Campo de Texto"
        t1=new JTextField("Bienvenidos al curso: ");  
        t1.setBounds(50,100, 200,30);  
        t2=new JTextField("Desarrollo de Software II");  
        t2.setBounds(50,150, 200,30);  
        f.add(t1); f.add(t2);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
    }
    
}
