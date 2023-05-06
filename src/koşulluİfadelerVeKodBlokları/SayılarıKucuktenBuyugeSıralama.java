package koþulluÝfadelerVeKodBloklarý;

import java.util.Scanner;

public class SayýlarýKucuktenBuyugeSýralama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Sayý 1 i giriniz: ");
		int number1 = input.nextInt();
		System.out.print("Sayý 2 yi giriniz: ");
		int number2 = input.nextInt();
		System.out.print("Sayý 3 ü giriniz: ");
		int number3 = input.nextInt();
		
		if(number1<number2 && number1<number3) {
			if(number2<number3) {
				System.out.println("number1 < number2 < number3");
			}
			else
				System.out.println("number1 < number3 < number2");
		}
		else if(number2<number1 && number2<number3) {
			if(number1<number3) {
				System.out.println("number2 < number1 < number3");
			}
			else
				System.out.println("number2 < number3 < number1");
		}
		else {
			if(number1<number2) {
				System.out.println("number3 < number1 < number2");
			}
			else
				System.out.println("number3 < number2 < number1");
			
		}


	}

}
