package d�ng�ler;
import java.util.Scanner;
public class ArmstrongSayilariBulanProgram {

	//�dev: Bir say�n�n basamak say�lar�n�n toplam�n� hesaplayan program yaz�n�z:
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Say�y� giriniz: ");
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
