package koþulluÝfadelerVeKodBloklarý;
import java.util.Scanner;
public class CinZodyagiHesaplama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Doðum yýlýnýzý girin: ");
		int year = input.nextInt();
		int hesaplama = year%12;
		String burc =null;
		boolean isError=false;
		switch(hesaplama){
			case 0:
				burc="Maymun";
				break;
			case 1:
				burc="Horoz";
				break;
			case 2:
				burc="Köpek";
				break;
			case 3:
				burc="Domuz";
				break;
			case 4:
				burc="Fare";
				break;
			case 5:
				burc="Öküz";
				break;
			case 6:
				burc="Kaplan";
				break;
			case 7:
				burc="Tavþan";
				break;
			case 8:
				burc="Ejderha";
				break;
			case 9:
				burc="Yýlan";
				break;
			case 10:
				burc="At";
				break;
			case 11:
				burc="Koyun";
				break;
			default:
				isError=true;
		}
		
		if(isError) {
			System.out.println("Hatalý yýl girmiþ olabilirsiniz!");
		}
		else
			System.out.println("Burcunuz: " + burc);

	}

}
