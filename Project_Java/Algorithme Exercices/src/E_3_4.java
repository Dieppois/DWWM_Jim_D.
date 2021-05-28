/*Exercice 3.4 : Tri d'un tableau 
Nous d�signerons par a1, a2, ..., aN les �l�ments d'un tableau � trier par ordre croissant.
On commence par chercher l'indice du plus petit des �l�ments, soit j cet indice. 
On permute alors les valeurs de a1 et aj .
On cherche ensuite l'indice du plus petit des �l�ments a2, a3, ..., an et on permute avec a2, etc.*/

//System.out.println(Arrays.toString(monTableau));

import java.util.*;
public class E_3_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int [] monTab = new int [5];
		int n =0;
			
		for (int i = 0; i < monTab.length; i++) 
		{
			monTab [i] = sc.nextInt();	
		}
		System.out.print("Le tableau non trie : ");
		System.out.println(afficherTableau (monTab));
		
		
		//Arrays.sort(monTab); 
		
		 int en_cours, plus_petit, j, temp;
		 
	     for (en_cours = 0; en_cours < monTab.length - 1; en_cours++)
	     {
	         plus_petit = en_cours;
	         for (j = en_cours; j < monTab.length; j++)
	              if (monTab[j] < monTab[plus_petit])
	                  plus_petit = j;
	          temp = monTab[en_cours];
	          monTab[en_cours] = monTab[plus_petit];
	          monTab[plus_petit] = temp;
	     }
	}
		
		
		
		
            }
		}
		}
		
		
		
		
		System.out.print("Le tableau trie : ");
		System.out.println(afficherTableau (monTab));
		sc.close();
}		
	
		static String afficherTableau(int monTab[]){
			for (int i = 0; i < monTab.length; i++) 
			{
			System.out.print(monTab [i] +" ");
			}
			return "";
		}
}