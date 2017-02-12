package experiences;
import java.util.*;

abstract public class Experience {

    public static int num = 0;
    protected int numOrdre = 0;
    protected int nbJour = 0;
    
    public Experience(){
	num++;
	numOrdre = num;
    }

    public void affiche(){
	System.out.println("n° Expérience :" + numOrdre);
    }

}
