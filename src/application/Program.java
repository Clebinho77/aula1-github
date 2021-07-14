package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("name: ");
		String name = sc.nextLine();
		System.out.print("Price: $");
		double price = sc.nextDouble();
		
		Product product = new Product(name, price);
		
		product.setName("Computer");
		System.out.println("update name: " + product.getName());
		
		System.out.println();
		System.out.println("Product date: " + product);

		System.out.println();
		System.out.print("Enter the number of product to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("updated date: " + product);

		System.out.println();
		System.out.print("Enter the number of product to be removed fron stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("updated date: " + product);

		sc.close();
	}

}
