/*Exercice 3.3 : D�nombrer les lettres de l'alphabet dans un tableau 
Lire un texte d'au moins 120 caract�res (� contr�ler). 
Compter et afficher le nombre d'occurrences (d'apparitions) de chacune des lettres de l'alphabet*/

import java.util.*;
public class E_3_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

		String phrase = "";
		char [] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int compteur = 0;

		System.out.println("Ecris une phrase");
		phrase = sc.nextLine();

		phrase = phrase.replace(" ", String.valueOf(0));
		phrase = phrase.replace("�", "e");
		phrase = phrase.replace("�", "e");
		phrase = phrase.replace("�", "e");
		phrase = phrase.replace("�", "e");
		phrase = phrase.replace("�", "a");
		phrase = phrase.replace("�", "u");
		phrase = phrase.replace("�", "i");
		phrase = phrase.replace("�", "o");


		for (int i = 0; i < alphabet.length; i++) {
			char a = alphabet [i];

			for (int j = 0; j < phrase.length(); j++) {
				char b = phrase.charAt(j);

				if (b == a )
				{ 
					compteur++;
				}
				if (j == phrase.length()-1 && compteur > 0) 
				{
					System.out.println("La lettre : "+alphabet [i] +" apparait "+compteur +" fois.");}
				}

			compteur =0;
		}
		sc.close();
	}
}

