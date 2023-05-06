package ko�ullu�fadelerVeKodBloklar�;
import java.util.Scanner;
public class UcakBiletiFiyat�Hesaplama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Gidilen mesafeyi KM cinsinden giriniz: ");
		double mesafe = input.nextDouble();
		System.out.print("Ya�� giriniz: ");
		int yas = input.nextInt();
		System.out.print("Yolculuk tipinizi giriniz(1-Tek Y�n, 2-Gidi� D�n��): ");
		int yolculukTipi = input.nextInt();
		double mesafeBasinaUcret = 0.10;
		
		
		double toplamTutar = mesafe*mesafeBasinaUcret;
		
		if(mesafe>=0 && yas>=0 && (yolculukTipi==1 || yolculukTipi==2)) {
			if(yas<12) {
				toplamTutar = toplamTutar - (toplamTutar*0.5);
				if(yolculukTipi==2) {
					toplamTutar = (toplamTutar - (toplamTutar*0.2))*2;
				}
			}
			else if(yas>=12 && yas <=24) {
				toplamTutar = toplamTutar - (toplamTutar*0.1);
				if(yolculukTipi==2) {
					toplamTutar = (toplamTutar - (toplamTutar*0.2))*2;
				}
			}
			else if(yas>65) {
				toplamTutar = toplamTutar - (toplamTutar*0.3);
				if(yolculukTipi==2) {
					toplamTutar = (toplamTutar - (toplamTutar*0.2))*2;
				}
			}
			else if(yolculukTipi==2) {
				toplamTutar = (toplamTutar - (toplamTutar*0.2))*2;
			}
			
			System.out.println("Toplam tutar: " + toplamTutar + " " + "TL");
		}
		else
			System.out.println("Hatal� veri girdiniz!");
		
		
		
	}

}
