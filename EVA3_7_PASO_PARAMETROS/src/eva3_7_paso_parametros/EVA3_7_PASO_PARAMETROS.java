/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_paso_parametros;

/**
 *
 * @author Usuario
 */
public class EVA3_7_PASO_PARAMETROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int nume = 5;
        System.out.println(nume);
        System.out.println("ORIGINAL ="+nume);
                incrementar(nume);//SE MANDA UNA COPIA DEL VALOR ALMACENADO EN nume

        System.out.println("DESPUES DE INCREMENTAR = "+nume);
        



    }
    //INCREMENTA UN ENTERO EN
    public static void incrementar(int valor){
        valor = valor +1;
    }
    
}
