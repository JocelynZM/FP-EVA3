/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_14_sobrecarga_de_metodos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA3_14_SOBRECARGA_DE_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int valor;
                Scanner captura = new Scanner(System.in);

        do{
            menu();
            valor = captura.nextInt();
            switch(valor){
                
                case 1:
                    Area();
                    break;
                           
                case 2:
                    AreaR();
                    break;
                           
                case 3:
                    AreaT();
                    break;
                           
                case 4:
               System.out.println("FINALIZADO");

                    break;
                           
                
                           
                    
            }
            
        }while(valor != 4);
    }
    
    public static void menu(){
        
        System.out.println("*************CALCULAR AREA*************");
        System.out.println("SELECCIONE UNA OPCIÓN:");
        System.out.println("1.CIRCULO");
        System.out.println("2. RECTANGULO");
        System.out.println("3. TRAPECIO");
        System.out.println("4. SALIR");
        
    }
    //circulo
    public static void Area(){
         Scanner captura = new Scanner(System.in);
        double v;
        System.out.println("INTRODUZCA EL RADIO: ");
        v = captura.nextDouble();
        double resu = resultado_Area(v);
        System.out.println("EL AREA ES: " +resu);
        
       
  
    }
    
    public static double resultado_Area(double resultado){
         
        double re = (Math.PI)*(resultado*resultado);
        return re;
  
    }
    
    //RECTANGULO
    public static void AreaR(){
         Scanner captura = new Scanner(System.in);
        double v,v2;
        System.out.println("INTRODUZCA LA BASE ");
        v = captura.nextDouble();
        System.out.println("INTRODUZCA LA ALTURA : ");
        v2 = captura.nextDouble();
        double resu = resultado_Area(v,v2);
        System.out.println("EL AREA ES: " +resu);
        
       
  
    }
    
    public static double resultado_Area(double resultado,double dos){
         
        double re = resultado*dos;
        return re;
  
    }
    
    //TRAPECIO
    public static void AreaT(){
         Scanner captura = new Scanner(System.in);
        double v,v2,v3;
        System.out.println("INTRODUZCA LA BASE MAYOR ");
        v = captura.nextDouble();
        System.out.println("INTRODUZCA LA BASE MENOR : ");
        v2 = captura.nextDouble();
        System.out.println("INTRODUZCA LA ALTURA : ");
        v3 = captura.nextDouble();
        double resu = resultado_Area(v,v2,v3);
        System.out.println("EL AREA ES: " +resu);
        
       
  
    }
    
    public static double resultado_Area(double resultado,double dos,double tres){
         
        double re = (resultado+dos)/2*tres;
        return re;
  
    }
    
}
