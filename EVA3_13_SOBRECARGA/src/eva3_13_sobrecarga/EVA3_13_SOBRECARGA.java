/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_13_sobrecarga;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA3_13_SOBRECARGA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String resu;
        resu = capturar("INTRODUCE EL NOMBRE DEL CLIENTE:");
        double valor;
        valor = capturar("SALARIO DEL EMPELADO", 0.0);
        System.out.println(valor);
        int edad;
        edad = capturar("EDAD DEL USUARIO",1);
        System.out.println(edad);
        




    }
    
    public static String capturar(String mensaje){
        
        Scanner captura = new Scanner(System.in);
        System.out.println(mensaje);
        return captura.nextLine();
        
    }
    
    public static double capturar(String mensaje, double dummy){
        
        Scanner captura = new Scanner(System.in);
        System.out.println(mensaje);
        return captura.nextDouble();
        
    }
    public static int capturar(String mensaje, int dummy){
        
        Scanner captura = new Scanner(System.in);
        System.out.println(mensaje);
        return captura.nextInt();
        
    }
    
}
