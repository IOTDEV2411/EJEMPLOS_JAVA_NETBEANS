/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea_02;
import javax.swing.*;

public class TAREA_02 {
    
    public static void labels(JPanel panel){
        
        JLabel l1, l2, l3, l4, l5, l6;
        l1 = new JLabel("Nombre: ");
        l2 = new JLabel("Clave: ");
        l3 = new JLabel("Genero: ");
        l4 = new JLabel("Idiomas: ");
        l5 = new JLabel("Grado: ");
        l6 = new JLabel("Comentarios: ");
        GroupLayout groupLayout = new GroupLayout(panel);
        // Definir el grupo horizontal
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGap(25)
                    .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(l1)
                        .addComponent(l2)
                        .addComponent(l3)
                        .addComponent(l4)
                        .addComponent(l5)
                        .addComponent(l6)    
                        )
                    .addContainerGap(300, Short.MAX_VALUE))
        );
        // Definir el grupo vertical
        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGap(75)
                    .addComponent(l1)
                    .addGap(25)
                    .addComponent(l2)
                    .addGap(25)
                    .addComponent(l3)
                    .addGap(25)
                    .addComponent(l4)
                    .addGap(25)
                    .addComponent(l5)
                    .addGap(25)
                    .addComponent(l6)    
                    .addContainerGap(200, Short.MAX_VALUE))
        );
        panel.setLayout(groupLayout);     
    }
    
    public static void main(String[] args) {
        
        JFrame f = new JFrame("Formulario");
        // Creacion de Panel para Agrupamiento de Etiquetas
        JPanel panel_01 = new JPanel();
        labels(panel_01);
        JTextField tf1=new JTextField();
        tf1.setBounds(150, 60, 400, 25);
        JPasswordField pf1=new JPasswordField();
        pf1.setBounds(150, 110, 400, 25);
        JCheckBox checkBox1, checkBox2, checkBox3;
        checkBox1 = new JCheckBox("Español",true);
        checkBox2 = new JCheckBox("Ingles",true);
        checkBox3 = new JCheckBox("Italiano");
        checkBox1.setBounds(150, 200, 100, 50);
        checkBox2.setBounds(250, 200, 100, 50);
        checkBox3.setBounds(350, 200, 100, 50);
        String nivel[] = {"Inicial","Primaria","Superior"};
        JComboBox cb=new JComboBox(nivel);
        cb.setBounds(150, 260, 100, 25);
        JRadioButton r1, r2;
        r1=new JRadioButton("Masculino",true);    
        r2=new JRadioButton("Femenino");
        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);bg.add(r2);
        r1.setBounds(150, 150, 100, 50);
        r2.setBounds(250, 150, 100, 50);
        JTextArea area=new JTextArea();  
        area.setBounds(150,300,400,200);
        JButton b1, b2;
        b1 = new JButton("Enviar");
        b2 = new JButton("Aceptar");
        b1.setBounds(50, 525, 100, 25);
        b2.setBounds(450, 525, 100, 25);
        f.add(area);
        f.add(tf1);f.add(pf1);
        f.add(checkBox1);f.add(checkBox2);f.add(checkBox3);
        f.add(cb);
        f.add(r1);f.add(r2);
        f.add(b1);f.add(b2);
        f.add(panel_01);
        f.setSize(600,600);    
        // Configurar la acción de cerrar la ventana
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }   
}
