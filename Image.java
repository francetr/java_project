import java.util.*;
public class Image extends Experience {
    
    protected int nbImage = 10;
    protected int nbImageChoisie = 0;
    protected String succes = null;
    protected int numOrdre = 0;
    public static int num = 0;
    
    public Image(){
	num++;
	numOrdre = num;
    }

    public Image(String chaine, int choix){
	num++;
	numOrdre = num;
	nbImageChoisie = choix;
	succes = chaine;
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
    
    public void setNbImageChoisie(int choix){
	nbImageChoisie = choix;
    }

    public void affiche(){
	System.out.println("expérience Image" + "\nn° " + num );
	if (nbImageChoisie < 8){
	    System.out.println("le sujet a trouvé la bonne image après " + nbImageChoisie + " tentatives," + " l'expérience est un " + succes + "\n" );
	}
	else{
	    System.out.println("le sujet a trouvé la bonne image après " + nbImageChoisie + " tentatives," + " l'expérience est un " + succes + "\n" );
	}
    }
    
}
