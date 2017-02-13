package protocole;
import experiences.*;
import animaux.*;
import java.util.*;
import java.io.*;

public class Pathway{
    
    private Vector lesNourritures = new Vector();
    private Vector lesImages = new Vector();
    private Vector lesLabyrinthes = new Vector();
    private int essai = 0;
    
    public static void ajouterLabyrinthe(Vector lesLabyrinthes, Animal sour){
	/*
	  Permet d'ajouter un objet labyrinthe au vecteur contenant les labyrinthes
	*/
	System.out.println("Au bout de combien de temps (sec) le sujet a-t'il trouvé la sortie?");
	int tps = saisie_entier();
	Labyrinthe lab = new Labyrinthe();
	lab.setTemps(tps);
	Cobaye cob = new Cobaye(sour, lab);
	lesLabyrinthes.addElement(cob);
    }
    
    public static void ajouterNourriture(Vector lesNourritures, Animal sour){
	/*
	  Permet d'ajouter un objet Nourriture au vecteur contenant les exp Nourritures
	*/
	int nb = 0;
	String succes = "";
	while (succes == ""){ // on oblige a avoir une réponse
	    System.out.println("Le sujet a-t'il trouvé la nourriture? \n 1 - Oui \n 2 - Non"); //détermine le réulstat
	    int choix = saisie_entier();
	    switch(choix){
	    case 1 : succes = "succes"; break; 
	    case 2 : succes = "echec"; break;
	    default : succes = ""; break;
	    }
	    if (succes.equals("succes")){  // cas d'un succès
		System.out.println("Combien de cachettes avant de trouver la nourriture?");
		nb = saisie_entier();
	    }
	    else if (succes.equals("echec")){  // cas d'un échec
		System.out.println("Combien de cachettes ont été visitées?");
		nb = saisie_entier();	
	    }
	    Nourriture nour = new Nourriture();
	    nour.setSucces(succes);  //définit résultat pour cette expérience
	    nour.setNbVisite(nb); // définit nb visite pour cette expérience
	    Cobaye cob = new Cobaye (sour, nour);
	    lesNourritures.addElement(sour);
	}
    }
    
    public static void ajouterImage(Vector lesImages, Animal sin){
	/*
	  Permet d'ajouter un objet image au vecteur contenant les images
	*/
	Image img = new Image();
	String succes = "";
	int nb = 0;
	int j = 1; // cpt pour répéter 5 fois laa même oprétion
	for (int i = 0 ; i < 5; i++){
	    while(j <= 5){

		System.out.println("Combien d'images le singe "+ sin.getId() +" a-t'il choisi?");
		nb = saisie_entier();
		if (nb < 8){
		    succes = "succes";
		    img.setNbImage(nb);
		    img.setSucces(succes);
		}
		else{
		    succes = "échec";
		    img.setNbImage(nb);
		    img.setSucces(succes);
		}
		j++;
	    }	    
	    Cobaye cob = new Cobaye(sin, img);
	    lesImages.addElement(cob);
	}
    }

    public static void afficherLabyrinthe(Vector lesLabyrinthes){
	/*
	  Affiche la liste de toutes les exp labyrinthes
	  Pour cela, parcourt d'abord le vecteur contenant les exp labyrinthes
	*/
	if (lesLabyrinthes.size() == 0){
	    System.out.println("Ajouter d'abord une expérience labyrinthe");
	}
	else{
	    for (Enumeration e = lesLabyrinthes.elements(); e.hasMoreElements();){  //boucle de parcours des animaux
		Cobaye cob = (Cobaye) e.nextElement();
		if (cob.getExperience() instanceof Labyrinthe){
		    cob.affiche();}
	    }
	}
    }
    
    public static void afficherNourriture(Vector lesNourritures){
	/*
	  Affiche la liste de toutes les exp nourriture
	  Pour cela, parcourt d'abord le vecteur contenant les exp nourriture
	*/
	if (lesNourritures.size() == 0){
	    System.out.println("Ajouter d'abord une expérience Nourriture");
	}else{
	    for (Enumeration e = lesNourritures.elements(); e.hasMoreElements();){  //boucle de parcours des exp Nourritures
		Cobaye cob = (Cobaye) e.nextElement();
		if (cob.getExperience() instanceof Nourriture){
		    cob.affiche();
		}
	    }
	}
    }

    public static void afficherImage(Vector lesImages){
	/*
	  Affiche la liste de toutes les images
	  Pour cela, parcourt d'abord le vecteur contenant les exp images
	*/
	if (lesImages.size() == 0){
	    System.out.println("ajouter d'abord des singes");
	}
	else{
	    for (Enumeration e = lesImages.elements(); e.hasMoreElements();){  //boucle de parcours des exp Nourritures
		Cobaye cob = (Cobaye) e.nextElement();
		if (cob.getExperience() instanceof Image){
		    cob.affiche();
		}
	    }
	}
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
	  Pour cela, parcourt d'abord le vecteur contenant tous les animaux puis regarde si l'instance correspond à la classe souris.
	*/
	if (lesSouris.size() == 0){
	    System.out.println("Ajouter d'abord des souris");
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
	  Affiche la liste de tous les singes
	  Pour cela, parcourt d'abord le vecteur contenant tous les animaux puis regarde si l'instance correspond à la classe singe.
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
	    Integer num = Integer.parseInt(chaine);
	    return num;
	}
	catch(IOException e){return 0;}
    }
    
    public static float saisie_float () // saisie de nombre floatant pour le poids
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

