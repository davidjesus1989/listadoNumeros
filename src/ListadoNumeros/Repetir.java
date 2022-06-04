package ListadoNumeros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Repetir {
public static void main(String[]args){
    Scanner leer = new Scanner(System.in);
    List<Double> numeros = new ArrayList();
    System.out.println("digite los numeros por favor");
    int cantidad_numero = 4;
        
for (int i = 0; i < cantidad_numero; i++){
  Double valor = leer.nextDouble();
            
    numeros.add(valor);
while ((valor <1.0)||(valor >7.0)){
    System.out.println("error, vuelva a digitar numero");
    valor = leer.nextDouble();
}
    numeros.add(valor);
 }





  }
   }
