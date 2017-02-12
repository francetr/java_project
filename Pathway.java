package experiences;
import animaux.*;
import java.util.*;
import java.io.*;

public class Pathway{
    
    private Vector lesNourritures = new Vector();
    private Vector lesImages = new Vector();
    private Vector lesLabyrinthes = new Vector();
    
    
    public static void ajouterLabyrinthe(Vector lesLabyrinthes, Animal sour){
	/*
	  Permet d'ajouter un objet labyrinthe au vecteur contenant les labyrinthes
	*/
	System.out.println("Au bout de combien de temps (sec) le sujet a-t'il trouvé la sortie?");
	int tps = saisie_entier();
	Labyrinthe lab = new Labyrinthe(tps);
	lesLabyrinthes.addElement(lab);
	Cobaye cob = new Cobaye(sour, lab);
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
	    lesNourritures.addElement(nour);
	    Cobaye cob = new Cobaye(sour, nour);
	}
    }
    
    public static void ajouterImage(Vector lesImages, Animal sin){
	/*
	  Permet d'ajouter un objet image au vecteur contenant les images
	*/
	for (int i = 0 ; i < 5; i++){
	    String succes = "";
	    System.out.println("Combien d'images le singe "+ sin.getId() +" a-t'il choisi?");
	    int nb = saisie_entier();
	    if (nb < 8){
		System.out.println("Essai n° : " + (i+1) + "\n" + "Singe : " + sin.getId() + "\n" + "Résultat : succès\n");
		succes = "succes";
	    }
	    else{
		System.out.println("Essai n° "+ (i+1)+ "\n"  + "Singe : "+ sin.getId()+ "\n" + "Résultat : échec\n");
		succes = "échec";
	    }		
	    Image img = new Image(succes, nb);
	    img.setEssai(i+1);
	    lesImages.addElement(img);
	    Cobaye cob = new Cobaye(sin, img);
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
		Experience exp = (Experience) e.nextElement();
		if (exp instanceof Labyrinthe){
		    exp.affiche();}
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
	}
	else{
	    for (Enumeration e = lesNourritures.elements(); e.hasMoreElements();){  //boucle de parcours des animaux
		Experience exp = (Experience) e.nextElement();
		if (exp instanceof Nourriture){
		    exp.affiche();}
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
	    for (Enumeration e = lesImages.elements(); e.hasMoreElements();){  //boucle de parcours des animaux
		Experience exp = (Experience) e.nextElement();
		if (exp instanceof Image){
		    exp.affiche();}
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
}

