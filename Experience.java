package experiences;
import java.util.*;

abstract public class Experience {

    public static int num = 0;
    protected int numExp = 0;
    
    public Experience(){
	num++;
	numExp = num;
    }


    public int getNumExp(){
	return numExp;
    }

    public void setNumExp(int n){
	numExp = n;
    }
    
    
    public void affiche(){
	System.out.println("Expérience n° : " + numExp);
    }
}
