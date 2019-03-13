import java.util.Scanner;
import java.text.NumberFormat;

public class CaixaEletronico {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
        
		int requestedMoney, 
			currentMoney, 
			oneCounter = 0, 
			fiveCounter = 0, 
			tenCounter = 0, 
			fiftyCounter = 0, 
			hundredCounter = 0;

		System.out.println("\nQuanto dinheiro voce deseja sacar? ");
		requestedMoney = entrada.nextInt();
		currentMoney = requestedMoney;
		System.out.println("");

		if (requestedMoney < 1 || requestedMoney > 600) {
			System.out.println("O valor sacado deve ser entre R$1,00 e R$600,00.");
		} else {
			if ((currentMoney / 100) > 0) {
				hundredCounter = currentMoney / 100;
				currentMoney = requestedMoney % 100;
				System.out.println("Notas de R$ 100,00 -> " + hundredCounter);
			}
	
			if ((currentMoney / 50) > 0) {
				fiftyCounter = currentMoney / 50;
				currentMoney = currentMoney % 50;
				System.out.println("Notas de R$ 50,00  -> " + fiftyCounter);
			}
	
			if ((currentMoney / 10) > 0) {
				tenCounter = currentMoney / 10;
				currentMoney = currentMoney % 10;
				System.out.println("Notas de R$ 10,00  -> " + tenCounter);
			}
	
			if ((currentMoney / 5) > 0) {
				fiveCounter = currentMoney / 5;
				currentMoney = currentMoney % 5;
				System.out.println("Notas de R$ 5,00   -> " + fiveCounter);
			}
	
			if ((currentMoney / 1) > 0) {
				oneCounter = currentMoney / 1;
				System.out.println("Notas de R$ 1,00   -> " + oneCounter);
			} 
	
			System.out.println("\nDinheiro sacado: R$ " + NumberFormat.getCurrencyInstance().format(requestedMoney));
		}
	}
}