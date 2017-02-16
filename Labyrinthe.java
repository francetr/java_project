package experiences;

import animaux.*;
public class Labyrinthe extends Experience {


    private SourisL sourl;
    private int temps;
    public static int num = 0;
    private int numLabyrinthe = 0;

    
    
    public Labyrinthe(SourisL sourl){
	super(sourl);
	num ++;
	numLabyrinthe = num;
	
    }

    public String getStatut(){
	return super.getStatut();
    }

    public void setStatut(String s){
	super.setStatut(s);
    }

    public void setPoids(float p){
	super.setPoids(p);
    }
    
    public float getPoids(){
	return super.getPoids();
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
