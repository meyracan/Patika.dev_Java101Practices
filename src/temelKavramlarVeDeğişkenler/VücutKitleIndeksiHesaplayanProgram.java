package temelKavramlarVeDe�i�kenler;
import java.util.Scanner;
public class V�cutKitleIndeksiHesaplayanProgram {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("L�tfen boyunuzu metre cinsinden giriniz: ");
		double boy = input.nextDouble();
		System.out.print("L�tfen kilonuzu giriniz: ");
		double kilo = input.nextDouble();
		
		double vucutKitleIndeksi = kilo / (Math.pow(boy, 2));
		
		System.out.println("V�cut kitle indeksiniz: " + vucutKitleIndeksi);
	}

}
