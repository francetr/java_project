package experiences;
import java.util.*;
public class Nourriture extends Experience{

    protected int nbCachette = 5;
    protected int nbVisite = 0;
    protected String succes = null;
    public static int num = 0;
    protected int numOrdre = 0;
	
    public Nourriture(){
	super();
    }

    public Nourriture(String s, int n){
	super();
	nbVisite = n;
	succes = s;
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
	super().affiche();
	if (succes.equals("succes")){
	    System.out.println("Experience de nourriture" + "\nL'experience n° " + numOrdre +" est un "+ succes + ", le sujet a visite " + nbVisite + " cachette avant de trouver la nourriture\n");
	}
	else{
	    System.out.println("Experience de nourriture" + "\nL'experience n° " + numOrdre +" est un "+ succes + ", le sujet a visite " + nbVisite + " cachette sans trouver la nourriture\n");
	}
    }
}
