//fichero Interes.java
//Clase el interés (I) que produce un capital
//el cúal  es directamente proporcional al capital inicial (C),
// al tiempo (t), y a la tasa de interés (i) :
//I = C · i · t

public class Interes{
	public static double calcularInter(double c,double i,double t){
   //código para calcular el interes
   //return interes
   double I;
	I=c*i*t;
   
   return I;
	}
}
