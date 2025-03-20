// Crie um programa que peça um número e exiba se ele é positivo, negativo ou zero.
package edu.vagner.nivel4;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		int numero;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Digite um nuemro: ");
		numero = leitura.nextInt();
		
		if (numero > 0) {
			System.out.println("O numero eh positivo");
		} else if (numero == 0) {
			System.out.println("O numero eh igual a zero");
		}else if (numero < 0) {
			System.out.println("O numero eh negativo");
		}else {
			System.out.println("O numero ou letra invalido");
		}

	}

}
