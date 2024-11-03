package br.com.erickfreire.fibonacci;

import java.util.Scanner;

public class VerificaString {

	public static void main(String[] args) {
		String palavra = "";
		Scanner entrada = new Scanner(System.in);
		int contadorDeLetras = 0;
		
		System.out.println("Programa que verifica a quantidade de letras 'A's em um texto: ");
		System.out.print("Digite uma palavra: ");
		palavra = entrada.nextLine();
		
		for(int i = 0; i < palavra.length(); i++) {
			char c = palavra.charAt(i);
			
			if(c == 'a' || c == 'A' || c == 'ã' || c == 'á' || c == 'à' || c == 'Ã' || c == 'Á' || c == 'À') {
				contadorDeLetras = contadorDeLetras + 1;
			}
		}
		
		System.out.printf("%n%nA quantidade de letras \'A\'s no texto é de: %d.", contadorDeLetras);

	}

}
