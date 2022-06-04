package ListadoNumeros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PromedioNotas {
    
public static void main(String[] args) { 
Scanner notas = new Scanner(System.in);
List <Double> listado_numeros = new ArrayList<>();
     //declaramos  las variables
     
Integer cantCal, contador;
     
double sumaNotas = 0;
double promedio = 0;
     
     //vamos a pedir por consola
     
    System.out.println("Instituto profesional Esucomex.");
    System.out.println("Herramienta para promediar notas de alumnos.");
    System.out.println("Ingrese la cantidad de notas del alumno:");
        
cantCal = notas.nextInt();
     // detener en caso de exceder maximo de notas establecido
         
if (cantCal>= 5){
    System.out.println("¡ERROR! ¡Excede la cantidad de notas maxima! Verifique la cantidad y vuelva a ejecutar");
    System.exit(0);
}
         
else{
    System.out.println("Bienvenido profesor Marcos");      
}
     // vamos a recorrer la lista
        
for (int i=0; i < cantCal; i++){
contador = i+1;
         

    System.out.println("Ingrese la nota nro:" + contador);
    
  
             
listado_numeros.add(notas.nextDouble());
        // se agregan las notas al listado de notas
             
sumaNotas = sumaNotas + listado_numeros.get(i);
promedio = sumaNotas / listado_numeros.size();
}
         
    System.out.println("El promedio de sus notas es:" + promedio);
       // aprobar o reprobar alumno dependiendo del promedio
       
if (promedio>=4){
    System.out.println("Alumno aprobado");
}
else{
    System.out.println("Alumno reprobado");
}
  }
    }
   
     
     
    
     
     
     
     
     
     
     
     
     
     
     
     
    
    
 



