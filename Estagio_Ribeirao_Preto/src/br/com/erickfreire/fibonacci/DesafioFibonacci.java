package br.com.erickfreire.fibonacci;

import java.util.Scanner;

public class DesafioFibonacci {

	public static void main(String[] args) {
		int contador = 1;
		int anterior = 0;
		int posterior = 1;
		int valor = 0;
		Scanner entrada = new Scanner(System.in);
		boolean pertence = false;
		int posicao = 0;
		
		System.out.println("Calculando A S�rie de Fibonacci: ");
		System.out.print("Digite um valor maior que zero, para exibir a sequ�ncia: ");
		
		valor = entrada.nextInt();
		
		System.out.printf("\nS�rie de Fibonacci: ");
		
		while(contador <= valor) {
			if(contador == 1) {
				System.out.print("0, ");
				contador = contador + 1;
			} else {
				if(contador == 2) {
					System.out.print("1, ");
					contador = contador + 1;					
				} else {
					System.out.printf("%d, ", posterior);
					anterior = posterior - anterior;
					posterior = posterior + anterior;
					contador = contador + 1;
					
					
					if(valor == anterior) {
						pertence = true;
								
					} 
				}
			}
			
		}
		
		if(pertence == true) {
			System.out.printf("%n***Sim, o n�mero %d pertence a sequ�ncia de fibonacci apresentada acima.", valor);
		} else {
			System.out.printf("%n***N�o, o n�mero %d, n�o pertence a sequ�ncia de fibonacci apresentada acima.", valor);
		}

	}

}
