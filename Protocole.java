package protocole;
import experiences.*;
import animaux.*;
import java.util.*;
import java.io.*;

public class Protocole{
    
    public static void ajouterLabyrinthe(Vector lesLabyrinthes, SourisL sour){
	/*
	  Permet d'ajouter un objet labyrinthe au vecteur contenant les labyrinthes
	*/
	Labyrinthe lab = new Labyrinthe(sour);
	for (int i =0; i < 5 ; i++){	    
	    System.out.println("\nJour : " + (i+1));
	    System.out.println("Combien de temps? (en sec)");
	    int tps = saisie_entier();
	    lab.setTemps(tps);
	    System.out.println("Quel est le poids?");
	    float poids = saisie_entier();
	    lab.setPoids(poids);
	    System.out.println("Quel est son statut? \n 1 - vivant \n 2 - mort ");
	    int rep = saisie_entier();
	    String s = "";
	    while(s ==""){
		switch(rep){
		case 1 : s="vivant";lab.setStatut(s); break;
		case 2 : s="mort";lab.setStatut(s); break;
		default : System.out.println("Entrer 1 ou 2");break;
		}
	    }
	    lab.setStatut(s);
	    lesLabyrinthes.addElement(lab);
	}	
    }
    
    public static void ajouterNourriture(Vector lesNourritures, SourisN sour){
	/*
	  Permet d'ajouter un objet Nourriture au vecteur contenant les exp Nourritures
	*/
	Nourriture nour = new Nourriture(sour);
		
	for (int i =0; i < 5 ; i++){
	    System.out.println("\nJour : " + (i+1));
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
		nour.setSucces(succes);  //définit résultat pour cette expérience
		nour.setNbVisite(nb); // définit nb visite pour cette expérience
		System.out.println("Quel est le poids?");
		float poids = saisie_entier();
		nour.setPoids(poids);
		System.out.println("Quel est son statut? \n 1 - vivant \n 2 - mort ");
		int rep = saisie_entier();
		String s = "";
		switch(rep){
		case 1 : s="vivant";nour.setStatut(s); break;
		case 2 : s="mort";nour.setStatut(s); break;
		}
		nour.setStatut(s);
		lesNourritures.addElement(nour);
	    }
	}
    }
    
    public static void ajouterImage(Vector lesImages, Singe sin){
	/*
	  Permet d'ajouter un objet image au vecteur contenant les images
	*/
	Image img = new Image(sin);
	String succes = "";
	int nb = 0;
	int j = 1; // cpt pour répéter 5 fois la même opération
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
		System.out.println("Quel est le poids?"); // creer méthodes pour modifier poids et statut selon l'experience aurait été mieux
		float poids = saisie_entier();
		img.setPoids(poids);
		System.out.println("Quel est son statut? \n 1 - vivant \n 2 - mort ");
		int rep = saisie_entier();
		String s = "";
		switch(rep){
		case 1 : s="vivant";img.setStatut(s); break;
		case 2 : s="mort";img.setStatut(s); break;
		}
		img.setStatut(s);
		j++;	
	    }
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
	    for (Enumeration e = lesLabyrinthes.elements(); e.hasMoreElements();){  //boucle de parcours des cobayes
		SourisL sourl = (SourisL) e.nextElement();
		sourl.affiche();
	    }
	}
    }
    
    public static void afficherNourriture(Vector lesCobayes){
	/*
	  Affiche la liste de toutes les exp nourriture
	  Pour cela, parcourt d'abord le vecteur contenant les exp nourriture
	*/
	if (lesCobayes.size() == 0){
	    System.out.println("Ajouter d'abord une expérience Nourriture");
	}else{
	    for (Enumeration e = lesCobayes.elements(); e.hasMoreElements();){  //boucle de parcours des exp Nourritures
		    
	    
	    }
	}
    }

    public static void afficherImage(Vector lesCobayes){
	/*
	  Affiche la liste de toutes les images
	  Pour cela, parcourt d'abord le vecteur contenant les exp images
	*/
	if (lesCobayes.size() == 0){
	    System.out.println("ajouter d'abord des singes");
	}
	else{
	    for (Enumeration e = lesCobayes.elements(); e.hasMoreElements();){  //boucle de parcours des exp Nourritures

	    
	    }
	}
    }
        
    public static void ajouterSourisL(Vector lesSourisL){
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
	SourisL souris = new SourisL(nom, poids, sexe);
	lesSourisL.addElement(souris);
    }

    public static void ajouterSourisN(Vector lesSourisN){
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
	SourisN souris = new SourisN(nom, poids, sexe);
	souris.getNumOrdre();
	lesSourisN.addElement(souris);
    }
    
    public static void ajouterSinge(Vector lesSinges){
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
    }
    
    public static void afficherSourisL(Vector lesSouris){
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
		if(sour instanceof SourisL){
		sour.affiche();
		}
	    }	    
	}
    }

    public static void afficherSourisN(Vector lesSouris){
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
		if(sour instanceof SourisN){
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
	    System.out.println("Ajouter d'abord des singes");
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

