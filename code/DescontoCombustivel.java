import java.util.Scanner;
import java.text.NumberFormat;

public class  DescontoCombustivel {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);	// instancia objeto
		
		int combType;
		double gasComum = 2.5, 
			   gasAdit = 2.8, 
			   alcool = 1.9, 
			   liters, 
			   total, 
			   combPrice = 0, 
			   defaultDiscount = 0, 
			   premiumDiscount = 0;
		
		System.out.println("\n 1 = Gasolina comum\n 2 = Gasolina Aditivada\n 3 = Alcool\n");
		System.out.println("Qual o tipo de combustivel?");
		combType = entrada.nextInt();

		System.out.println("\nQuantos litros? ");
		liters = entrada.nextDouble();
		
		switch(combType) {
			case 1:
				combPrice = gasComum;
				defaultDiscount = 1.4;
				premiumDiscount = 1.6;
				break;
			case 2:
				combPrice = gasAdit;
				defaultDiscount = 1.7;
					premiumDiscount = 1.8;
					break;
			case 3:
				combPrice = alcool;
				defaultDiscount = 1.3;
				premiumDiscount = 1.5;
				break;
		}
		
		if( liters > 20 ) {
			total = (combPrice * liters) / premiumDiscount;		
		} else {
			total = (combPrice * liters) / defaultDiscount;			
		}
		
		System.out.println("\nPreco pago pelo combustivel: " + NumberFormat.getCurrencyInstance().format(total));
	}
}


// javac MediaNotas.java complica (gera .class)
// java MediaNotas roda