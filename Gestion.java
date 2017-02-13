import experiences.*; // import paquetage contenant les expériences
import animaux.*;  // import paquetage contenant les animaux
import java.util.*;
import java.io.*;

public class Gestion{

    public static void main(String [] arg){
	/*
	  Gere tous les choix de l'utilisateur
	 */
	Vector lesAnimaux = new Vector();
	Vector lesExperiences = new Vector();
	Vector lesCobayes = new Vector();
	
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
	
	lesAnimaux.addElement(singe1);
        lesAnimaux.addElement(singe2);
        lesAnimaux.addElement(singe3);
        lesAnimaux.addElement(singe4); 
        
        lesAnimaux.addElement(souris1);
        lesAnimaux.addElement(souris2);
        lesAnimaux.addElement(souris3);
        lesAnimaux.addElement(souris4); 
        lesAnimaux.addElement(souris5); 
        lesAnimaux.addElement(souris6);
        lesAnimaux.addElement(souris7);

	Nourriture nour1 = new Nourriture();
	nour1.setSucces("succes");
	nour1.setNbVisite(4);
	Cobaye cob1 = new Cobaye(souris3, nour1); // ajout de l'experience nour1 pour la sours3
	
	Labyrinthe lab = new Labyrinthe();
	lab.setTemps(300);
	Cobaye cob2 = new Cobaye(singe1, lab);
	lesCobayes.addElement(cob1);
	lesCobayes.addElement(cob2);
	
	while (true){
	    afficheMenu();
	    int rep = saisie_entier();
	    switch (rep){
	    case 0 : System.exit(0); 
	    case 1 : ajouterAnimal(lesAnimaux); break;
	    case 2 : afficherAnimaux(lesAnimaux); break;
	    case 3 : chercherAnimal(lesAnimaux); break;
	    case 4 : modifierAnimal(lesAnimaux); break;
	    case 5 : ajouterExperience(lesCobayes,lesAnimaux); break;       
		// case 6 : repeterExperience(lesExperiences); break;
	    case 7 : afficherExperience(lesCobayes); break;
	    
	    }
	}
    }

    public static void ajouterAnimal(Vector lesAnimaux)
    /*
      Permet d'ajouter un animal en appelant fonctions ajout souris ou singe selon choix de l'utilisateur 
    */
    {
	Pathway path = new Pathway();				
	System.out.println("Quel est animal voulez-vous ajouter?\n 1 - Souris\n 2 - Singe");
        int rep = saisie_entier();
        String animal = "";
        switch(rep){
	case 1 : path.ajouterSouris(lesAnimaux); break;
	case 2 : path.ajouterSinge(lesAnimaux); break;
	default : System.out.println("Ajout avorté"); break;
        }
    }
    
    public static void afficherAnimaux(Vector lesAnimaux){
	if (lesAnimaux.size() == 0){
	    System.out.println("Ajouter d'abord des animaux");
	}else{
	    Pathway path = new Pathway();
            System.out.println("Quel est groupe d'animal voulez-vous afficher?\n 1 - Souris\n 2 - Singe\n 3 - Tout");
            int rep = saisie_entier();
            String animal = "";
            switch(rep){
	    case 1 : path.afficherSouris(lesAnimaux); break;
	    case 2 : path.afficherSinge(lesAnimaux); break;
	    default : 
		for (Enumeration e = lesAnimaux.elements(); e.hasMoreElements();){
		    Animal ani = (Animal) e.nextElement();
		    ani.affiche();
		}
		break;
            }
	}   
    }

    public static void chercherAnimal(Vector lesAnimaux){
	if (lesAnimaux.size() == 0){
	    System.out.println("Ajouter d'abord des animaux");
	}else{
	    System.out.println("Entrer l'id de l'animal que vous chercher");
	    String chaine = saisie_chaine();
	    for (Enumeration e = lesAnimaux.elements(); e.hasMoreElements();){
		Animal ani = (Animal) e.nextElement();
		if (ani.getId().equals(chaine)){
		    ani.affiche();
		    return;
		}
	    }
	    System.out.println("Pas d'animal " + chaine);
	}
    }
        
    public static void modifierAnimal(Vector lesAnimaux){
	if (lesAnimaux.size() == 0){
	    System.out.println("Ajouter d'abord des animaux");
	}else{
	    afficherAnimaux(lesAnimaux);
	    System.out.println("Entrer le num de l'animal que vous souhaitez modifier");
	    int rep = saisie_entier();
	    for (Enumeration e = lesAnimaux.elements(); e.hasMoreElements();){
		Animal ani = (Animal) e.nextElement();
		if(ani.getNumOrdre() == rep){
		    modifier(ani);
		}
	    }
	}
    }
    public static void modifier(Animal ani){
	System.out.println("Voulez vous changer le nom? Taper 1 pour oui");
	int rep = saisie_entier();
	if (rep ==1){
		System.out.println("Donner le nouveau nom");
		String nom=saisie_chaine();
		ani.setId(nom);
	    }
	System.out.println("Voulez vous changer le poids? Taper 1 pour oui");
	int rep_2 = saisie_entier();
	if (rep_2 ==1){
		System.out.println("Donner le nouveau poids");
		float poids = Pathway.saisie_float();
		ani.setPoids(poids);
	    }
	System.out.println("Voulez vous changer le statut? Taper 1 pour oui");
	int rep_3 = saisie_entier();
	if (rep_3 ==1){
	    String stat = "";
	    while (stat == ""){
		System.out.println("Donner le nouveau statut\n 1 - vivant\n 2 - mort");
		int choix = saisie_entier();
		switch(choix){
		case 1 : stat = "vivant"; break;
		case 2 : stat = "mort"; break;
		default : System.out.println("Entrer 1 ou 2"); break;
		}
	    }
	    ani.setStatut(stat);
	}
    }
    
