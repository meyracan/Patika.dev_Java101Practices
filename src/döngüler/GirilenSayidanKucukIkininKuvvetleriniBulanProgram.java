package d�ng�ler;
import java.util.Scanner;
public class GirilenSayidanKucukIkininKuvvetleriniBulanProgram {

	//�dev: Java d�ng�ler ile girilen say�ya kadar olan 4 ve 5'in kuvvetlerini ekrana yazd�ran program� yaz�yoruz.
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number, i;
		System.out.print("Say�y� giriniz: ");
		number=input.nextInt();
		System.out.println("4'�n Kuvvetleri:");
		for(i=1;i<number ;i=i*4) {
			System.out.println(i);
		}
		System.out.println("5'in Kuvvetleri:");
		for(i=1;i<number ;i=i*5) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
