package protocole;
import experiences.*;
import animaux.*;
import java.util.*;
import java.io.*;

public class Test{

    private Cobaye cobaye;
    protected int jour = 0;
    
    public Test(Cobaye cob){
	jour++;
	cobaye=cob;
    }

    public String getId(){
	return cobaye.getId();
    }
    
    public Cobaye getCobaye(){
	return cobaye;
    }

    public Experience getExp(){
	return cobaye.getExp();
    }

    public String getStress(){
	return cobaye.getStress();
    }

    public void setStress(String str){
	cobaye.setStress(str);
    }

    public String getStatut(){
	return cobaye.getStatut();
    }
    
    public void setStatut(String st){
	cobaye.setStatut(st);
    }
    
    public void affiche(){
	System.out.println("Experience : "+ cobaye.getNumExp());
	System.out.println("Sujet : " + cobaye.getId());
	System.out.println("Jour : "+ jour);
	System.out.println("\n");
    }
    public void afficheImage(){
	System.out.println("Experience : "+ cobaye.getNumExp());
	System.out.println("Sujet : " + cobaye.getId());
	System.out.println("Jour : "+ jour);
	System.out.println("\n");
    }
    public void afficheNourriture(){
	System.out.println("Experience : "+ cobaye.getNumExp());
	System.out.println("Sujet : " + cobaye.getId());
	System.out.println("Jour : "+ jour);
	    
	System.out.println("\n");
    }
    
    public void afficheLabyrinthe(){
	System.out.println("Experience : "+ cobaye.getNumExp());
	System.out.println("Sujet : " + cobaye.getId());
	System.out.println("Jour : "+ jour);
	System.out.println("\n");
    }
}
