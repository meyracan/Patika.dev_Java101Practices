package ko�ullu�fadelerVeKodBloklar�;
import java.util.Scanner;
public class Kullan�c�Girisi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Kullan�c� ad�n�z: ");
		String userName = input.nextLine();
		System.out.print("�ifreniz: ");
		String password = input.nextLine();
		
		
		if(userName.equals("Meyra") && password.equals("12345")) {
			System.out.println("Giri� ba�ar�l�!");
		}
		else if(userName.equals("Meyra") && !password.equals("12345")) {
			System.out.println("�ifreniz yanl��! �ifrenizi s�f�rlamak ister misiniz? 1: Evet, 2:Hay�r. Se�iminizi tu�lay�n�z: ");
			int secim = input.nextInt();
			switch(secim) {
				case 1:
					System.out.println("Yeni �ifrenizi girin: ");
					//Neden yeni Scanner newlemek zorunday�m?
					Scanner input2 = new Scanner(System.in);
					String yeniSifre = input2.nextLine();
					
					if(yeniSifre.equals("12345")) {
						System.out.println("�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz.");
					}
					else
						System.out.println("�ifre olu�turuldu.");
					break;
				case 2: 
					System.out.println("�ireniz s�f�rlanm�yor.");
					break;
				default:
					System.out.println("Hatal� tu�lama yapt�n�z!");
			}
		}
		else
			System.out.println("Hatal� giri�!");

	}

}
