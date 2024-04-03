package aula_dia03;
import java.util.Scanner;
public class Exercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner (System.in);
		String dia;
		
		System.out.println("informar o dia da semana: ");
		dia = ler.next();
		
		switch (dia) {
		case "domingo":
			System.out.println("******* Voce escolheu o dia 1! *******");
			break;
			
		case "segunda":
			System.out.println("******* Voce escolheu o dia 2! ********");
			break;
			
		case "terça":
			System.out.println("******* Voce escolheu o dia 3! ********");
			break;
		
		case "quarta":
			System.out.println("******* Voce escolheu o dia 4!********");
			break;
			
		case "quinta":
			System.out.println("******* Voce escolheu o dia 5! ********");
			break;
			
		case "sexta":
			System.out.println("******* Voce escolheu o dia 6! ********");
			break;
			
		case "sabado":
			System.out.println("******* Voce escolheu o dia 7! ********");
			break;
			
			default:
			System.out.println("O dia é Invalido! Favor digite novamente ");
			
		}	
		
	}

}
