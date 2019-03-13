import java.util.Scanner;

public class  DiaDaSemana {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);	// instancia objeto
		
		int number;
		
		System.out.print("Digite um numero: ");		// printf
	
		number = entrada.nextInt();
		
		switch(number) {
			case 1:
				System.out.println("Domingo");
				break;
			case 2:
				System.out.println("Segunda");
				break;
			case 3:
				System.out.println("Terca");
				break;
			case 4:
				System.out.println("Quarta");
				break;
			case 5:
				System.out.println("Quinta");
				break;
			case 6:
				System.out.println("Sexta");
				break;
			case 7:
				System.out.println("Sabado");
				break;
			default:
				System.out.println("Valor Invalido");
		}
	}
}