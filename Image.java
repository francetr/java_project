import java.util.*;
public class Image {
    
    protected int nbImage = 10;
    protected int nbImageChoisie = 0;
    protected String succes = null;
    protected int numOrdre = 0;
    public static int num = 0;
    
    public Image(){
	num++;
	numOrdre = num;
    }

    public Image(int choix, String chaine ){
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
    
    public void setNbImageChoisie(int choix){
	nbImageChoisie = choix;
    }

    public void affiche(){
	System.out.println("expérience Image" + "n° " + num );
    }
    
}
