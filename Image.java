package experiences;
import java.util.*;
public class Image extends Experience {
    
    protected int nbImage = 0;
    protected String succes = "";
    protected int numOrdre = 0;
    protected int essai = 0;
    public static int num = 0;
    
    public Image(){
	super();
	num++;
	numOrdre = num;
	essai = 1;
    }

    public int getNbImage(){
	return nbImage;
    }
    
    public int getNumOrdre(){  // avoir le numéros de l'exp Image lors de sa création
	return numOrdre;
    }

    public int getNum(){  // avoir nb tot d'exp Image
	return num;
    }

    public String getSucces(){ // succes sous forme de String, a voir si on peut transformer en booléan
	return succes;
    }

    public int getEssai(){
	return essai;
    }
    
    public void setNbImage(int choix){
	nbImage = choix;
    }

    public void setSucces(String succes){
	this.succes = succes;
    }
    
    public void setEssai(int essai){
	this.essai = essai;
    }
    
    public void affiche(){
	super.affiche();
	System.out.println("Experience Image n° : " + numOrdre);
	System.out.println("Essai n° : " + essai );
	if (nbImage < 8){
	    System.out.println("Nombre images choisies : " + nbImage + "\n" + "Résultat : " + succes + "\n" );
	}
	else{
	    System.out.println("Nombre images choisies : " + nbImage + "\n" + "Résultat : " + succes + "\n" );
	}
    }
}
    
