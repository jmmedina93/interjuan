/**
*fichero InteresCompuesto.java
*leemos desde un Scanner los valores
*capital, tiempo y tasa de  interés

*y mediante el  método calcularInteres muestra por pantalla el interés
*calculado

*@author Pedro Torrebejano
*@version 1
**/
import java.util.Scanner;
public class InteresCompuesto{
   public static void main(String[] arg){
      Scanner sc=new Scanner(System.in);
       System.out.println("Introduce el capital");
       double capital=sc.nextDouble();
       System.out.println("Introduce el tiempo");
       double tiempo=sc.nextDouble();
       System.out.println("Introduce el interés");
       double tasadeinteres=sc.nextDouble();
       double calculoInteres= calcularInter(capital,tiempo,tasadeinteres);
       System.out.printf("Cálculo resultante "+calculoInteres);
        //preparamos el scanner
        //lectura de lo datos
        //llamada al método calcularInteres
        //mostramos por pantalla el valor del interés
   }
   
   public static double calcularInter(double Capital, double tiempo, double tasadeinteres){
   /**
    * 
    * código para calcular el interes
	* return interes
	* @param Capital capital inicial
	* @param tiempo tiempo de amortización
	* @param tasadeinteres tasa de interes
	* @return resultado 
	**/
	double I;
	double parentesis=1+tasadeinteres;
	double aux=1;
		for(int x=0; x < tiempo; x++){
			aux=aux*parentesis;
		}
		I=Capital*aux;	
	return I;
	}
}
