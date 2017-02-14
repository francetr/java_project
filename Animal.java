package animaux;
import java.util.*;
import java.io.*;

abstract public class Animal{

    protected String id;
    protected float poids;
    protected char sexe;
    protected String vivant;
    protected int numOrdre = 0;
    public static int num = 0;
    protected String stress ="stresse";
    
    public Animal() {
	num++;
	numOrdre = num;
	id = "Inconnue";
	poids = 0;
	sexe = 'I';
	vivant = "vivant";
    }

    public Animal(String chaine, float nb, char sx) {
	num++;
	id = chaine;
	numOrdre = num;
	poids = nb;
	sexe = sx;
	vivant = "vivant";
    }

    public String getStress(){
	return stress;
    }

    public void setStress(String str){
	stress= str;
    }
    
    public String getId(){
	return id;
    }

    public float getPoids(){
	return poids;
    }

    public char getSexe(){  // avoir sexe M ou F; I = Indéterminé
	return sexe;
    }
    
    public String getStatut(){ // avoir statut viv ou mort
	return vivant;
    }

    public int getNumOrdre(){  // avoir le numéros de l'animal lors de sa création
	return numOrdre;
    }

    public int getNum(){  // avoir nb tot d'animaux
	return num;
    }
    
    public void setId(String chaine){
	id = chaine;
    }

    public void setPoids(float nb){
	poids = nb;
    }   

    public void setSexe(char sx){
	sexe = sx;
    }

    public void setStatut(String viv){
	vivant = viv;
    }

    
    public void affiche(){	
	System.out.println("num : " + numOrdre +"\nid : " + id + "\npoids : " + poids + "\nsexe : " + sexe + "\nstatut : " + vivant + "\n" );
    }


    public static String saisie_chaine ()
    {
	try {
	    BufferedReader buff = new BufferedReader
		(new InputStreamReader(System.in));
	    String chaine=buff.readLine();
	    return chaine;
	}
	catch(IOException e) {
	    System.out.println(" impossible de travailler" +e);
	    return null;
	}
    }

    public static int saisie_entier ()
    {
	try{
	    BufferedReader buff = new BufferedReader
		(new InputStreamReader(System.in));
	    String chaine=buff.readLine();
	    int num = Integer.parseInt(chaine);
	    return num;
	}
	catch(IOException e){return 0;}
    }
}
