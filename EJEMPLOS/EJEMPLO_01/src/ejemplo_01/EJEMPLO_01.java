/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_01;

import javax.swing.*;  

public class EJEMPLO_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciamos nuestra clase JFrame
        // Para crear el objeto "f"
        JFrame f= new JFrame("EJEMPLO 01: Etiquetas");
        // Declaramos nuestros objetos JLabel l1, l2 y l3
        JLabel l1,l2,l3;
        // Instaciamos la clase JLabel para l1, l2 y l3
        // Configuramos la posicion x,y y las dimensiones
        // de las etiquetas l1, l2 y l3
        l1=new JLabel("Bienvenidos sean todos");  
        l1.setBounds(75,50, 150,30);  
        l2=new JLabel("Curso: Desarrollo de Software");  
        l2.setBounds(75,100, 200,30);
        l3=new JLabel("Instructor: Simeon Vega");
        l3.setBounds(75,150, 150,30);
        // Agregamos las etiquetas a nuestro marco "f"
        f.add(l1); f.add(l2); f.add(l3);
        // Indicamos las dimensiones de nuestro marco "f"
        f.setSize(350,350);  
        f.setLayout(null);
        // Lo hacemos visible para el usuario.
        f.setVisible(true);  
    }
    
}
