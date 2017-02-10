import java.util.*;
import java.io.*;

public class Gestion{

    public static void main(String [] arg){
	/*
	  Gere tous les choix de l'utilisateur
	 */
	Vector lesAnimaux = new Vector();
	Vector lesSouris = new Vector();
	Vector lesSinges = new Vector();
	Vector lesExperiences = new Vector();
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
	lesSinges.addElement(singe1); lesSouris.addElement(souris4); lesSinges.addElement(singe2);lesSinges.addElement(singe3);lesSinges.addElement(singe4); lesSouris.addElement(souris1);lesSouris.addElement(souris2);lesSouris.addElement(souris3);lesSouris.addElement(souris5); lesSouris.addElement(souris6);lesSouris.addElement(souris7);
	lesAnimaux.addElement(lesSinges);
	lesAnimaux.addElement(lesSouris);


	while (true){
	    afficheMenu();
	    int rep = saisie_entier();
	    switch (rep){
	    case 0 : System.exit(0); 
	    case 1 : ajouterAnimal(lesAnimaux); break;
	    case 2 : afficheAnimaux(lesAnimaux); break;
	    case 3 : ajouterExperience(lesExperiences); break;
	    }
	}
    }

    public static Vector ajouterExperience (Vector lesExperiences)
    /*
      Permet d'ajouter une expérience dans le vecteur contenant les expérience
    */
    {
	Labyrinthe lab = new Labyrinthe(60);
	lab.affiche();
	System.out.println(lab.getTemps());
	lab.setTemps(120);
	System.out.println(lab.getTemps());
	lab.affiche();
	Image img2 = new Image(5, "succes");
	img2.affiche();
	Nourriture nour1 = new Nourriture(2, "succes");
	nour1.affiche();
	Nourriture nour2 = new Nourriture(30, "echec");
	nour2.affiche();
	return lesExperiences;
    }

    public static void ajouterAnimal(Vector lesAnimaux)
    /*
      Permet d'ajouter un animal en appelant fonctions ajout souris ou singe selon choix de l'utilisateur 
    */
    {
    
	    System.out.println("Quel est animal voulez-vous ajouter?\n 1 - Souris\n 2 - Singe");
	    int rep = saisie_entier();
	    switch(rep){
	    case 1 : ajouterSouris(lesAnimaux); break;
	    case 2 : ajouterSinge(lesAnimaux); break;
	    default : System.out.println("Ajout avorté"); break;
	}
    }

    
    public static Vector ajouterSouris(Vector lesSouris)
    /*
      Permet d'ajouter un objet souris dans un vecteur ne contenant que des souris, au vecteur contenant les animaux
    */
    {
	System.out.println("Donner un nom a la souris");
	String nom = saisie_chaine();
	System.out.println("Donner un poids a la souris " + nom);
	float poids = saisie_entier();
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

    public static Vector ajouterSinge(Vector lesSinges){
	/*
	  Permet d'ajouter un objet singe au vecteur contenant les animaux
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

    public static void afficheAnimaux(Vector lesAnimaux){
	/*
	  Affiche la liste de tous les animaux
	  Pour cela, parcourt d'abord le vecteur animal puis parcourt les vecteurs contenus dans le vecteur animal pour afficher leurs contenus
	 */
	if (lesAnimaux.size() == 0){
		System.out.println("ajouter d'abord des animaux");
	    }
	else{
	    for (Enumeration e = lesAnimaux.elements(); e.hasMoreElements();){
		Vector item = (Vector) e.nextElement();
		for (Enumeration e2 = item.elements(); e2.hasMoreElements();){
		    Animal anim = (Animal) e2.nextElement();
		    anim.affiche();
		}
	    }
	}
    }
    
    
    public static void afficheMenu(){
	/*
	  Affiche a l'utilisateur le menu
	 */
	System.out.println("----------------");
	System.out.println("|     Menu     |");
	System.out.println("----------------");
	System.out.println("Que voulez vous faire?");
	System.out.println("Taper 0 pour sortir");
	System.out.println("Taper 1 pour ajouter un animal");
	System.out.println("Taper 2 pour afficher la liste des animaux présents dans l'étude");
	System.out.println("Taper 3 pour ajouter une expérience");
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
