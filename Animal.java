import java.util.*;

abstract public class Animal{

    protected String id;
    protected int poids;
    protected char sexe;
    protected String vivant;
    protected int num =0;
    public static int numOrdre = 0;

    public Animal() {
	numOrdre++;
	num = numOrdre;
	id = "Inconnue";
	poids = 0;
	sexe = 'A';
	vivant = "vivant";
    }

    public Animal(String chaine, int nombre, char sx) {
	numOrdre++;
	num = numOrdre;
	id = chaine;
	poids = nombre;
	sexe = sx;
	vivant = "vivant";
    }


    public String getId(){
	return id;
    }

    public int getPoids(){
	return poids;
    }

    public char getSexe(){
	return sexe;
    }
    
    public String getStatut(){
	return vivant;
    }

    public int getNum(){
	return num;
    }
    
    public void setId(String chaine){
	id = chaine;
    }

    public void setPoids(int nombre){
	poids = nombre;
    }   

    public void setSexe(char sx){
	sexe = sx;
    }

    public void setStatut(String viv){
	vivant = viv;
    }

    public void affiche(){	
	System.out.println("num : " + num + "\nid : "  + id + "\npoids : " + poids + "\nsexe : " + sexe + "\nstatut : " + vivant + "\n" );
    }q
}
