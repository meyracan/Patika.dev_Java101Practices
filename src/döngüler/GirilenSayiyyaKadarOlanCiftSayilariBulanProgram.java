package d�ng�ler;
import java.util.Scanner;
public class GirilenSayiyyaKadarOlanCiftSayilariBulanProgram {
	
	//�dev: Java d�ng�ler ile 0'dan girilen say�ya kadar olan say�lardan 3 ve 4'e tam b�l�nen 
	//say�lar�n ortalamas�n� hesaplayan program� yaz�n�z.
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Say�y� giriniz: ");
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
		System.out.println("Say�lar�n ortalamas�: " + average);
		
		
	}

}
