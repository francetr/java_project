import java.util.*;
import java.io.*;

public class Gestion{

    public static void main(String [] arg){
	Vector <Singe> lesSinges = new <Singe> Vector();
	Vector <Souris> lesSouris = new <Souris> Vector();
	Singe singe = new Singe("singe1", 50, 'M');
	Souris souris = new Souris("souris1", 20, 'F');
	Nourriture nour = new Nourriture();

	while (true){
	    afficheMenu();
	    int rep = saisie_entier();
	    switch (rep){
	    case 0 : System.exit(0); 
	    case 1 : ajouterSouris(lesSouris); break;
	    case 2 : ajouterSinge(lesSinges); break;
	    }
	}
    }

    /*
    public static Vector <Animal> ajouterAnimal(Vector <Animal> lesAnimaux){
	*
	  Permet de choisir quel animal on ajoute au vecteur contenant les animaux en appelant des fonctions d'ajout d'animaux
	 *
	while(true)
	    {
		System.out.println("Quel animal voulez-vous ajouter?\n1- Souris\n 2- Singe\n Retour au menu ");
		int rep = saisie_entier();
		if (rep == 1){
		    ajouterSouris(lesAnimaux);
		}
		else if (rep == 2){
		    ajouterSinge(lesAnimaux);
		}
		else{
		    return lesAnimaux;
		}
	    }
	
    }
*/
    public static Vector <Souris> ajouterSouris(Vector <Souris> lesAnimaux)
    /*
      Permet d'ajouter un objet souris aux vecteurs contenant les animaux
    */
    {
	System.out.println("Donner un nom a la souris");
	String nom = saisie_chaine();
	System.out.println("Donner un poids a la souris " + nom);
	int poids = saisie_entier();
	char sexe = 'V';
	while(sexe == 'V'){
	    System.out.println("Quel est son sexe?\n 1 - Femelle\n 2 - Male");
	    int rep = saisie_entier();
	    switch(rep){
	    case 1 : sexe = 'F';break;
	    case 2 : sexe = 'M';break;
	    default : System.out.println("entrer 1 ou 2");
	    }
	}
	Souris souris = new Souris(nom, poids, sexe);
	lesAnimaux.add(souris);
	return lesAnimaux;
    }

    public static Vector <Singe> ajouterSinge(Vector <Singe> lesAnimaux){
	/*
	 Permet d'ajouter un objet souris aux vecteurs contenant les animaux
	 */
	System.out.println("Donner un nom au singe");
	String nom = saisie_chaine();
	System.out.println("Donner un poids au singe " + nom);
	int poids = saisie_entier();
	char sexe = 'V';
	while(sexe == 'V'){
	    System.out.println("Quel est son sexe?\n 1 - Femelle\n 2 - Male");
	    int rep = saisie_entier();
	    switch(rep){
	    case 1 : sexe = 'F';break;
	    case 2 : sexe = 'M';break;
	    default : System.out.println("entrer 1 ou 2");
	    }
	}
	Singe singe = new Singe(nom, poids, sexe);
	lesAnimaux.add(singe);
	return lesAnimaux;
    }
    
    
    public static void afficheMenu(){
	System.out.println("------Menu------\n");
	System.out.println("Que voulez vous faire?");
	System.out.println("Taper 0 pour sortir");
	System.out.println("Taper 1 pour ajouter une souris");
	System.out.println("Taper 2 pour ajouter un singe");
    }
    
    public static String saisie_chaine ()
    {
	try {
	    BufferedReader buff = new BufferedReader
		(new InputStreamReader(System.in));
	    String chaine=buff.readLine();
	    return chaine;
	}
	catch(IOException e) {
	    System.out.println(" impossible de travailler" +e);
	    return null;
	}
    }

    public static int saisie_entier ()
    {
	try{
	    BufferedReader buff = new BufferedReader
		(new InputStreamReader(System.in));
	    String chaine=buff.readLine();
	    int num = Integer.parseInt(chaine);
	    return num;
	}
	catch(IOException e){return 0;}
    }
    
}
