import java.util.*;
public class Labyrinthe {

    protected int temps = 0;
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

    public void affiche(){
	System.out.println("Experience du labyrinthe" + "\nn° :  " + numOrdre);
    }
}
