package experiences;

import animaux.*;
abstract public class Experience {

    public static int num = 0;
    protected int numExp = 0;
    private Animal anim;
    
    public Experience(Animal a){
	num++;
	numExp = num;
	anim = a;
    }

    public int getNumExp(){
	return numExp;
    }

    public String getStatut(){
	return anim.getStatut();
    }

    public void setStatut(String s){
	anim.setStatut(s);
    }

    public void setPoids(float p){
	anim.setPoids(p);
    }
    
    public float getPoids(){
	return anim.getPoids();
    }


    
    public void affiche(){
	System.out.println("Expérience n° : " + numExp);
    }
}
