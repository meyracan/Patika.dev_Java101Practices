package temelKavramlarVeDe�i�kenler;
import java.util.Scanner;

public class ManavKasaProgram� {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double armutKgFiyati = 2.14;
		double elmaKgFiyat� = 3.67;
		double domatesKgFiyat� = 1.11;
		double muzKgFiyat� = 0.95;
		double patlicanKgFiyat� = 5;
		
		System.out.print("Armut ka� kilo?: ");
		double armutKilosu = input.nextDouble();
		
		System.out.print("Elma ka� kilo?: ");
		double elmaKilosu = input.nextDouble();
		
		System.out.print("Domates ka� kilo?: ");
		double domatesKilosu = input.nextDouble();
		
		System.out.print("Muz ka� kilo?: ");
		double muzKilosu = input.nextDouble();
		
		System.out.print("Patl�can ka� kilo?: ");
		double patlicanKilosu = input.nextDouble();
		
		double toplamTutar = (armutKgFiyati*armutKilosu) + (elmaKgFiyat�*elmaKilosu) + (domatesKgFiyat�*domatesKilosu) +
				(muzKgFiyat�*muzKilosu) + (patlicanKgFiyat�*patlicanKilosu);
		
		System.out.println("Toplam tutar: " + toplamTutar);

	}

}
