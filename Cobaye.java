package protocole;

import experiences.*;
import animaux.*;
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
    private int jour = 1;
    
    public Cobaye(){;}

    public Cobaye(Animal anim, Experience exp){
	animal = anim;
	experience = exp;	
    }

    public String getId(){
	return animal.getId();
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
	System.out.println("Sujet : " + animal.getId());
	System.out.println("Jour : "+ jour);
	experience.affiche();
	System.out.println("\n");
    }
}
