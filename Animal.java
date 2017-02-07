import java.util.*;

abstract public class Animal{

    protected String id;
    protected int poids;
    protected char sexe;
    protected boolean vivant;
    public static int num = 0;

    public Animal() {
	num++;
	id = "Inconnue";
	poids = 0;
	sexe = 'A';
	vivant = true;
    }

    public Animal(String chaine, int nb, char sx) {
	num++;
	id = chaine;
	poids = nb;
	sexe = sx;
	vivant = true;
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
    
    public boolean getStatut(){
	return vivant;
    }

    
    public void setId(String chaine){
	id = chaine;
    }

    public void setPoids(int nb){
	poids = nb;
    }   

    public void setSexe(char sx){
	sexe = sx;
    }

    public void setStatut(boolean viv){
	vivant = viv;
    }  
}
