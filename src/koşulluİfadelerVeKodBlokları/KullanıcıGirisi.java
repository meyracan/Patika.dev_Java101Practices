package koþulluÝfadelerVeKodBloklarý;
import java.util.Scanner;
public class KullanýcýGirisi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Kullanýcý adýnýz: ");
		String userName = input.nextLine();
		System.out.print("Þifreniz: ");
		String password = input.nextLine();
		
		
		if(userName.equals("Meyra") && password.equals("12345")) {
			System.out.println("Giriþ baþarýlý!");
		}
		else if(userName.equals("Meyra") && !password.equals("12345")) {
			System.out.println("Þifreniz yanlýþ! Þifrenizi sýfýrlamak ister misiniz? 1: Evet, 2:Hayýr. Seçiminizi tuþlayýnýz: ");
			int secim = input.nextInt();
			switch(secim) {
				case 1:
					System.out.println("Yeni þifrenizi girin: ");
					//Neden yeni Scanner newlemek zorundayým?
					Scanner input2 = new Scanner(System.in);
					String yeniSifre = input2.nextLine();
					
					if(yeniSifre.equals("12345")) {
						System.out.println("Þifre oluþturulamadý, lütfen baþka þifre giriniz.");
					}
					else
						System.out.println("Þifre oluþturuldu.");
					break;
				case 2: 
					System.out.println("Þireniz sýfýrlanmýyor.");
					break;
				default:
					System.out.println("Hatalý tuþlama yaptýnýz!");
			}
		}
		else
			System.out.println("Hatalý giriþ!");

	}

}
