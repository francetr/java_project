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
	    case 3 : ajouterExperience(lesExperiences); break;
	    case 4 : afficherExperience(lesExperiences); break;
	    }
	}
    }

    public static void ajouterExperience (Vector lesExperiences)
    /*
      Permet d'ajouter une expérience dans le vecteur contenant les expérience
    */
    {
	System.out.println("Quelle expérience voulez-vous ajouter? \n 1 - Labyrinthe \n 2 - Nourriture \n 3 - Image\n");
	int rep = saisie_entier();
	switch(rep){
	case 1 : ajouterLabyrinthe(lesExperiences); break;
	case 2 : ajouterNourriture(lesExperiences); break;
	case 3 : ajouterImage(lesExperiences); break;
	}
    }

    
    
    public static Vector ajouterLabyrinthe (Vector lesLabyrinthes)
    /*
      Permet d'ajouter une expérience labyrinthe dans le vecteur contenant les expériences
    */
    {
	System.out.println("Au bout de combien de temps le sujet a-t'il trouvé la sortie?");
	int rep = saisie_entier();
	Labyrinthe lab = new Labyrinthe(rep);
	lab.affiche();
	lesLabyrinthes.addElement(lab);
	return lesLabyrinthes;
    }
    
    public static Vector ajouterNourriture (Vector lesNourritures)
    /*
      Permet d'ajouter une expérience Nourriture dans le vecteur contenant les expériences
    */
    {
	String succes = null;
	System.out.println("L'experience est-elle un succès? \n 1 - Oui \n 2 - Non");
	int rep = saisie_entier();
	switch (rep){
	case 1 : succes = "succes"; break;
	case 2 : succes = "echec"; break;
	}
	System.out.println("Combien de cachettes la souris a-t'elle fouillées?");
	int nb = saisie_entier();
	Nourriture nour = new Nourriture(succes, nb);
	lesNourritures.addElement(nour);	
	return lesNourritures;
    }
    
    public static Vector ajouterImage (Vector lesImages)
    /*
      Permet d'ajouter une expérience image dans le vecteur contenant les expérience
    */
    {
	String succes = null;
	System.out.println("L'experience est-elle un succès? \n 1 - Oui \n 2 - Non");
	int rep = saisie_entier();
	switch(rep){
	case 1 : succes = "succes"; break;
	case 2 : succes = "echec"; break;
	}
	System.out.println("Combien d'images le singe a-t'il choisi?");
	int nb = saisie_entier();
	Image img = new Image(succes, nb);
	lesImages.addElement(img);
	return lesImages;
    }


    public static void afficherExperience(Vector lesExperiences){
	;
    }

    public static void ajouterAnimal(Vector lesAnimaux)
    /*
      Permet d'ajouter un animal en appelant fonctions ajout souris ou singe selon choix de l'utilisateur 
    */
    {
 System.out.println("Quel est animal voulez-vous ajouter?\n 1 - Souris\n 2 - Singe");
        int rep = saisie_entier();
        String animal = "";
        switch(rep){
            case 1 : animal = "souris"; break;
            case 2 : animal = "singe"; break;
            default : System.out.println("Ajout avorté"); break;
        }
        
        if(!animal.equals("")){
            System.out.print("Donner un nom "+ (animal.equals("souris") ? "a la souris" : "au singe") +" : ");
            String nom = saisie_chaine();
            System.out.println("Donner un poids a " + nom);
            float poids = saisie_entier();
            char sexe = 'V';
            while(sexe == 'V'){
                System.out.println("Quel est son sexe?\n 1 - Femelle\n 2 - Male");
                int resp = saisie_entier();
                switch(resp){
                case 1 : sexe = 'F';break;
                case 2 : sexe = 'M';break;
                default : System.out.println("entrer 1 ou 2");
                }
            }
            if(animal.equals("souris")){
                Souris souris = new Souris(nom, poids, sexe);
                lesAnimaux.add(souris);
            }else{
                Singe singe = new Singe(nom, poids, sexe);
                lesAnimaux.add(singe);
            }
        }
    }
    
    public static void afficherAnimaux(Vector lesAnimaux){
	if (lesAnimaux.size() == 0){
		System.out.println("Ajouter d'abord des animaux");
	}else{
            System.out.println("Quel est groupe d'animal voulez-vous afficher?\n 1 - Souris\n 2 - Singe\n 3 - Tout");
            int rep = saisie_entier();
            String animal = "";
            switch(rep){
                case 1 : 
                    for (Enumeration e = lesAnimaux.elements(); e.hasMoreElements();){
                        Animal anim = (Animal) e.nextElement();
                        if(anim instanceof Souris){
                            anim.affiche();
                        }
                    }
                    break;
                case 2 : 
                    for (Enumeration e = lesAnimaux.elements(); e.hasMoreElements();){
                        Animal anim = (Animal) e.nextElement();
                        if(anim instanceof Singe){
                            anim.affiche();
                        }
                    }
                    break;
                default : 
                    for (Enumeration e = lesAnimaux.elements(); e.hasMoreElements();){
                        Animal anim = (Animal) e.nextElement();
                        anim.affiche();
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
	System.out.println("Taper 3 pour ajouter une expérience");
	System.out.println("Taper 4 pour afficher les expériences");
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
