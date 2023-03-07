package dev;

import java.util.Scanner;

public class Helloworld {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int nums;
		double suma=0;
		double varianza=0;
		double desviacion=0;
		
		System.out.print("INGRESE LOS NUMEROS A CALCULAR LA MEDIA");
		nums = s.nextInt();
		
	for (int i = 0; i < nums; i++) {
        System.out.print("INGRESE EL NUM: ");
        double num = s.nextDouble();
        suma += num;
    }
	s.close();
    double media = suma / nums;
    
    for (int i=0; i<nums; i++) {
    	double rango;
    	rango = Math.pow(nums - media, 2f);
    	varianza = varianza + rango;
    	
    	}
    
    varianza = varianza / 5;
    desviacion = Math.sqrt(varianza);
    
    
    
    
    System.out.println("LA MEDIA ARITMETICA: " + media);
    System.out.println("LA VARIANZA ES:" + varianza);
    System.out.println("LA DESVIACIÓN ESTANDAR ES :" + desviacion);
}
}
	