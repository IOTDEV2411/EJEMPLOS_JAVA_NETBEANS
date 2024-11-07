/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea_01;
import javax.swing.*;

public class TAREA_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear el JFrame
        JFrame ventana = new JFrame("Marco de Muestra");
        
        // Crear el JPanel
        JPanel panel = new JPanel();
        
        // Crear la JLabel y JButton
        JLabel label = new JLabel("Etiqueta Estatica");
        JButton button = new JButton("Boton");
        
        // Crear el GroupLayout para el panel
        GroupLayout groupLayout = new GroupLayout(panel);
        panel.setLayout(groupLayout);
        
        // Configurar el auto-gap para mejor espaciado entre componentes
        groupLayout.setAutoCreateGaps(true);
        groupLayout.setAutoCreateContainerGaps(true);
        
        // Definir el grupo horizontal
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGap(250)
                    .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(label)
                        .addComponent(button))
                    .addContainerGap(300, Short.MAX_VALUE))
        );
        
        // Definir el grupo vertical
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGap(150)
                    .addComponent(label)
                    .addGap(25)
                    .addComponent(button)
                    .addContainerGap(200, Short.MAX_VALUE))
        );
        
        // Añadir el panel al JFrame
        ventana.add(panel);
        
        // Configurar el tamaño de la ventana
        ventana.setSize(600, 400);
        
        // Centrar la ventana en la pantalla
        ventana.setLocationRelativeTo(null);
        
        // Configurar la acción de cerrar la ventana
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Hacer visible la ventana
        ventana.setVisible(true);
    }
    
}
