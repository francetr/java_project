package animaux;

public class SourisN extends Souris{

    public static int num=0;
    private int numOrdre=0 ;
    
    public SourisN(){
	super();
	num++;
	numOrdre = num;
    }
    
    public SourisN(String chaine, float nb, char sx){
	super(chaine, nb, sx);
	num++;
	numOrdre = num;
    }

    public String getStatut(){
	return super.getStatut();
    }

    public void setStatut(String s){
	super.setStatut(s);
    }

    public float getPoids(){
	return super.getPoids();
    }
    
    public void setPoids(float nb){
	super.setPoids(nb);
    }   
    
    public void affiche(){
	System.out.println("SourisN n°" + numOrdre);
	super.affiche();
    }
}
