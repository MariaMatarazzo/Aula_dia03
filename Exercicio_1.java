package aula_dia03;
import java.util.Scanner;
public class Exercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		
		System.out.print("Escolha um numero de 1 a 5:  ");
		int numero = ler.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println("******* Voce escolheu o numero 1 ! *******");
			break;
			
		case 2:
			System.out.println("******* Voce escolheu o numero 2 ! ********");
			break;
			
		case 3:
			System.out.println("******* Voce escolheu o numero 3 ! ********");
			break;
		
		case 4:
			System.out.println("******* Voce escolheu o numero 4 !********");
			break;
			
		case 5:
			System.out.println("******* Voce escolheu o numero 5 ! ********");
			break;
			
			default:
			System.out.println("O numero é Invalido! Favor digite novamente entre 1 e 5 ");
				break;
		}

	}

}
