/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacionesconarreglos;

/**
 *
 * @author josed
 */
public class OperacionesConArreglos2 {
    
public static void main(String[] args) {
        // arrays definidos
        
        int[]arreglo1={5, 10, 15, 20, 25};
        int[]arreglo2={1, 2, 3, 4, 5};
        
        //Sumar 2 arreglos elemento por elemento
        int[]suma=new int[arreglo2.length];
        
        for(int i=0;i<arreglo2.length;i++){
            suma[i]=arreglo1[i]+arreglo2[i];
        }
        
        //Recorrer arreglo e imprimir sus elementos
        System.out.println("Elementos del arreglo 2:");
        for(int i=0;i<arreglo2.length;i++){
            System.out.println("Elemento"+(i+1)+":"+arreglo2[i]);
        }
        
        
        //Multiplicar arreglos
        int[]multiplicacion=new int[arreglo2.length];
        
        for(int i=0;i<arreglo2.length;i++){
            multiplicacion[i]=arreglo1[i]*arreglo2[i];
        }
        System.out.println("Multiplicación del arreglo");
        for(int i=0;i<multiplicacion.length;i++){
            System.out.println("Elemento" + (i+1) + ":" +multiplicacion[i]);
        }
        
        
        //Extraer información: valor máximo, mínimo y promedio
        int maximo=arreglo2[0];
        int minimo=arreglo2[0];
        int sumaTotal=0;
        
        for (int i = 0; i <arreglo2.length; i++) {
            //encontrar el máximo y mínimo
        if(arreglo2[i]>maximo){
            maximo=arreglo2[i];
        }
        
        if(arreglo2[i]<minimo){
            minimo=arreglo2[i];
        }
        //Sumar los elemntos para calcular el promedio
        sumaTotal +=arreglo2[i];
        }
        //Calcular promedio
        double promedio=(double)sumaTotal/ arreglo2.length;
        System.out.println("Información extraída del arreglo2");
        System.out.println("Valor máximo: "+maximo);
        System.out.println("Valor mínimo: "+minimo);
        System.out.println("Valor promedio: "+promedio);
        
    }
    
}

