package d�ng�ler;

import java.util.Scanner;
public class MukemmelSayiBulanProgram {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("Bir say� giriniz: ");
		int number = input.nextInt();
		int toplam=0;
		for(int i=1;i<number;i++) {
			if(number%i==0) {
				toplam+=i;
			}
		}
		if(toplam==number) {
			System.out.println(number + " m�kemmel say�d�r.");
		}
		else
			System.out.println(number + " m�kemmel say� de�ildir.");
		}
		

	}

}
