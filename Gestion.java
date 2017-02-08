import java.util.*;
import java.io.*;

public class Gestion{

    public static void main(String [] arg){
	Vector <Animal> lesAnimaux = new <Animal> Vector();
	//Vector <Souris> lesSouris = new <Souris> Vector();
	//Vector <Singe> lesSinges = new <Singe> Vector();
	Vector <Experience> lesExperiences = new <Experience> Vector();
	Singe singe1 = new Singe("singe1", 50, 'M');
	Singe singe2 = new Singe("singe3", 50, 'M');
	Singe singe3 = new Singe("singe4", 25, 'F');
	Singe singe4 = new Singe("singe2", 50, 'F');
	Souris souris1 = new Souris("souris1", 20, 'F');
	Souris souris2 = new Souris("souris2", 25, 'F');
	Souris souris3 = new Souris("souris3", 50, 'M');
	Souris souris4 = new Souris("souris4", 30, 'M');
	Souris souris5 = new Souris("souris5", 40, 'F');
	Souris souris6 = new Souris("souris6", 35, 'M');
	Souris souris7 = new Souris("souris7", 20, 'F');
	lesAnimaux.addElement(singe1); lesAnimaux.addElement(souris4); lesAnimaux.addElement(singe2);lesAnimaux.addElement(singe3);lesAnimaux.addElement(singe4); lesAnimaux.addElement(souris1);lesAnimaux.addElement(souris2);lesAnimaux.addElement(souris3);lesAnimaux.addElement(souris5); lesAnimaux.addElement(souris6);lesAnimaux.addElement(souris7);
	Nourriture nour = new Nourriture();

	while (true){
	    afficheMenu();
	    int rep = saisie_entier();
	    switch (rep){
	    case 0 : System.exit(0); 
	    case 1 : ajouterSouris(lesAnimaux); break;
	    case 2 : ajouterSinge(lesAnimaux); break;
	    case 3 : afficheAnimaux(lesAnimaux); break;
	    case 4 : ajouterExperience(); break;
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
    public static void ajouterExperience ()
    {
	;
    }

    
    public static Vector <Animal> ajouterSouris(Vector <Animal> lesSouris)
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
	lesSouris.add(souris);
	return lesSouris;
    }

    public static Vector <Animal> ajouterSinge(Vector <Animal> lesSinges){
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
	lesSinges.add(singe);
	return lesSinges;
    }

    public static void afficheAnimaux(Vector <Animal> lesAnimaux){
	/*
	  Chercher a afficher selon espèces : affiche sans distinctions
	 */
	if (lesAnimaux.size() == 0){
		System.out.println("ajouter d'abord des animaux");
	    }
	else{
	    for (Enumeration e = lesAnimaux.elements(); e.hasMoreElements();){
		Animal item = (Animal) e.nextElement();
		item.affiche();
	    }
	}
    }
    
    
    public static void afficheMenu(){
	System.out.println("----------------");
	System.out.println("|     Menu     |");
	System.out.println("----------------");
	System.out.println("Que voulez vous faire?");
	System.out.println("Taper 0 pour sortir");
	System.out.println("Taper 1 pour ajouter une souris");
	System.out.println("Taper 2 pour ajouter un singe");
	System.out.println("Taper 3 pour afficher la liste des animaux");
	System.out.println("Taper 4 pour ajouter une expérience");
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
