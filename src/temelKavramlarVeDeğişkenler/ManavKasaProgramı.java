package temelKavramlarVeDeðiþkenler;
import java.util.Scanner;

public class ManavKasaProgramý {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double armutKgFiyati = 2.14;
		double elmaKgFiyatý = 3.67;
		double domatesKgFiyatý = 1.11;
		double muzKgFiyatý = 0.95;
		double patlicanKgFiyatý = 5;
		
		System.out.print("Armut kaç kilo?: ");
		double armutKilosu = input.nextDouble();
		
		System.out.print("Elma kaç kilo?: ");
		double elmaKilosu = input.nextDouble();
		
		System.out.print("Domates kaç kilo?: ");
		double domatesKilosu = input.nextDouble();
		
		System.out.print("Muz kaç kilo?: ");
		double muzKilosu = input.nextDouble();
		
		System.out.print("Patlýcan kaç kilo?: ");
		double patlicanKilosu = input.nextDouble();
		
		double toplamTutar = (armutKgFiyati*armutKilosu) + (elmaKgFiyatý*elmaKilosu) + (domatesKgFiyatý*domatesKilosu) +
				(muzKgFiyatý*muzKilosu) + (patlicanKgFiyatý*patlicanKilosu);
		
		System.out.println("Toplam tutar: " + toplamTutar);

	}

}
