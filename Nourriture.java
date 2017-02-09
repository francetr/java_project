import java.util.*;
public class Nourriture{

    protected int nbCachette = 5;
    protected int nbVisite = 0;
    public static int num = 0;
    protected int numOrdre = 0;
	
    public Nourriture(){
	super();
    }

    public Nourriture(int tps){
	num++;
	numOrdre = num;
	temps = tps;
    }
    
    public int getTemps(){
	return temps;
    }
    
    public void setTemps(int tps){
	temps = tps;
    }

    public int getNumOrdre(){  // avoir le numéros de l'exp nourriture lors de sa création
	return numOrdre;
    }

    public int getNum(){  // avoir nb tot d'exp nourriture
	return num;
    }
    
    public void affiche(){
	System.out.println("Experience de nourriture" + "\nn° :  " + numOrdre  + "\ntemps du parcous (sec) : " + temps);
    }
}
