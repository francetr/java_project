package animaux;

public class Singe extends Animal{

    public static int num=0;
    private int numOrdre=0 ;
    
    public Singe(){
	super();
	num++;
	numOrdre = num;
    }
    
    public Singe(String chaine, float nb, char sx){
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
	System.out.println("----Singe----");
	System.out.println("Singe n°" + numOrdre);
	super.affiche();
    }
}
