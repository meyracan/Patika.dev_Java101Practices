package ko�ullu�fadelerVeKodBloklar�;
import java.util.Scanner;
public class Say�lar�BuyuktenKucugeS�ralama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Say� 1 i giriniz: ");
		int number1 = input.nextInt();
		System.out.print("Say� 2 yi giriniz: ");
		int number2 = input.nextInt();
		System.out.print("Say� 3 � giriniz: ");
		int number3 = input.nextInt();
		
		if(number1>number2 && number1>number3) {
			if(number2>number3) {
				System.out.println("number1 > number2 > number3");
			}
			else
				System.out.println("number1 > number3 > number2");
		}
		else if(number2>number1 &&number2>number3) {
			if(number1>number3) {
				System.out.println("number2 > number1 > number3");
			}
			else
				System.out.println("number2 > number3 > number1");
		}
		else {
			if(number1>number2) {
				System.out.println("number3 > number1 > number2");
			}
			else
				System.out.println("number3 > number2 > number1");
			
		}

			
			
			
			
			
			
	}

}
