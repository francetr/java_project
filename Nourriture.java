package experiences;
import java.util.*;
public class Nourriture extends Experience{

    private int nbCachette = 5;
    private int nbVisite = 0;
    private String succes = null;
    private int num = 0;
    private int numImage = 0;
	
    public Nourriture(){
	num ++;
	numImage = num;
    }

    public int getNbVisite(){
	return nbVisite;
    }

    public String getSucces(){
	return succes;
    }

    public int getNumOrdre(){  // avoir le numéros de l'exp nourriture lors de sa création
	return numOrdre;
    }

    public int getNum(){  // avoir nb tot d'exp nourriture
	return num;
    }

    public void setNbVisite(int v){
	nbVisite = v;
    }

    public void setSucces(String s){
	succes = s;
    }
    
    public void affiche(){
	super.affiche();
	System.out.println("Experience de nourriture n° : " + numImage);
	if (succes.equals("succes")){
	    System.out.println("Nombre de visites : " + nbVisite + "\n" + "Résultat : "+ succes);
	}
	else{
	    System.out.println("Nombre de visittes : " + nbVisite +"Résultat : "+ succes+ "\n");
	}
    }
}
