import animaux.*;
import experiences.*;
import java.util.*;
import java.io.*;

public class Cobaye{
    /*
      Classe gérant les cobayes participants aux 3 expériences.
      Constructeurs dépend du type d'animal sélectionner et de l'expérience
    */

    private static Vector lesSouris = new Vector();
    private static Vector lesSinges = new Vector();
    private Animal animal;
    private Experience experience;

    public Cobaye(){
	;
    }
    
    public Cobaye(Animal anim, Experience exp){
	animal = anim;
	experience = exp;
    }

    public Animal getAnimal(){
	return animal;
    }

    public Experience getExperience(){
	return experience;
    }

    public void setAnimal(Animal anim){
	animal = anim;
    }

    public void setExperience(Experience exp){
	experience = exp;
    }

    public void affiche(){
	experience.affiche();
    }

    
    
    public static Vector ajouterSouris(Vector lesSouris){
	/*
	  Permet d'ajouter un objet souris au vecteur contenant les animaux
	*/
	System.out.println("Donner un nom à la souris");
	String nom = saisie_chaine();
	System.out.println("Donner un poids à la souris " + nom);
	float poids = saisie_float();
	char sexe = 'V';
	while(sexe == 'V'){
	    System.out.println("Quel est son sexe? \n 1 - Femelle \n 2 - Mâle");
	    int rep = saisie_entier();
	    switch(rep){
	    case 1 : sexe = 'F';break;
	    case 2 : sexe = 'M';break;
	    default : System.out.println("Entrer 1 ou 2");
	    }
	}
	Souris souris = new Souris(nom, poids, sexe);
	lesSouris.addElement(souris);
	return lesSouris;
    }
    
    public static Vector ajouterSinge(Vector lesSinges){
	/*
	  Permet d'ajouter un objet singe au vecteur contenant les animaux
	*/
	System.out.println("Donner un nom au singe");
	String nom = saisie_chaine();
	System.out.println("Donner un poids au singe " + nom);
	float poids = saisie_float();
	char sexe = 'V';
	while(sexe == 'V'){
	    System.out.println("Quel est son sexe? \n 1 - Femelle \n 2 - Mâle");
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
    
    public static void afficherSouris(Vector lesSouris){
	/*
	  Affiche la liste de toutes les souris
	  Pour cela, parcourt d'abord le vecteur animal puis parcourt les vecteurs contenus dans le vecteur animal pour afficher leurs contenus
	*/
	if (lesSouris.size() == 0){
	    System.out.println("ajouter d'abord des souris");
	}
	else{
	    for (Enumeration e = lesSouris.elements(); e.hasMoreElements();){  //boucle de parcours des animaux
		Animal sour = (Animal) e.nextElement();
		if(sour instanceof Souris){
		sour.affiche();
		}
	    }	    
	}
    }
    
    public static void afficherSinge(Vector lesSinges){
	/*
	  Affiche la liste de toutes les souris
	  Pour cela, parcourt d'abord le vecteur contenant tous les animaux puis regarde si l'instance correspond à la classe souris.
	*/
	if (lesSinges.size() == 0){
	    System.out.println("Ajouter d'abord des souris");
	}
	else{
	    for (Enumeration e = lesSinges.elements(); e.hasMoreElements();){  //boucle de parcours des animaux
		Animal sin = (Animal) e.nextElement();
		if (sin instanceof Singe){
		    sin.affiche();}
	    }
	}
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

    public static float saisie_float ()
    {
	try{
	    BufferedReader buff = new BufferedReader
		(new InputStreamReader(System.in));
	    String chaine=buff.readLine();
	    Float num = Float.parseFloat(chaine);
	    return num;
	}
	catch(IOException e){return 0;}
    }
}
