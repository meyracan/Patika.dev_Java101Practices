package d�ng�ler;

import java.util.Scanner;

public class EBOBEKOKBulanProgram {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("�lk say�y� girin:");
		int number1 = input.nextInt();
		System.out.println("�kinci say�y� girin:");
		int number2 = input.nextInt();
		int ebob =0;
		int i=1;
		if(number1>number2) {
			while(i<=number2) {
				if(number1%i==0 && number2%i==0) {
					ebob=i;
				}
				i++;
			}
		}
		else {
			while(i<=number1) {
				if(number1%i==0 && number2%i==0) {
					ebob=i;
				}
				i++;
			}
		}
		System.out.println("�ki say�n�n ebobu: " + ebob);
		
		i=number1;
		while(!(i%number1==0 && i%number2==0)) {
			i+=number1;
		}
		System.out.println("�ki say�n�n ekoku: " + i);
		
		
		
		
		
		
		
		
		
		

	}

}
