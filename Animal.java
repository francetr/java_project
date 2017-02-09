import java.util.*;

abstract public class Animal{

    protected String id;
    protected int poids;
    protected char sexe;
    protected String vivant;
    public static int num = 0;

    public Animal() {
	num++;
	id = "Inconnue";
	poids = 0;
	sexe = 'I';
	vivant = "vivant";
    }

    public Animal(String chaine, int nb, char sx) {
	num++;
	id = chaine;
	poids = nb;
	sexe = sx;
	vivant = "vivant";
    }


    public String getId(){
	return id;
    }

    public int getPoids(){
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

    public void setPoids(int nb){
	poids = nb;
    }   

    public void setSexe(char sx){
	sexe = sx;
    }

    public void setStatut(String viv){
	vivant = viv;
    }

    public void affiche(){	
	System.out.println("id : " + id + "\npoids : " + poids + "\nsexe : " + sexe + "\nstatut : " + vivant + "\n" );
    }
}
