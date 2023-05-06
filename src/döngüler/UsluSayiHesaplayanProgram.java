package döngüler;
import java.util.Scanner;
public class UsluSayiHesaplayanProgram {

	//Ödev: Java ile kullanýcýnýn girdiði deðerler ile üslü sayý hesaplayan programý "For Döngüsü" kullanarak yapýnýz:
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Üssü alýnacak sayý: ");
		int number = input.nextInt();
		System.out.print("Üs olan sayý: ");
		int power = input.nextInt();
		int total =1;
		for(int i=1; i<=power; i++) {
			total= total*number;
		}
		System.out.println(total);
		
		
		

	}

}
