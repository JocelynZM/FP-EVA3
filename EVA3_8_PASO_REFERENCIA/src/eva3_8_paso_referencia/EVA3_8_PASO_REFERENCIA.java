/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_8_paso_referencia;

/**
 *
 * @author Usuario
 */
public class EVA3_8_PASO_REFERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] datos = new int[1];
        datos[0] = 5;
        System.out.println(datos);
        System.out.println("ORIGINAL ="+datos[0]);
        incrementar(datos);
        System.out.println("");
        System.out.println("DESPUES DE INCREMENTAR ="+datos[0]);
        //en arreglos 
        



    }
    //INCREMENTA UN VALOR EN
      public static void incrementar(int[] arreglo){
          
          System.out.println(arreglo);//LA DIRECCION DE MEMORIA
        for(int i = 0; i<arreglo.length;i++){
            arreglo[i]++;
            //arreglo[i] = arreglo[i]+1 es lo mismo que lo de arriba
        }
    }
    
}
