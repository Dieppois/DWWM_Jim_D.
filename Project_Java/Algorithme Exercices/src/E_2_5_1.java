import java.util.*;
public class E_2_5_1 {
	public static String main(String[] args) {	
		
		Scanner sc = new Scanner (System.in);
		
		//Tableau des scores
		
		int scoreJoueur=0;
		int scoreNpc=0;
		

		while(scoreJoueur!=3 || scoreNpc!=3) {
			
		switch (gameRound(scoreJoueur(), npcCho: random.nextInt (bound:3)+1)) {
			
		case 1 :
			scoreJoueur++;
			break;
		case2 :
			scoreNpc++;
			break;
			System.out.println("Player Score: "+scoreJoueur+ "NPC Score : "+scoreNpc);
			
		//Creation du choix joueur
		
		int choice;
		do {
			System.out.println("1 pour Rocher");
			System.out.println("2 pour Papier");
			System.out.println("3 pour Ciseau");
			System.out.print("Faire une selection");
			choice = sc.nextInt();
		} while (choice >3  || choice < 1 );
		//return choice; //?????
		}
		}
	}
		private static int scoreJoueur() {
		return 0;
	}
		//qui a gagner la manche
		public static String playerSelection (int selection) {
		String object="";
		switch (selection) {
		case 1:
			object="Rocher";
			break;
		case 2:
			object="Papier";
			break;
		case 3:
			object="Ciseau";
			break;
			default:
			
		}
		return object;
		}


public static int gameRound (int playerChoice,int npcChoice) {
	int result;
	System.out.println("your choice is "+playerSelection(playerChoice)+ " the Npc choice is "+playerSelection(npcChoice));
	if (playerChoice==1 && npcChoice==3 || playerChoice==2 && npcChoice==1 || playerChoice==3 && npcChoice ==2) {
System.out.println("you win this round ! ");
	result=1;
} else if (playerChoice==npcChoice) {
	System.out.println("C'est un egalite");
	result=0;
}else {
	System.out.println("Tu as perdues cette manche, le npc gagne");
	result=2;
}
		return result;
		

}
}
