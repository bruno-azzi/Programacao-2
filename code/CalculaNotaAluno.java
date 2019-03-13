import java.util.Scanner;

public class  CalculaNotaAluno {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);	// instancia objeto
		
		float n1, n2, media;
		
		System.out.print("\nDigite a primeira nota: ");		// printf
		n1 = entrada.nextFloat();
		
		System.out.print("Digite a segunda nota: ");
		n2 = entrada.nextFloat();
		
		media = (n1 + n2) / 2;
		
		System.out.println("\nMedia: " + media);
		
		if(media >= 6 && media <= 10) {
			System.out.println("APROVADO");
		} else {
			System.out.println("REPROVADO");
		}
		
		if(media >= 9 && media <= 10) {
			System.out.println("Conceito correspondente: A");
		} else if(media <9 && media >= 7.5){
			System.out.println("Conceito correspondente: B");
		} else if(media <7.5 && media >= 6){
			System.out.println("Conceito correspondente: C");
		} else if(media <5.9 && media >= 4){
			System.out.println("Conceito correspondente: D");
		} else if(media <4 && media >= 0){
			System.out.println("Conceito correspondente: E");
		} else {
			System.out.println("invalido");
		}
		
	}
}


// javac MediaNotas.java complica (gera .class)
// java MediaNotas roda