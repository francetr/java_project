import java.util.*;
public class Nourriture{

    protected int nbCachette = 5;
    protected int nbVisite = 0;
    protected String succes = null;
    public static int num = 0;
    protected int numOrdre = 0;
	
    public Nourriture(){
	num++;
	numOrdre = num;
    }

    public Nourriture(int tps){
	num++;
	numOrdre = num;
    }

    public int getNbVisite(){
	return nbVisite;
    }
   

    public void setNbVisite(int v){
	nbVisite = v;
    }

    public int getNumOrdre(){  // avoir le numéros de l'exp nourriture lors de sa création
	return numOrdre;
    }

    public int getNum(){  // avoir nb tot d'exp nourriture
	return num;
    }
    
    public void affiche(){
	System.out.println("Experience de nourriture" + "\nn° :  " + numOrdre  + "\nnombre cachette visitee : " + nbVisite);
    }
}
