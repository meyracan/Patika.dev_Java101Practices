package temelKavramlarVeDe�i�kenler;
import java.util.Scanner;

public class NotOrtalamas�HesaplayanProgram {
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner(System.in);
    	System.out.print("Matematik s�nav puan�n� giriniz: ");
    	int matematikNotu = input.nextInt();
    	
    	System.out.print("Fizik s�nav puan�n� giriniz: ");
    	int fizikNotu = input.nextInt();
    	
    	System.out.print("Kimya s�nav puan�n� giriniz: ");
    	int kimyaNotu = input.nextInt();
    	
    	System.out.print("T�rk�e s�nav puan�n� giriniz: ");
    	int turkceNotu = input.nextInt();
    	
    	System.out.print("Tarih s�nav puan�n� giriniz: ");
    	int tarihNotu = input.nextInt();
    	
    	System.out.print("M�zik s�nav puan�n� giriniz: ");
    	int muzikNotu = input.nextInt();
    	
    	double notOrtalamas� = (matematikNotu + fizikNotu + kimyaNotu + turkceNotu + tarihNotu + muzikNotu) / 6.0;
    	
    	System.out.println("Not ortalamas�: " +notOrtalamas�);
    	
    	String kaldiGecti = notOrtalamas� < 60 ? "S�n�fta Kald�" : "S�n�f� Ge�ti";
    	
    	System.out.println(kaldiGecti);
       
    	
    	
  
        }    
}
