package experiences;

public class Labyrinthe extends Experience {

    private int temps;
    public static int num = 0;
    private int numLabyrinthe = 0;

    
    public Labyrinthe(){
	num ++;
	numLabyrinthe = num;
    }

    public int getTemps(){
	return temps;
    }

    public void setTemps(int tps){
	temps = tps;
    }

    public int getNumOrdre(){  // avoir le numéros de l'exp lab lors de sa création
	return numLabyrinthe;
    }

    public int getNum(){  // avoir nb tot d'exp lab
	return num;
    }
    
    public void affiche(){
	super.affiche();
	System.out.println("Experience du labyrinthe n° " + numLabyrinthe  + "\nTemps du parcous (sec) : " + temps);
    }    
}
