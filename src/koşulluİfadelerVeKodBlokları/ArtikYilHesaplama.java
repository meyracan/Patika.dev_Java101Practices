package ko�ullu�fadelerVeKodBloklar�;
import java.util.Scanner;
public class ArtikYilHesaplama {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Y�l� girin: ");
		int year = input.nextInt();
		boolean isLeapYear = false;
		
		if(year%4==0 || year%400==0) {
			isLeapYear=true;
		}
		
		if(isLeapYear) {
			System.out.println(year + " bir art�k y�ld�r!");
		}
		else
			System.out.println(year + " bir art�k y�l de�ildir!");
	}

}
