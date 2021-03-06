import java.lang.Math;
import java.util.Scanner;
/**
 * Klasse mit Methoden in welchen Formeln , fuer verschiedene mathematische Rechnungen, programmiert sind.
 * @author  David Wente
 * @author Nicolas Schnur
 * @version (1.0)
 */
 public class MathFunctions {
    private Scanner input = new Scanner(System.in);
    private static final long MAX =1000000000;
    private static final long MIN =100000000;
    
    private long a;
    private long b;
    
    /** Methode zum berechnen der Teilersumme.
    * Hier wird die eingegebene Zahl durch jede kleinere Zahl geteilt und daraus die Summe gebildet.
    */ 
    public static long berechneTeilSumme(long zahl) {
        if (zahl<0){
            throw new IllegalArgumentException("es dürfen nur natürliche Zahlen"+
            "eingegeben werden ");}
        if (zahl ==0) {
            throw new IllegalArgumentException("die Zahl 0 hat keine Teiler");  }
        long summe = 0;
        for (long i=1; i <=zahl; i++) {
          if(zahl % i==0) { 
             summe = summe + i;
          }
        }
        return summe;
    } 
    
    /**Methode zum berechnen der Pruefziffer einer 10-stelligen ISBN.
     * Hier wird die ISBN in ihre ersten neun Ziffern zerlegt und mit den Zahlen von 1-9 multipliziert und anschließend die Summe gebildet.
     * Das Ergebnis wird mit mod 11 verrechnet um die Pruefziffer zu erhalten.
     */
    public static String berechneChecksummeIsbn( long isbn){
        if( isbn<=MIN ||isbn>MAX){
            throw new IllegalArgumentException(
            "Zahl ist nicht 9-stellig"); }
        long summe= 0;
        long pruefziffer= 0;
        long isbn1=0;
        while(isbn>0){
            for (long i=9; i>0; i--) {
             isbn1 = isbn1 + (isbn % 10) * i;
             isbn= isbn/10 ;
             summe = isbn1;
            }
        }
        pruefziffer = summe % 11;
        if(pruefziffer == 10) {
            return "Pruefziffer : X mod 11";
        }
        return "Pruefziffer: "+pruefziffer +" mod 11";
    }
    
    /**Methode zur berechnung der Nullstellen einer quadratischen Funktion .
     * Hierzu wird die Pq-Formel angewendet.
     * Dann wird die Art der Nullstelle mit ihren Werten ausgegeben.
     */
    public static String berechneNullstelle (double p, double q) {
        double x1 = 0;
        double x2 = 0;
        String Ergebnis;
        x1 = -p/2 +  Math.sqrt(Math.pow(p/2,2)-q);
        x2 = -p/2 - Math.sqrt(Math.pow(p/2,2)-q);
        if (Math.sqrt(Math.pow(p/2,2)-q) >0) {
            System.out.println();
            Ergebnis="Zwei Nullstellen : "+ x1 +" | "+ x2; 
        }else if (Math.sqrt(Math.pow(p/2,2)-q) ==0){
           System.out.println();
           Ergebnis = "Doppelte Nullstelle : "+ x1;
        }else{
           System.out.println();
           Ergebnis = "Komplexe Nullstellen";
        } 
        return Ergebnis; 
    }
       public static long berechneGgt(long a, long b){
        
        if(b == 0 ){
            return a;
        }else if (a == 0 ) {
            return b ;
        } else { return berechneGgt(b,a%b) ;
        
    }
}
       public static  boolean istPalindrom(String wort) {
    	   
    	   boolean palindrom ;
    	   String umkehr = "";
    	   wort = wort.replace(" ", "").toLowerCase();
    	   
    	 
    	  // check(wort != null && wort.trim().isEmpty() ,
    			//   "Keine Eingabe");
    	   
    	   
    	   if( wort.length() == 1) {
    		   return true ;
    	   }
    	   
    	   for (int i = wort.length()-1 ; i >= 0; i-- ) {
    		   umkehr += wort.charAt(i);
    		   System.out.println(umkehr);
    		   
    	   }  
    	  palindrom = true ;
    	   for (int i = 0 ; i < wort.length();i++) {
    		   if ( wort.charAt(i) != umkehr.charAt(i)){;
    		   palindrom = false;
    		   break;
    		   }
    	   }
    	   
    	   if(palindrom == true ) {
    		   System.out.println("Palindrom gefunden !");
    		    ;
    	   }else {
    	   System.out.println("Kein Palindrom");
    	   
    	   }
    	   return palindrom;
    	   }

	public long getA() {
		return a;
	}

	public void setA(long a) {
		this.a = a;
	}
	 public static void check(boolean bedingung, String msg){
		    if (!bedingung) 
		        throw new IllegalArgumentException(msg);
		}

public static void main (String [] args ) {
	
	String a = "race car " ;
	istPalindrom(a);
}
 }
    














        
        
        
        
