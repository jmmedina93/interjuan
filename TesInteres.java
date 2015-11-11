//fichero Interes.java
//leemos desde un Scanner los valores
//capital, tiempo y tasa de  interés
//y mediante el  método calcularInteres de la
//clase  Interes muestra por pantalla el interés
//calculado

import java.util.Scanner;

public class TesInteres{
   public static void main(String[] arg){
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Introduce el valor de Capital");
	   double capital=sc.nextDouble();
	   System.out.println("Introduce el valor de Tiempo");
	   double tiempo=sc.nextDouble();
	   System.out.println("Introduce el valor de Interes");
	   double interes=sc.nextDouble();
	   
	   System.out.println("El interes es : " + Interes.calcularInter(capital,tiempo,interes));
        //preparamos el scanner
        //lectura de lo datos
        //llamada al método calcularInteres
        //mostramos por pantalla el valor del interés
   }
}
