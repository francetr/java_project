package experiences;
import java.util.*;
public class Image extends Experience {
    
    protected int nbImageChoisie = 0;
    protected String succes = "";
    protected int  numOrdre = 0;
    protected int  essai = 0;
    public static int num = 0;
    
    public Image(){
	super();
	essai = 1;
    }

    public Image(String chaine, int choix){
	super();
	nbImageChoisie = choix;
	succes = chaine;
	essai = 1;
    }

    public int getNbImageChoisie(){
	return nbImageChoisie;
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
    
    public void setNbImageChoisie(int choix){
	nbImageChoisie = choix;
    }

    public void setSucces(String succes){
	this.succes = succes;
    }
    
    public void setEssai(int essai){
	this.essai = essai;
    }
    
    public void affiche(){
	System.out.println("Essai n° : " + essai );
	if (nbImageChoisie < 8){
	    System.out.println("Nombre images choisies : " + nbImageChoisie + "\n" + "Résultat : " + succes + "\n" );
	}
	else{
	    System.out.println("Nombre images choisies : " + nbImageChoisie + "\n" + "Résultat : " + succes + "\n" );
	}
    }
}
    
