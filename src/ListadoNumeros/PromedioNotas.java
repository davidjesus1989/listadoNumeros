package ListadoNumeros;

import static ListadoNumeros.Main2.leer;
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
        System.out.println("Bienvenido profesor/a");      
        }   
     // vamos a recorrer la lista
        
        for (int i=0; i < cantCal; i++){
            contador = i+1;
 
            System.out.println("Ingrese la nota nro:" + contador);
            Double valor = leer.nextDouble();
            while ((valor < 1.0 ) || (valor > 7.0 )){
                System.out.println("¡Error! por favor digite notas en un rango de *1.0 a 7.0* "
                        + "Digite nuevamente la nota nro:" + (i+1));
                valor = leer.nextDouble();
        }
            listado_numeros.add(valor);
        
        }    
          
     // se agregan las notas al listado de notas
       
        for (int i=0; i < cantCal; i++){     
        contador = i+1;
      
        sumaNotas = sumaNotas + listado_numeros.get(i);
        promedio = sumaNotas / listado_numeros.size();
        }
        
                
        System.out.println("El promedio de sus notas es:" + promedio);
        
     // aprobar o reprobar alumno dependiendo del promedio
       
        if (promedio>3.9){
        System.out.println("Alumno aprobado");
        }
        else{
        System.out.println("Alumno reprobado");
        }
         }
          }
   

     
    
     
     
     
     
     
     
     
     
     
     
     
     
    
    
 



