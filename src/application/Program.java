package application;

import java.util.Locale;
import java.util.Scanner;


import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int rnumbers  = 10;
		
		Rent[] vect = new Rent[rnumbers+1];
		
		System.out.println("Happiness Hotel");
		
		System.out.println("How many peoples will be hosted?");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Host #" +i + " :");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("E-mail :");
			String email = sc.next();
			System.out.println("Room: ");
			int room = sc.nextInt();
			
			vect[room] = new Rent(name, email);
			
		}
		
		System.out.println("Busy rooms");
		
		for (int i=0; i <11; i++) {
			if (vect[i] != null) {
			System.out.println(i + ": " + vect[i]);
			
		}
		}
		
		

		
		
		
		
		
		
		
		sc.close();

	}

}
