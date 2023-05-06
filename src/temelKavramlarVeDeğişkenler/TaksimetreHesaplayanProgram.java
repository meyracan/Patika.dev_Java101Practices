package temelKavramlarVeDeðiþkenler;
import java.util.Scanner;
public class TaksimetreHesaplayanProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Km cinsinden mesafeyi giriniz: ");
		double distance = input.nextDouble();
		double perDistance = 2.20;
		double price = (10 + distance*perDistance);
		
		price = (price < 20) ? 20 : price;
		
		System.out.println(price);

	}

}
