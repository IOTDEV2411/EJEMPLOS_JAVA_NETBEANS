/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_03;
import javax.swing.*;
/**
 *
 * @author AUTOMATION_HPU
 */
public class EJEMPLO_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciamos la clase JFrame 
        JFrame f=new JFrame("EJEMPLO 03: Caja de Opciones");
        // Declaramos nuestra variable String, que usaremos como opciones
        String cursos[]={"Azure","Web","Software","Programacion","Calidad"};
        // Instanciamos nuestra clase JComboBox
        JComboBox cb=new JComboBox(cursos);
        // Configuramos su posicion x,y y sus dimensiones
        cb.setBounds(50, 50,90,20);  
        // Agregamos el ComboBox al marco actual
        f.add(cb);        
        f.setLayout(null); 
        // Configuramos la dimension del marco
        f.setSize(400,500);    
        f.setVisible(true);  
    }
    
}
