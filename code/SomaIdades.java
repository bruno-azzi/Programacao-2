import java.util.Scanner;
import java.util.Arrays;

public class SomaIdades {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
        
        String phrase = "Joao tem 6 anos, Maria tem 10 e Macil, sendo mais velho, tem 15.";
        String phraseParts[] = phrase.split(" | \\s");
        int i;
        
        System.out.println(Arrays.toString(phraseParts));
        
        for (i = 0; i <= phraseParts.length-1; i++) {
            if (phraseParts[i].contains("^[0-9]")) {           ////////////////////
                System.out.println("tem numero");               // PAREI POR AQUI //
            } else {                                            ////////////////////
                System.out.println("tem letra");
            }
        }
	}
}