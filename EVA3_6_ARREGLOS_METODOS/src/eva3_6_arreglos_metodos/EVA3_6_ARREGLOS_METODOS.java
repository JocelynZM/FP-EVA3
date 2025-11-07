/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_arreglos_metodos;

/**
 *
 * @author Usuario
 */
public class EVA3_6_ARREGLOS_METODOS {

   static String[] menu = {"PRODUCTOS","VENTAS","CLIENTES","SALIR"};
   static String[] productos = {"TACOS","TORTAS","TAMALES","SALIR"};
   
   
    public static void main(String[] args) {
        imprimirArreglo(menu);
        imprimirArreglo(productos);
    }
     public static void imprimirArreglo(String[] arreglo){
        
        
        for(int i = 0; i< arreglo.length; i++){
            System.out.println((i +1)+". "+arreglo[i]);
        }
         System.out.println("");
    }
     
}
