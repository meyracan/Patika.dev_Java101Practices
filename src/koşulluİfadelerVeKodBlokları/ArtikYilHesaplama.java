package koþulluÝfadelerVeKodBloklarý;
import java.util.Scanner;
public class ArtikYilHesaplama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Yýlý girin: ");
		int year = input.nextInt();
		boolean isLeapYear = false;
		
		if(year%4==0 || year%400==0) {
			isLeapYear=true;
		}
		
		if(isLeapYear) {
			System.out.println(year + " bir artýk yýldýr!");
		}
		else
			System.out.println(year + " bir artýk yýl deðildir!");
	}

}
