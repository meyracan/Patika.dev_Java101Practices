package ko�ullu�fadelerVeKodBloklar�;
import java.util.Scanner;
public class HavaS�cakl�g�naGoreEtkinlikOnerme {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Hava s�cakl���n� Santigrat derece cinsinden giriniz: ");
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
			System.out.println("Y�zme");

	}

}
