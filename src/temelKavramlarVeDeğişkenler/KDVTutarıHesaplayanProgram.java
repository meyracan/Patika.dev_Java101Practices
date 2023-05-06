package temelKavramlarVeDeðiþkenler;

import java.util.Scanner;

public class KDVTutarýHesaplayanProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Para deðerini giriniz: ");
		double paraDegeri = input.nextDouble();
		double kdvOrani;
		if(paraDegeri<=1000)
			kdvOrani = 0.18;
		else
			kdvOrani= 0.08;
		double kdvSizFiyat = paraDegeri;
		double kdvTutari = paraDegeri*kdvOrani;
		double kdvLiFiyat = kdvTutari + paraDegeri;
		
		System.out.println("KDV Oraný : " + kdvOrani);
		System.out.println("KDV'siz Fiyat : " + kdvSizFiyat);
		System.out.println("KDV'li Fiyat : " + kdvLiFiyat);
		System.out.printf("KDV Tutarý : %.1f", kdvTutari);
		
	}

}
