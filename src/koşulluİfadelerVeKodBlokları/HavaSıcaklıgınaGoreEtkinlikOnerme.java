package koþulluÝfadelerVeKodBloklarý;
import java.util.Scanner;
public class HavaSýcaklýgýnaGoreEtkinlikOnerme {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Hava sýcaklýðýný Santigrat derece cinsinden giriniz: ");
		int derece = input.nextInt();
		
		if(derece<5) 
			System.out.println("Kayak");
		else if(derece <15) {
			System.out.println("Sinema");
			if(derece>10)
				System.out.println("Piknik");
		}
		else if(derece >15 && derece <25)
			System.out.println("Piknik");
		else
			System.out.println("Yüzme");

	}

}
