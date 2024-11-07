/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empleado;

/**
 *
 * @author AUTOMATION_HPU
 */
public class Empleado {

    // Atributos
    private String nombre;
    private String apellido;
    private int Sueldo_Anual;
    static private int Numero_Remuneracion_Anual=14; 
    
    // Constructor Parametrico
    public Empleado(String nombre, String apellido, int Sueldo_Anual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Sueldo_Anual = Sueldo_Anual;
    }
    public int get_cantidad_remunacion_anual(){
        return this.Numero_Remuneracion_Anual;
    }
    public void set_cantidad_remuneracion_anual(int n){
        this.Numero_Remuneracion_Anual = n;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado emp_01 = new Empleado("Simeon","Vega",84000);
        Empleado emp_02 = new Empleado ("Juan","Perez",50000);
        emp_02.set_cantidad_remuneracion_anual(12);
        System.out.println(emp_01.Numero_Remuneracion_Anual);
        
    }
    
}
