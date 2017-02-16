package experiences;

import animaux.*;
public class Image extends Experience {


    private Singe singe;
    private int nbImage = 0;
    private String succes = "";
    private int numImage = 0;
    public static int num = 0;
    
    public Image(Singe s){
	super(s);
	num++;
	numImage = num;
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
    
    public int getNbImage(){
	return nbImage;
    }
    
    public int getNumImage(){  // avoir le numéros de l'exp Image lors de sa création
	return numImage;
    }

    public int getNum(){  // avoir nb tot d'exp Image
	return num;
    }

    public String getSucces(){ // succes sous forme de String, a voir si on peut transformer en booléan
	return succes;
    }
    
    public void setNbImage(int choix){
	nbImage = choix;
    }

    public void setNumImage(int choix){
	numImage = choix;
    }
    
    public void setSucces(String succes){
	this.succes = succes;
    }
       
    public void affiche(){
	super.affiche();
	if (nbImage < 8){
	    System.out.println("Nombre images choisies : " + nbImage + "\n" + "Résultat : " + succes);
	}
	else{
	    System.out.println("Nombre images choisies : " + nbImage + "\n" + "Résultat : " + succes);
	}
    }
}
    
