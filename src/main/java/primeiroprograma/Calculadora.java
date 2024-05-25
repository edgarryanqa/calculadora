package primeiroprograma;

import java.util.Scanner;



public class Calculadora {

	public static void main(String[] args) {
		
		Scanner  sc = new Scanner(System.in);
		double n1,n2,Resultado;
		int soma;
		
		
		System.out.println("digite o primeiro numero: ");
		n1 = sc.nextInt();
		System.out.println("digite o segundo numero: ");
		n2 = sc.nextInt();
		System.out.println("digite o operador");
		System.out.println("1 - soma");
		System.out.println("2 - subtração");
		System.out.println("3 - multiplicação");
		System.out.println("4 - divisão");
		
		soma = sc.nextInt();
		
		switch (soma) {
		
		case  1 :
			Resultado = n1+n2;
				System.out.println(Resultado);
			
			break;
			
		case  2 :
			Resultado = n1-n2;
				System.out.println(Resultado);
			
			break;

		case  3 :
			Resultado = n1*n2;
				System.out.println(Resultado);
			
			break;

		case  4 :
			Resultado = n1/n2;
				System.out.println(Resultado);
			
			break;
			
			
			
		
		
			
			

		
		}
		
		
	
		
		
		
	}

}
