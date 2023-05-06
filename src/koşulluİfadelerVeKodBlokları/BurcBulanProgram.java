package koşulluİfadelerVeKodBlokları;
import java.util.Scanner;
public class BurcBulanProgram {

	public static void main(String[] args) {
		String burc = null; boolean isErrorMonth = false; boolean isErrorDay=false;
		Scanner input = new Scanner(System.in);
		System.out.print("Doğduğunuz ayı giriniz: ");
		int month = input.nextInt();
		System.out.print("Doğduğunuz günü giriniz: ");
		int day = input.nextInt();
		
		/* Switch-Case ile:
		switch(month) {
		case 1:
			if(day>=1 && day<=21)
				burc = "Oğlak";
			else if(day>21 && day<=31)
				burc = "Kova";
			else 
				isErrorDay=true;
			break;
		case 2: 
			if(day>=1 && day<=19)
				burc = "Kova";
			else if(day>=20 && day<=28)
				burc = "Balık";
			else
				isErrorDay = true;
		case 3: //......
		default:
			isErrorMonth= true;
			
	
		
		}
		
		if(isErrorMonth)
			System.out.println("Hatalı giriş!.");
		else if(isErrorDay)
			System.out.println("Hatalı gün girdiniz!.");
		else
			System.out.println("Burcunuz: " + burc);
		
		*/
		
		//Switch-case kullanmadan:
		
		if(month==1) {
			if(day>=1 && day<=21)
				burc = "Oğlak";
			else if(day>21 && day<=31)
				burc = "Kova";
			else 
				isErrorDay=true;
		}
		else if(month==2) {
			if(day>=1 && day<=19)
				burc = "Kova";
			else if(day>=20 && day<=28)
				burc = "Balık";
			else
				isErrorDay = true;
			
		} //......
		else
			isErrorMonth=true;
		
		
		if(isErrorMonth)
			System.out.println("Hatalı giriş!.");
		else if(isErrorDay)
			System.out.println("Hatalı gün girdiniz!.");
		else
			System.out.println("Burcunuz: " + burc);
	}

}
