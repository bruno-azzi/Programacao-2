/* import java.util.Scanner;

public class ContaVogais {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
        
        String word;
        char wordChar;
        int vogalCounter = 0, i;

        System.out.print("\nDigite uma palavra: ");
        word = entrada.next().toLowerCase();
        
        System.out.println("\nPalavra: " + word + "\n");

        for (i = 0; i <= word.length()-1; i++) {
            wordChar = word.charAt(i);

            if (wordChar == 'a' || wordChar == 'e' || wordChar == 'i' || wordChar == 'o' || wordChar == 'u') {
                vogalCounter++;
            }
            
            System.out.println("Letra numero " + (i+1) + " eh: " + wordChar);
        }
        
        if(vogalCounter > 0) {
            System.out.println("\nNumero de vogais: " + vogalCounter); 
        } else {
            System.out.println("\nNenhuma vogal presente na palavra: " + word);
        }
	}
} */

import java.util.Scanner;

public class ContaVogais {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
        
        String word;
        char wordChar, vogais[] = {'a', 'e', 'i', 'o', 'u'};
        int vogalCounter = 0, i, j;

        System.out.print("\nDigite uma palavra: ");
        word = entrada.next().toLowerCase();
        
        System.out.println("\nPalavra: " + word + "\n");

        for (i = 0; i <= word.length()-1; i++) {
            wordChar = word.charAt(i);

            System.out.println("Letra numero " + (i+1) + ": " + wordChar);

            for (j = 0; j <= vogais.length-1; j++) {
                if (wordChar == vogais[j]) {
                    vogalCounter++;
                }
            }
        }

        if(vogalCounter > 0) {
            System.out.println("\nNumero de vogais: " + vogalCounter); 
        } else {
            System.out.println("\nNenhuma vogal presente na palavra: " + word);
        }
        
	}
}

// javac MediaNotas.java complica (gera .class)
// java MediaNotas roda