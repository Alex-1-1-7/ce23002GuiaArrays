
package ejercicio02;

import java.util.Scanner;


public class Ejercicio02 {
    public static void main (String[] args) {
    Scanner entrada = new Scanner(System.in);
    int i,sumaPositivos=0,contadorCeros=0,contadorPositivos=0,
            contadorNegativos=0,sumaNegativos=0;
    double mediaPositivos,mediaNegativos;
    int [] numeros = new int[5];
    for (i=0; i<5;i++){
        System.out.println("Ingrese 5 numeros");
        numeros [i] = entrada.nextInt();
    // Media de los numeros positivos
    if (numeros[i]> 0){
    sumaPositivos+=numeros[i];
    contadorPositivos++;
    //negativos
    }else  if(numeros[i]< 0){
    sumaNegativos+=numeros[i];
    contadorNegativos++;
    } 
    // ceros 
    else if (numeros[i]==0){
    contadorCeros++;
    }
    }
    if(contadorPositivos>0){
    mediaPositivos = (double) sumaPositivos/contadorPositivos;
    System.out.println("La media de los numeros positivos es: "+mediaPositivos);
    }
    if (contadorNegativos>0){
    mediaNegativos= (double) sumaNegativos/contadorNegativos;
    System.out.println("La media de los numeros negativos es: "+mediaNegativos);
    }     
    {
        System.out.println("La cantidad de ceros ingresados fue: "+contadorCeros);
    }    
    
    }
    
}
