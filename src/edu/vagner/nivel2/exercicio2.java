// Leia dois números e exiba a soma deles.

package edu.vagner.nivel2;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		float n1;
		float n2;
		float soma;
		Scanner leitura = new Scanner (System.in);
		
		System.out.print("Digite um numero: ");
		n1 = leitura.nextFloat();
		
		System.out.print("Digite outro numero: ");
		n2 = leitura.nextFloat();
		
		soma = (n1 + n2);
		
		System.out.println("A soma entre: " + n1 + " e " + n2 + " seria: " + soma);
		
	}
}
