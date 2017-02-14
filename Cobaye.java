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

    private Animal animal;
    private Experience experience;
    private Labyrinthe labyrinthe;
    private Nourriture nourriture;
    private Image image;
    private Test test;
    private int jour = 1;
    
    public Cobaye(){;}

    public Cobaye(Animal anim, Experience exp){
	animal = anim;
	experience = exp;
    }

    public int getNumExp(){
	return experience.getNumExp();
    }

    // Méthodes pour avoir/modifier info sur l'animal
    public String getId(){
	return animal.getId();
    }
    
    public Animal getAnimal(){
	return animal;
    }
    
    public String getStatut(){
	return animal.getStatut();
    }

    public void setStatut(String st){
	animal.setStatut(st);
    }

    public void setAnimal(Animal anim){
	animal = anim;
    }

    public String getStress(){
	return animal.getStress();
    }

    public void setStress(String str){
	animal.setStress(str);
    }
    
    // Méthodes pour avoir/modifier infos sur exp
    public Experience getExp(){
	return experience;
    }

    public void setExp(Experience exp){
	experience = exp;
    }
    
    // Méthodes pour exp Labyrinthe
    public void setTemps(int tps){ // si exp labyrinthe
	labyrinthe.setTemps(tps);
    }

    public int getTemps(){ // si exp lab
	return labyrinthe.getTemps();
    }
    
    // Méthodes pour exp Nourritures
    public void setNbVisite(int nb){
	nourriture.setNbVisite(nb);
    }

    public void setSucces(String str){
	nourriture.setSucces(str);
    }

    public String getSucces(){
	return nourriture.getSucces();
    }
}



