
package ListadoNumeros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;





public class Main2 {

    static Scanner leer = new Scanner (System.in);

    
   public static void main(String[] args) { 
  
   List<Integer> listado_numeros = new ArrayList<>();
        
Integer aux_contador = 0;       
listado_numeros.add(1);
listado_numeros.add(2);
listado_numeros.add(3);
listado_numeros.add(4);
listado_numeros.add(5);
listado_numeros.add(6); 
listado_numeros.add(7);
listado_numeros.add(8);
listado_numeros.add(9);
listado_numeros.add(10);

for (Integer numero:listado_numeros){
    if(numero>=5){
        aux_contador = aux_contador + 1;
        
    }
}
       System.out.println("los números mayores a 5 son: " + aux_contador);


List<Integer> nums_par_impar = new ArrayList<>();
Integer aux_par = 0;
Integer aux_impar = 0;

nums_par_impar.add(25);
nums_par_impar.add(31);
nums_par_impar.add(28);
nums_par_impar.add(41);
nums_par_impar.add(12);

for (Integer numero : nums_par_impar){
    if(numero % 2 == 0){
        aux_par = aux_par + 1;
    }  else {
        aux_impar = aux_impar + 1;
    }
}
       
       System.out.println("la cantidad de números pares es : " + aux_par);  
       System.out.println("la cantidad de números impares es : " + aux_impar);
   }}
 
    