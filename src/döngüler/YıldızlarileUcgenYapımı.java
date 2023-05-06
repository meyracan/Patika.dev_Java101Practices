package döngüler;
import java.util.Scanner;
public class YýldýzlarileUcgenYapýmý {

	//Ödev: Java'da döngüler kullanarak yýldýzlar ile elmas yapýnýz:
	
	public static void main(String[] args) {
		System.out.print("Sayýyý giriniz: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int i=1; int k=1; int j=1;
		while(i<=n) {
			k=1; j=1;
			while(k<=n-i) {
				System.out.print(" ");
				k++;
			}
			while(j<=2*i-1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			
			i++;
		}
		int starCount=0;
		for(i=1;i<=n-1;i++) {
			
			for(k=1; k<=i;k++) {
				System.out.print(" ");
			}
			for(j=2*n-3;j>starCount; j--) {
				System.out.print("*");
			}
			starCount+=2;
			System.out.println();

		}

	}

}
