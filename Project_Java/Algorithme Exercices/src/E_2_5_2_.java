import java.util.*;
import java.util.Scanner;

public class E_2_5_2_ {

	public static void main(String[] args) {

		
		
		Integer nbMachine;
		Integer nbUtilisateur;
		int Diff;
		int scoreUtilisateur;
		int scoreBot;
		boolean tracer = true;
		//boolean continuer=true;
		//String rep;
		Scanner sc=new Scanner(System.in); 

		Random aleas= new Random();

		scoreBot=0;
		scoreUtilisateur=0;
		do {
			System.out.println("Veuillez entrer un Nombre au choix entre 0-1-2");
			nbUtilisateur=sc.nextInt();
			sc.nextLine();
			nbUtilisateur =
			nbMachine=aleas.nextInt(3); 

			if (nbUtilisateur < 3 && nbUtilisateur >= 0 && (nbUtilisateur.equals(String)))  {
			//if (nbUtilisateur != nulle) {

				Diff=Math.abs(nbUtilisateur-nbMachine); 

				switch (Diff) {
				case 2:
					if (nbUtilisateur> nbMachine) 
					{

						scoreUtilisateur++;
						System.out.println("bravo vous avez gagn� un point  votre score est de " + scoreUtilisateur +" score Machine :" +scoreBot);


					}else {
						scoreBot++;
						System.out.println("La machine gagne un point  son score est de " + scoreBot +" et votre est de :" +scoreUtilisateur) ;


					}



					break;
				case 1:
					if (nbUtilisateur< nbMachine) 
					{

						scoreUtilisateur++;
						System.out.println("bravo vous avez gagn� un point  votre score est de " + scoreUtilisateur +" score Machine :" +scoreBot);


					}else {
						scoreBot++;
						System.out.println("La machine gagne un point  son score est de " + scoreBot +" et votre est de :" +scoreUtilisateur) ;


					}




					break;
				case 0:
					System.out.println(" Match nul, personne ne marque de point : Score utilisateur "+ scoreUtilisateur +" score machine :"+ scoreBot);



					break;
				default:
					System.out.println(" valeur impr�vue"); 

					break;
				}
			
			}
			System.out.println("\n-_-'\n");
		} while (scoreBot<10 && scoreUtilisateur<10 && nbUtilisateur>=0 && nbUtilisateur <3 && nbUtilisateur == null);

		if (nbUtilisateur<0) {

			System.out.println(" Vous avez arr�t� le jeu! Le score de la machine est :" + scoreBot+" votre score est : " +scoreUtilisateur);

		}
		else if(scoreUtilisateur >=10)
		{
			System.out.println(" Bravo vous avez gagn�! vous atteint 10 points, le score de la machine est :" + scoreBot);

		}
		else {
			System.out.println("Perdu ! Machine 10 points! Essai encore!! Votre score �tait de :" + scoreUtilisateur);
		}
		sc.close();
	}


	}

