/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_05;
import javax.swing.*;

public class EJEMPLO_05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f= new JFrame("EJEMPLO 05: Botones de Casilla");
        JLabel l1,l2;
        // Instaciamos la clase JLabel para l1 y l2
        // Configuramos la posicion x,y y las dimensiones
        // de las etiquetas l1, l2 y l3
        l1=new JLabel("Indique cual es el lenguaje para desarrollo Backend?"); 
        l2=new JLabel("Escoja todas las que apliquen");
        l1.setBounds(75,50, 350,30);
        l2.setBounds(75,100, 250,30);
        // Instanciamos la clase JCheckBox
        JCheckBox checkBox1 = new JCheckBox("Javascript");  
        checkBox1.setBounds(100,150, 100,50);  
        JCheckBox checkBox2 = new JCheckBox("Java");  
        checkBox2.setBounds(100,200, 100,50);
        JCheckBox checkBox3 = new JCheckBox("Python");  
        checkBox3.setBounds(100,250, 100,50);
        // Agregamos todos los elementos al marco "f"
        f.add(l1);f.add(l2);
        f.add(checkBox1);  
        f.add(checkBox2);
        f.add(checkBox3);
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true); 
    }
    
}
