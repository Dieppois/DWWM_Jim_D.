/*Exercice 2.1 : Conversion Kilom�tres <-> Miles 
Exercice 2.1.1 : 
L'utilisateur saisit une valeur en kilom�tres comprise entre 0.01 et 1 000 000. Si la valeur est hors limite, l'utilisateur 
est invit� � saisir une nouvelle valeur. Si la valeur est �gale � "q", le programme se termine et se ferme. 
Formule km vers mi : 
1 miles = 1.609 kilom�tres
Le programme affiche le r�sultat de la conversion sous forme de nombre r�el double pr�cision.
Exemple d�affichage en mode Console :
Programme de conversion Kilom�tres -> Miles.
Saisir une valeur en Kilom�tres : 
17 
17 Kilom�tres = 10.5655 Miles 
Appuyez sur une touche pour quitter.*/


import java.util.*;
public class E_2_1_2 {
public static void main(String[] args) {
	
	
	
	
	System.out.println("Convertisseur Kilom�tres <-> Miles");
	System.out.println("____________________________________");
	String saisie=" ";
	double distance;
	String [] montab;
	Scanner sc = new Scanner (System.in);
	System.out.print("Veuillez saisir une distance a convertir avec un espace et l'unit� Km (Kilom�tre) ou Mi (miles) : ");
	saisie=sc.nextLine();
	
	montab= saisie.split(" ");
	distance=Double.parseDouble (montab[0]);
	String unite;
	if (montab.length<2) {
		
			unite=" ";
		
	} else 
	{
		unite=montab[1];
	}
		for (String el: montab) 
		{
			System.out.print(el+" ");
		}
		
		
		if (unite.equals("km")) {
			
			double res= distance/1.609344 ;
			/*res = new DecimalFormat("0.00");*/
			
			System.out.println("Cela donne en miles : "+res);
			
		} else {
			
			double res2= distance*1.609344 ;
			System.out.println("Cela donne en kilom�tre : "+res2);

		}
		
		sc.close();
		
		
	}

}
