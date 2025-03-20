// Crie um programa que calcule a média de três números.
package edu.vagner.nivel3;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		double media1;
		double media2;
		double media3;
		double mediaGeral;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.print("Qual foi a nota do primeiro trimestre: ");
		media1 = leitura.nextDouble();
		
		System.out.print("Qual foi a nota do segundo trimestre: ");
		media2 = leitura.nextDouble();
		
		System.out.print("Qual foi a nota do terceiro trimestre: ");
		media3 = leitura.nextDouble();
		
		mediaGeral = ((media1 + media2 + media3)/3);
		
		System.out.println("A sua nota geral do ano foi: " + mediaGeral);
	}
}
