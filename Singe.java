import java.util.*;

public class Singe extends Animal{
    public Singe(){
	super();
    }
    public Singe(String chaine, int nb, char sx){
	super(chaine, nb, sx);
    }
    
    public void affiche(){
	System.out.println("----Singe----");	
	super.affiche();
    }
}
