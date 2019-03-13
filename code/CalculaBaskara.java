import java.util.Scanner;

public class  CalculaBaskara {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);	// instancia objeto
		
		double a, b, c, delta;
		float x1, x2;
		
		System.out.print("\nDigite um valor para A: ");
		a = entrada.nextDouble();
		
		if( a == 0 ) {
			System.out.println("\nA eh igual a zero, a equacao nao eh do segundo grau, execute o programa novamente");
			
		} else {
			System.out.print("\nDigite um valor para B: ");
			b = entrada.nextDouble();
			
			System.out.print("\nDigite um valor para C: ");
			c = entrada.nextDouble();
			System.out.print("\n");
			
			delta = Math.pow(b, 2) - ( 4 * a * c);
			if( delta < 0 ) {
				System.out.println("Delta eh negativo, a equacao nao possui raizes reais");
			} else {
				System.out.println("Delta: " + delta);
				
				x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
				x2 = (float)((-b - Math.sqrt(delta)) / (2 * a));
				
				if( delta == 0 ) {
					System.out.println("x1 = " + x1);
					System.out.println("Delta eh igual a zero, a equacao possui apenas uma raiz real");
					
				} else {
					System.out.println("x1 = " + x1 + "\nx2 = " + x2);					
				}
			}
			
		}
	}
}


// javac MediaNotas.java complica (gera .class)
// java MediaNotas roda