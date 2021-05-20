package jeuCapitales;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class capitales {

	public static void main(String[] args) {
		
		
		final int NUMBERS_OF_QUESTIONS = 90;
		 int index;
		 int scorePlus=0;
		 int scoreMoin =0;
		 int s = 0;
		 String pays, capitale, reponses;
		char rejouerOuNon;
		 ArrayList<Integer> indexesSelectionner = new ArrayList<Integer>();
		 //capitales c = new capitales();
		String[][] DataPays = getDataTable();
		
		
		Scanner keyboard = new Scanner(System.in);
		do {
			indexesSelectionner.clear();
		
		for(int i=0;i < NUMBERS_OF_QUESTIONS; i++) {
			do{
				Random R = new Random();
				index = R.nextInt(DataPays.length);
				
			}while(indexesSelectionner.contains(index));
			indexesSelectionner.add(index);
			
			pays = DataPays[index][0];
			capitale = DataPays[index][1];
			
			
			System.out.printf("Quelle est la capitale de ce pays %s?\n" ,pays);
			reponses = keyboard.nextLine().trim();
			if(capitale.equalsIgnoreCase(reponses)) {
				
					System.out.println("");
					System.out.println("Bonne réponse");
					scorePlus++;
			}else 
				System.out.printf("Faux, la réponse, est:%s\n", capitale);
				 s = scoreMoin--;
				s = s * -1;
			
			
		}

		
		System.out.println("C'est términé! Votre score est"+ " " + scorePlus + "/"+ NUMBERS_OF_QUESTIONS);
		System.out.printf("Vous avez ratez %d",s, " Points" );
		System.out.println("\n");
		System.out.println("Voulez vous continuer ? O/N");
		do {
			rejouerOuNon = keyboard.nextLine().toLowerCase().charAt(0);
		}while (rejouerOuNon != 'o' && rejouerOuNon != 'n');
		
	}while(rejouerOuNon == 'o');
		System.out.println("Bye Bye!");
		

		keyboard.close();
}
	
	
	 static String[][] getDataTable() {
		String[][] Data = {
		{"France", "Paris"},
		{"Maroc", "Rabat"},
		{"Uk", "London"},
		{"Tunisie", "Tunisie"},
		{"Senegal", "Dakar"},
		{"Algérie", "Algérie"}
		};
		return Data;
		}
	}


