package nti.dev.ordenacao;

import java.util.Arrays;
import java.util.Random;

public class OrdenacaoSimples {

	public static void main(String[] args) {

		int[] numeros = new int[10];
		
		System.out.print("Lista Desordenada: ");
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = new Random().nextInt(60) + 1; 
			System.out.print(numeros[i]+" ");
		}
		
		System.out.println();
		
		ordenacao(numeros);
		System.out.print("Lista Ordenada: ");
		for(int i =0; i < numeros.length; i++) {
			System.out.print(numeros[i]+" ");
		}
		
	}

	static void ordenacao(int[] lista){
		Arrays.sort(lista);
	}
	
}