    public static void ajouterExperience (Vector lesCobayes, Vector lesAnimaux)
    /*
      Permet d'ajouter une expérience dans le vecteur contenant les expérience
    */
    {
	Pathway path = new Pathway();
	System.out.println("Quelle expérience voulez-vous ajouter? \n 1 - Labyrinthe \n 2 - Nourriture \n 3 - Image\n");
	int rep = saisie_entier();
	if (rep == 1){
	    path.afficherSouris(lesAnimaux);
	    System.out.println("Donner le num de la souris a ajouter a l'expérience");
	    int choix = saisie_entier();
	    for (Enumeration e = lesAnimaux.elements(); e.hasMoreElements();){
		Animal item = (Animal) e.nextElement();
		if (item.getNumOrdre() == choix){
		    path.ajouterLabyrinthe(lesCobayes, item);
		    return;
		}
	    }
	}else if(rep == 2){
	    path.afficherSouris(lesAnimaux);
	    System.out.println("Donner le num de la souris a ajouter a l'expérience");
	    int choix = saisie_entier();
	    for (Enumeration e = lesAnimaux.elements(); e.hasMoreElements();){
		Animal item = (Animal) e.nextElement();
		if (item.getNumOrdre() == choix){
		    if(item instanceof Souris){
			path.ajouterNourriture(lesCobayes, item);
			return;
		    }else{
			System.out.println("Choisissez une souris");
		    }

		}
	    }
	}else if (rep == 3){
	    path.afficherSinge(lesAnimaux);
	    System.out.println("Donner le num du singe a ajouter a l'expérience");
	    int choix = saisie_entier();
	    for (Enumeration e = lesAnimaux.elements(); e.hasMoreElements();){
		Animal item = (Animal) e.nextElement();
		if (item.getNumOrdre() == choix){
		    path.ajouterImage(lesCobayes, item);
		    return;
		}
	    }
	}else{
	    System.out.println("Ajout d'expérience avorté");
	}       
    }

    /*
    public static void repeterExperience(Vector lesExperiences){
    \/*
	  Permet de répéter un certain nombre de fois une expérience
	  prends en compter un Vecteur contenant les exp
	*\/
	int jour = 5;
	if (lesExperiences.size() == 0){
	    System.out.println("Ajouter d'abord des expériences");
	    
	}else{
	    Pathway path = new Pathway(); // création pathway
	    afficherExperience(lesExperiences); //affiche experience pour choix utilisateur
	    System.out.println("Entrer le num de l'expérience que vous voulez répéter?");
	    int rep = saisie_entier();
	    for (Enumeration e = lesExperiences.elements(); e.hasMoreElements();){
		Experience item = (Experience) e.nextElement();
		if (item.getNumOrdre() == choix){
		    // regarde de quelle exp il s'agit 
		    if(item instanceof Nourriture){ 
			path.repeterNourriture(item);
			return;
		    }
		    else if(item instanceof Labyrinthe){
			path.repeterLabyrinthe(item);
			return;
		    }
		    else if (item instanceof Image){
			path.repeterImage(item);
			return;
		    }
		    
		}
	}
    }
    */
    
    public static void afficherExperience(Vector lesCobayes){
	/*
	  Affiche les expériences en mémoire selon choix de l'utilisateur (Nourritures/ Labyrinthes/ Image/Toutes)
	 */
	if (lesCobayes.size() == 0){
	    System.out.println("Ajouter d'abord des expériences");
	}else{
	    Pathway path = new Pathway();
System.out.println("Quelle expérience voulez-vous afficher?\n 1 - Labyrinthe\n 2 - Nourriture\n 3 - Image\n 4 - Toutes");
            int rep = saisie_entier();
            switch(rep){
	    case 1 : path.afficherLabyrinthe(lesCobayes); break;
	    case 2 : path.afficherNourriture(lesCobayes); break;
	    case 3 : path.afficherImage(lesCobayes); break;
	    default : 
		for (Enumeration e = lesCobayes.elements(); e.hasMoreElements();){
		    Cobaye cob = (Cobaye) e.nextElement();
		    cob.affiche();
		}
		break;
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
	System.out.println("Taper 3 pour chercher un animal");
	System.out.println("Taper 4 pour modifier un animal");
	System.out.println("Taper 5 pour ajouter une expérience");
	//System.out.println("Taper 6 pour répéter une expérience");
	System.out.println("Taper 7 pour afficher les expériences");
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
