package döngüler;
import java.util.Scanner;
public class ArmstrongSayilariBulanProgram {

	//Ödev: Bir sayının basamak sayılarının toplamını hesaplayan program yazınız:
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Sayıyı giriniz: ");
		int number = input.nextInt();
		int sum=0; int temp=0;
		
		while(number>0) {
			temp= number%10;
			number = number/10;
			sum +=temp;
			
		}
		
		System.out.println(sum);
		


	}

}
