package ko�ullu�fadelerVeKodBloklar�;
import java.util.Scanner;
public class S�n�f�GecmeDurumu {

	public static void main(String[] args) {
		double ortalama; int toplam=0; int counter=0;
		Scanner input = new Scanner(System.in);
		System.out.print("Matematik notunuzu giriniz: ");
		int matNotu = input.nextInt();
		System.out.print("Fizik notunuzu giriniz: ");
		int fizikNotu = input.nextInt();
		System.out.print("T�rk�e notunuzu giriniz: ");
		int turkceNotu = input.nextInt();
		System.out.print("Kimya notunuzu giriniz: ");
		int kimyaNotu = input.nextInt();
		System.out.print("M�zik notunuzu giriniz: ");
		int muzikNotu = input.nextInt();
		
		if(matNotu>=0 && matNotu<=100) {
			toplam += matNotu;
			counter++;
		}
		if(fizikNotu>=0 && fizikNotu<=100) {
			toplam += fizikNotu;
			counter++;
		}
		if(turkceNotu>=0 && turkceNotu<=100) {
			toplam += turkceNotu;
			counter++;
		}
		if(kimyaNotu>=0 && kimyaNotu<=100) {
			toplam += kimyaNotu;
			counter++;
		}
		if(muzikNotu>=0 && muzikNotu<=100) {
			toplam += muzikNotu;
			counter++;
		}
		
		
		ortalama = toplam / counter;

		if(ortalama >= 55) {
			System.out.println("S�n�f� ge�tiniz.");
		}
		else
			System.out.println("S�n�f� ge�emediniz.");
		
		System.out.println("Ortalaman�z: " + ortalama);

	}

}
