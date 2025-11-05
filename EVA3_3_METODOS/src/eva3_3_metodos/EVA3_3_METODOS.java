/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_metodos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA3_3_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //LOS METODOS SE EJECUTAN EN EL MAIN
        
    
    Scanner captura = new Scanner(System.in);
    int valor;
    
    do{
        imprimirMenu();
        valor = captura.nextInt();
        
        //MANEJO DE OPCIONES --SWITCH
        
        switch (valor){
            case 1:
                System.out.println("******SUMAR 2 NUMEROS*******");
                
                realizarSuma();
                break;
            case 2:
                System.out.println("*******CALCULAR POTENCIA******");
                
                realizarPotencia();
                break;
            case 3:
                break;
            case 4:
                break;
           
        }
        
        
    }while(valor != 4);



    }
    
    //IMPRIMIR UN MENU: 
    
    public static void imprimirMenu(){
        System.out.println("BIENVENIDO AL SISTEMA");
        System.out.println("ELIGE LA OPCION QUE NECESITAS:");
        System.out.println("1. CALCULAR UNA SUMA");
        System.out.println("2. CALCULAR UNA POTENCIA");
        System.out.println("3. IMPRIMIR UN MENSAJE");
        System.out.println("4. TERMINAR");
    }
    
    //SUMAR 2 NUMEROS
    public static void  realizarSuma(){
            Scanner captura = new Scanner(System.in);
            
            System.out.println("VALOR 1 :");
            int val,val2;
            val = captura.nextInt();
            
            System.out.println("VALOR 2 :");
            val2 = captura.nextInt();
            
            int resu = sumar(val,val2);
            System.out.println("LA SUMA ES "+resu);
       
        
    }
    public static int sumar(int num1, int num2){
        
        return num1+ num2;
    
    }
    
    //CALCULAR POTENCIA}
    public static void realizarPotencia(){
        
         Scanner captura = new Scanner(System.in);
            
            System.out.println("BASE:");
            int val,val2;
            val = captura.nextInt();
            
            System.out.println("EXPONENTE:");
            val2 = captura.nextInt();
            
            int resu = calcularPotencia(val,val2);
            System.out.println("LA POTENCIA ES "+resu);
       
        
    }
    
    public static int calcularPotencia(int base, int exponente){
        
           // Math.pow(base, base);
           int acu =1;
           for(int i = 1;i<= exponente;i++){
        
            
            acu = acu*base;
            
            
        }
        return acu;
        
        
    }
}
            
    
        
        


