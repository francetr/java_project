package experiences;
import java.util.*;
public class Labyrinthe extends Experience {

    protected int temps;
    public static int num = 0;
    protected int numOrdre = 0;

    
    public Labyrinthe(){
	super();
    }
    
    public Labyrinthe(int tps){
	super();
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
	super().affiche();
	System.out.println("Experience du labyrinthe n° " + numOrdre  + "\ntemps du parcous (sec) : " + temps);
    }

    
}
