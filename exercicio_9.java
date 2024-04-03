package aula_dia03;

import java.util.Scanner;

public class exercicio_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double valor;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe um valor: ");
		valor = ler.nextDouble();
		
		String mensagem = valor % 5 ==0 ? "O numero inserido é multiplo de 5" : "O numero inserido não é multiplo de 5";
		System.out.println(mensagem);
		
	
	}

}
