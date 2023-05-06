package döngüler;
import java.util.Scanner;
public class GirilenSayidanKucukIkininKuvvetleriniBulanProgram {

	//Ödev: Java döngüler ile girilen sayýya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdýran programý yazýyoruz.
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number, i;
		System.out.print("Sayýyý giriniz: ");
		number=input.nextInt();
		System.out.println("4'ün Kuvvetleri:");
		for(i=1;i<number ;i=i*4) {
			System.out.println(i);
		}
		System.out.println("5'in Kuvvetleri:");
		for(i=1;i<number ;i=i*5) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
