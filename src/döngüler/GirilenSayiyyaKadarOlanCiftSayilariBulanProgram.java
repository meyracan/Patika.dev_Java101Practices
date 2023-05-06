package döngüler;
import java.util.Scanner;
public class GirilenSayiyyaKadarOlanCiftSayilariBulanProgram {
	
	//Ödev: Java döngüler ile 0'dan girilen sayýya kadar olan sayýlardan 3 ve 4'e tam bölünen 
	//sayýlarýn ortalamasýný hesaplayan programý yazýnýz.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Sayýyý giriniz: ");
		int number = input.nextInt();
		int toplam=0,counter=0;
		for(int i=0;i<=number;i++) {
			if(i%3==0 && i%4==0) {
				System.out.println(i);
				toplam +=i;
				counter++;
			}
		}
		
		double average= toplam/counter;
		System.out.println("Sayýlarýn ortalamasý: " + average);
		
		
	}

}
