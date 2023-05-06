package döngüler;
import java.util.Scanner;
public class TekSayilarinToplamýnýBulanProgram {

	//Ödev: Java döngüler ile tek bir sayý girilene kadar kullanýcýdan giriþleri kabul eden ve 
	//girilen deðerlerden çift ve 4'ün katlarý olan sayýlarý toplayýp ekrana basan programý yazýyoruz:
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number, sum=0;
		do {
			System.out.print("Sayýyý giriniz: ");
			number = input.nextInt();
			if(number%2==0 || number%4==0)
				sum+=number;
			
		}while(number%2==0);
		
		System.out.println("Toplam: " + sum);
		

	}

}
