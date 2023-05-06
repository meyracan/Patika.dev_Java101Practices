package koþulluÝfadelerVeKodBloklarý;
import java.util.Scanner;
public class HesapMakinesi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Ýþleme girecek ilk sayýyý giriniz: ");
		double number1 = input.nextDouble();
		System.out.print("Ýþleme girecek ikinci sayýyý giriniz: ");
		double number2 = input.nextDouble();
		
		System.out.println("1: Toplama , 2: Çýkarma , 3: Çarpma , 4: Bölme");
		System.out.println("Yapýlacak iþlemin numarasýný seçiniz: ");
		int islem = input.nextInt();
		
		switch(islem){
		case 1:
			System.out.println("Toplama iþlemi: " + (number1 + number2));
			break;
		case 2:
			System.out.println("Çýkarma iþlemi: " + (number1 - number2));
			break;
		case 3:
			System.out.println("Çarpma iþlemi: " + (number1 * number2));
			break;
		case 4:
			/*if(number2==0)
				System.out.println("Bir sayý 0'a bölünemez!");
			else
				System.out.println("Bölme iþlemi: " + (number1 / number2));
				//Ya da: */
			String str = number2==0 ? "Bir sayý 0'a bölünemez!" : "Bölme iþlemi: " + (number1 / number2);
			System.out.println(str);
			break;
		default:
			System.out.println("Hatalý bir sayý girdiniz! Lütfen 1-4 arasýnda bir numara girin!");
			
		}

	}

}
