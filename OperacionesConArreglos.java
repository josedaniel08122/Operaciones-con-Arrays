/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionesconarreglos;

/**
 *
 * @author josed
 */
public class OperacionesConArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // arrays definidos
        
        int[]arreglo1={5, 10, 15, 20, 25};
        int[]arreglo2={1, 2, 3, 4, 5};
        
        //Sumar 2 arreglos elemento por elemento
        int[]suma=new int[arreglo1.length];
        
        for(int i=0;i<arreglo1.length;i++){
            suma[i]=arreglo1[i]+arreglo2[i];
        }
        
        //Recorrer arreglo e imprimir sus elementos
        System.out.println("Elementos del arreglo 1:");
        for(int i=0;i<arreglo1.length;i++){
            System.out.println("Elemento"+(i+1)+":"+arreglo1[i]);
        }
        
        
        //Multiplicar arreglos
        int[]multiplicacion=new int[arreglo1.length];
        
        for(int i=0;i<arreglo1.length;i++){
            multiplicacion[i]=arreglo1[i]*arreglo2[i];
        }
        System.out.println("Multiplicación del arreglo");
        for(int i=0;i<multiplicacion.length;i++){
            System.out.println("Elemento" + (i+1) + ":" +multiplicacion[i]);
        }
        
        
        //Extraer información: valor máximo, mínimo y promedio
        int maximo=arreglo1[0];
        int minimo=arreglo1[0];
        int sumaTotal=0;
        
        for (int i = 0; i <arreglo1.length; i++) {
            //encontrar el máximo y mínimo
        if(arreglo1[i]>maximo){
            maximo=arreglo1[i];
        }
        
        if(arreglo1[i]<minimo){
            minimo=arreglo1[i];
        }
        //Sumar los elemntos para calcular el promedio
        sumaTotal +=arreglo1[i];
        }
        //Calcular promedio
        double promedio=(double)sumaTotal/ arreglo1.length;
        System.out.println("Información extraída del arreglo1");
        System.out.println("Valor máximo: "+maximo);
        System.out.println("Valor mínimo: "+minimo);
        System.out.println("Valor promedio: "+promedio);
        
    }
    
}
