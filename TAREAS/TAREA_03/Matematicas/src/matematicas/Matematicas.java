/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matematicas;


public class Matematicas {

    public static void calcular_perimetro_rectangulo(int a,int b){
        System.out.println("El perimetro del rectangulo es: "+2*(a+b));
    }
    
    public static void calcular_area_rectangulo(int a, int b){
        System.out.println("El area del rectangulo es: "+a*b);
    }
    
    public static void main(String[] args) {
        
        int a = 3;int b = 4;
        calcular_perimetro_rectangulo(a,b);
        calcular_area_rectangulo(a,b);
        
    }
    
}
