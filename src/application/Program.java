package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("enter the quantity: ");
			int n = sc.nextInt();
			Product[] vect = new Product[n];

			for (int i = 0; i < vect.length; i++) {
				System.out.println("insert the " + (i + 1) + "st data:");
				System.out.print("enter name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Price: ");
				double price = sc.nextDouble();
				vect[i] = new Product(name, price);
			}
			double sum = 0;
			for (int i = 0; i < vect.length; i++) {
				sum += vect[i].getPrice();
			}
			double avg = sum / n;
			System.out.printf("AVERAGE PRINCE: %.2f", avg);
		}
	}

}
