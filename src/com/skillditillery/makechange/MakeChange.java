package com.skillditillery.makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		System.out.println("*************** \tCASH REGISTER\t ****************");
		System.out.print("Enter the price of the item: ");
		double price = kb.nextDouble();
		askItemPrice(price);

		kb.close();
	}

	public static double askItemPrice(double price) {
		return price;
	}

}
