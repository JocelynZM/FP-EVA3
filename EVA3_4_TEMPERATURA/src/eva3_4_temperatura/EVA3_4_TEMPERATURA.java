/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_4_temperatura;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA3_4_TEMPERATURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion;
        Scanner captura = new Scanner(System.in);
        do{
            Menu();
            opcion = captura.nextInt();
            
            switch(opcion){
                
                case 1:
                    reFarCelsius();
                    break;
                case 2:
                    reCelFar();
                    break;
                case 3:
                    reKelCel();
                    break;
                    
                case 4:
                    System.out.println("FINALIZADO");
                    break;
                    
                    
            }
            
            
        }while(opcion != 4);
        


    }
    
    public static double convertirFarCelcius(double far){
        
       
        double resu = (far-32)/1.8;
        return resu;
    }
    
    public static void reFarCelsius(){
        
          double far;
         Scanner captura = new Scanner(System.in);
        System.out.println("GRADOS FAHRENHEIT: ");
        
        far = captura.nextDouble();
        double resu = convertirFarCelcius(far);
         System.out.println(far+"GRADOS FAHRENHEIT A CELSIUS SON:" +resu);
        
    }
    
    public static double convertirCelFar(double cel){
        double resu = (cel*1.8)+32;
        return resu;

    }
    
    public static void reCelFar(){
        
          double cel;
         Scanner captura = new Scanner(System.in);
        System.out.println("GRADOS CELSIUS: ");
        
        cel = captura.nextDouble();
        double resu = convertirCelFar(cel);
         System.out.println(cel+"GRADOS CELSIUS A FAHRENHEIT SON:" +resu);
        
    }
    
    public static double kelvinCel(double kel){
        
        double resu = kel -273;
        return resu;
    
}
     public static void reKelCel(){
        
          double kel;
         Scanner captura = new Scanner(System.in);
        System.out.println("GRADOS KELVIN: ");
        
        kel = captura.nextDouble();
        double resu = kelvinCel(kel);
         System.out.println(kel+"GRADOS KELVIN A CELSIUS SON:" +resu);
        
    }
    
    public  static void Menu(){
        System.out.println("*********MENU CALCULAR TEMPERATURAS*********");
            System.out.println("INGRESE UNA OPCION:");
            System.out.println("1. FAHRENHEIT A CELSIUS.");
            System.out.println("2. CELSIUS A FAHRENHEIT.");
            System.out.println("3. KELVIN A CELSIUS.");
            System.out.println("4. TERMINAR..");
    }
}
