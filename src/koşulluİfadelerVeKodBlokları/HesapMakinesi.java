package ko�ullu�fadelerVeKodBloklar�;
import java.util.Scanner;
public class HesapMakinesi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("��leme girecek ilk say�y� giriniz: ");
		double number1 = input.nextDouble();
		System.out.print("��leme girecek ikinci say�y� giriniz: ");
		double number2 = input.nextDouble();
		
		System.out.println("1: Toplama , 2: ��karma , 3: �arpma , 4: B�lme");
		System.out.println("Yap�lacak i�lemin numaras�n� se�iniz: ");
		int islem = input.nextInt();
		
		switch(islem){
		case 1:
			System.out.println("Toplama i�lemi: " + (number1 + number2));
			break;
		case 2:
			System.out.println("��karma i�lemi: " + (number1 - number2));
			break;
		case 3:
			System.out.println("�arpma i�lemi: " + (number1 * number2));
			break;
		case 4:
			/*if(number2==0)
				System.out.println("Bir say� 0'a b�l�nemez!");
			else
				System.out.println("B�lme i�lemi: " + (number1 / number2));
				//Ya da: */
			String str = number2==0 ? "Bir say� 0'a b�l�nemez!" : "B�lme i�lemi: " + (number1 / number2);
			System.out.println(str);
			break;
		default:
			System.out.println("Hatal� bir say� girdiniz! L�tfen 1-4 aras�nda bir numara girin!");
			
		}

	}

}
