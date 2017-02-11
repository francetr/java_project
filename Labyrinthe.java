import java.util.*;
public class Labyrinthe {

    protected int temps;
    public static int num = 0;
    protected int numOrdre = 0;

    
    public Labyrinthe(){
	num++;
	numOrdre = num;
    }
    
    public Labyrinthe(int tps){
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

    public int getNumOrdre(){  // avoir le numéros de l'exp lab lors de sa création
	return numOrdre;
    }

    public int getNum(){  // avoir nb tot d'exp lab
	return num;
    }
    
    public void affiche(){
	System.out.println("Experience du labyrinthe n° "  + numOrdre  + "\ntemps du parcous (sec) : " + temps);
    }

    
}
