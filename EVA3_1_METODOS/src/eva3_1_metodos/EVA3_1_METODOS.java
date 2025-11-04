/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_metodos;

/**
 *
 * @author Usuario
 */
public class EVA3_1_METODOS {

    
    public static void main(String[] args) {
        //INVOCAR METODO
        //LLAMADA A PROCEDIMIENTO O FUNCION
        //MANERAS DE LLAMAR....
        
        //1. SI QUEREMOS RECUPERAR UN VALOR
        int resu = calcularCuadrado(100);
        System.out.println("EL CUAFRADO DE 100 ES:"+ resu);
        
        //2.USAR EL VALOR SIN GUARDARLO
        System.out.println("EL CUADRADO DE 100 ES" +calcularCuadrado(100));
        
        //3.NO ME INTERESA EL RESULTADO
        calcularCuadrado(100);



    }
    //MODIFICADORES 
    //MODIFICADOR DE ACCESO: publuc, private, protected, default 
    //PUBLIC STATIC
    
    //static ----> se necesita para usar nuestros metodos en el main
    
    //valor de retorno (tipo de dato)
    //nombre del metodo(usar verbo)
    //Lista de parametros
    // 0 o N cantidad..
    public static int calcularCuadrado(int num){ //ENCABEZADO (HEADER)
        
        //{} ---> IMPLEMENTACION DEL METODO (CUERPO DEL METDO)
        int cuadrado = num * num;
        return cuadrado;
        // sout = nose puede poner ya que regresan un valor
        
    }
}
