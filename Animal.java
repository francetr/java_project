import java.util.*;

abstract public class Animal{

    protected String id;
    protected int poids;
    protected String sexe;
    protected String statut;
    public static int num = 0;

    public Animal() {
	num++;
	id = "Inconnue";
	poids = 0;
	sexe = "Inconnu";
	statut = "inconnu";
    }

    public Animal(String chaine, int nb, String sx, String viv) {
	num++;
	id = chaine;
	poids = nb;
	sexe = sx;
	statut = viv;
    }


    public String getId(){
	return id;
    }

    public int getPoids(){
	return poids;
    }

    public String getSexe(){
	return sexe;
    }
    
    public String getStatut(){
	return statut;
    }
    
    public void setId(String chaine){
	id = chaine;
    }


    public void setPoids(int nb){
	poids = nb;
    }   


    public void setSexe(String sx){
	sexe = sx;
    }
    

    public void setStatut(String viv){
	statut = viv;
    }  

    

}
