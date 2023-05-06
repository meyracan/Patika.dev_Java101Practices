package temelKavramlarVeDeðiþkenler;
import java.util.Scanner;

public class NotOrtalamasýHesaplayanProgram {
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	System.out.print("Matematik sýnav puanýný giriniz: ");
    	int matematikNotu = input.nextInt();
    	
    	System.out.print("Fizik sýnav puanýný giriniz: ");
    	int fizikNotu = input.nextInt();
    	
    	System.out.print("Kimya sýnav puanýný giriniz: ");
    	int kimyaNotu = input.nextInt();
    	
    	System.out.print("Türkçe sýnav puanýný giriniz: ");
    	int turkceNotu = input.nextInt();
    	
    	System.out.print("Tarih sýnav puanýný giriniz: ");
    	int tarihNotu = input.nextInt();
    	
    	System.out.print("Müzik sýnav puanýný giriniz: ");
    	int muzikNotu = input.nextInt();
    	
    	double notOrtalamasý = (matematikNotu + fizikNotu + kimyaNotu + turkceNotu + tarihNotu + muzikNotu) / 6.0;
    	
    	System.out.println("Not ortalamasý: " +notOrtalamasý);
    	
    	String kaldiGecti = notOrtalamasý < 60 ? "Sýnýfta Kaldý" : "Sýnýfý Geçti";
    	
    	System.out.println(kaldiGecti);
       
    	
    	
  
        }    
}
