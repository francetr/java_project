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

	while (true){
	    afficheMenu();
	    int rep = saisie_entier();
	    switch (rep){
	    case 0 : System.exit(0); 
	    case 1 : ajouterAnimal(lesAnimaux); break;
	    case 2 : afficherAnimaux(lesAnimaux); break;
	    case 3 : chercherAnimal(lesAnimaux); break;
	    case 4 : modifierAnimal(lesAnimaux); break;
	    case 5 : ajouterExperience(lesExperiences,lesAnimaux); break;       
	    case 6 : afficherExperience(lesExperiences); break;
	    
	    }
	}
    }

    public static void ajouterAnimal(Vector lesAnimaux)
    /*
      Permet d'ajouter un animal en appelant fonctions ajout souris ou singe selon choix de l'utilisateur 
    */
    {
	Animaux anim = new Animaux();				
	System.out.println("Quel est animal voulez-vous ajouter?\n 1 - Souris\n 2 - Singe");
        int rep = saisie_entier();
        String animal = "";
        switch(rep){
	case 1 : anim.ajouterSouris(lesAnimaux); break;
	case 2 : anim.ajouterSinge(lesAnimaux); break;
	default : System.out.println("Ajout avorté"); break;
        }
    }
    
    public static void afficherAnimaux(Vector lesAnimaux){
	if (lesAnimaux.size() == 0){
	    System.out.println("Ajouter d'abord des animaux");
	}else{
	    Animaux anim = new Animaux();
            System.out.println("Quel est groupe d'animal voulez-vous afficher?\n 1 - Souris\n 2 - Singe\n 3 - Tout");
            int rep = saisie_entier();
            String animal = "";
            switch(rep){
	    case 1 : anim.afficherSouris(lesAnimaux); break;
	    case 2 : anim.afficherSinge(lesAnimaux); break;
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
		float poids = Animaux.saisie_float();
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
    
    public static void ajouterExperience (Vector lesExperiences, Vector lesAnimaux)
    /*
      Permet d'ajouter une expérience dans le vecteur contenant les expérience
    */
    {
	Pathway path = new Pathway();
	System.out.println("Quelle expérience voulez-vous ajouter? \n 1 - Labyrinthe \n 2 - Nourriture \n 3 - Image\n");
	int rep = saisie_entier();
	String exp ="";
	if (rep == 1){
	    Animaux anim = new Animaux();
	    anim.afficherSouris(lesAnimaux);
	    System.out.println("Donner le num de la souris a ajouter a l'expérience");
	    int choix = saisie_entier();
	    for (Enumeration e = lesAnimaux.elements(); e.hasMoreElements();){
		Animal item = (Animal) e.nextElement();
		if (item.getNumOrdre() == choix){
		    path.ajouterLabyrinthe(lesExperiences, item);
		    return;
		}
	    }
	}else if (rep == 2){
	    Animaux anim = new Animaux();
	    anim.afficherSouris(lesAnimaux);
	    System.out.println("Donner le num de la souris a ajouter a l'expérience");
	    int choix = saisie_entier();
	    for (Enumeration e = lesAnimaux.elements(); e.hasMoreElements();){
		Animal item = (Animal) e.nextElement();
		if (item.getNumOrdre() == choix){
		    path.ajouterNourriture(lesExperiences, item);
		    return;
		}
	    }
	}else if (rep == 3){
	    Animaux anim = new Animaux();
	    anim.afficherSinge(lesAnimaux);
	    System.out.println("Donner le num du singe a ajouter a l'expérience");
	    int choix = saisie_entier();
	    for (Enumeration e = lesAnimaux.elements(); e.hasMoreElements();){
		Animal item = (Animal) e.nextElement();
		if (item.getNumOrdre() == choix){
		    path.ajouterImage(lesExperiences, item);
		    return;
		}
	    }
	}else{
	    System.out.println("Ajout d'expérience avorté");
	}       
    }

    public static void afficherExperience(Vector lesExperiences){
	if (lesExperiences.size() == 0){
	    System.out.println("Ajouter d'abord des expériences");
	}else{
	    Pathway path = new Pathway();
System.out.println("Quelle expérience voulez-vous afficher?\n 1 - Nourriture\n 2 - Labyrinthe\n 3 - Image\n 4 - Tout");
            int rep = saisie_entier();
            String animal = "";
            switch(rep){
	    case 1 : path.afficherNourriture(lesExperiences); break;
	    case 2 : path.afficherLabyrinthe(lesExperiences); break;
	    case 3 : path.afficherImage(lesExperiences); break;
	    default : 
		for (Enumeration e = lesExperiences.elements(); e.hasMoreElements();){
		    Experience exp = (Experience) e.nextElement();
		    exp.affiche();
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
	System.out.println("Taper 6 pour afficher les expériences");
	System.out.println("Taper 7 pour créer une expérience");
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
