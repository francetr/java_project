import java.util.*;

abstract public class Animal{


    private String id;
    private int poids;
    private String sexe;
    private String etat;
    public static int num = 0;

    public Animal() {
	num++;
	id = "Inconnue";
	poids = 0;
	sexe = "Inconnu";
	etat = "inconnu";
    }

    
    public Animal(String chaine, int nb, String sx, String viv) {
	num++;
	id = chaine;
	poids = nb;
	sexe = sx;
	etat = viv;
    }


    public String getId(){
	return id;
    }

    public String getPoids(){
	return poids;
    }

    public String getSexe(){
	return sexe;
    }
    
    public String getEtat(){
	return poids;
    }
    
    public void setId(String chaine){
	id = chaine
    }


    public void setPoids(int nb){
	id = nb;
    }   


    public void setSexe(String sx){
	sexe = sx;
    }
    

    public void setEtat(String viv){
	etat = viv;
    }  

    

}
