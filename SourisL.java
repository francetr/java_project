package animaux;

import experiences.*;
public class SourisL extends Souris{

    private Labyrinthe labyrinthe;
    protected int numOrdre = 0;
    public static int num = 0;
    
    public SourisL(){
	super();
	num++;
	numOrdre = num;
    }
    
    public SourisL(String chaine, float nb, char sx){
	super(chaine, nb, sx);
	num++;
	numOrdre = num;	
    }

    public int getNumOrdre(){  // avoir le numéros de l'animal lors de sa création
	return numOrdre;
    }

    public int getNum(){  // avoir nb tot d'animaux
	return num;
    }

    public String getStatut(){
	return super.getStatut();
    }

    public void setStatut(String s){
	super.setStatut(s);
    }
    
    public void affiche(){
	System.out.println("SourisL n°" + numOrdre);
	super.affiche();
    }
}
