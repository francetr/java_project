package experiences;
import animaux.*;

public class Nourriture extends Experience{

    private SourisN sourisn;
    private int nbVisite = 0;
    private String succes = null;
    private int num = 0;
    private int numNourriture = 0; // num de création exp Vourr
	
    public Nourriture(SourisN sour){
	super(sour);
	num ++;
	numNourriture = num;
    }

    public String getStatut(){
	return sourisn.getStatut();
    }

    public void setStatut(String s){
	sourisn.setStatut(s);
    }

    public void setPoids(float p){
	sourisn.setPoids(p);
    }
    
    public float getPoids(){
	return sourisn.getPoids();
    }
    
    public int getNbVisite(){
	return nbVisite;
    }
    
    public String getSucces(){
	return succes;
    }

    public int getNumNourriture(){  // avoir le numéros de l'exp nourriture lors de sa création
	return numNourriture;
    }

    public int getNum(){  // avoir nb tot d'exp nourriture
	return num;
    }

    public void setNbVisite(int v){
	nbVisite = v;
    }

    public void setSucces(String s){
	succes = s;
    }
    
    public void affiche(){
	super.affiche();
	System.out.println("Experience de nourriture n° : " + numNourriture);
	if (succes.equals("succes")){
	    System.out.println("Nombre de visites : " + nbVisite + "\n" + "Résultat : "+ succes);
	}
	else{
	    System.out.println("Nombre de visites : " + nbVisite +"Résultat : "+ succes);
	}
    }
}
