package com.skillditillery.makechange;

import java.util.Scanner;
import java.text.DecimalFormat;

public class MakeChange {

	public static void main(String[] args) {
		// String choice ="";

		Scanner kb = new Scanner(System.in);

		while (true) {

			System.out.println("*************** \tCASH REGISTER\t ****************");

			System.out.print("Enter the price of the item: ");
			double itemPrice = kb.nextDouble();
			System.out.print("Enter the amount tendered: ");
			double tenderedAmount = kb.nextDouble();
			System.out.println(totalChange(itemPrice, tenderedAmount));
			System.out.print("Another transactions? (Y/N)");
			String choice = kb.next();

			if (choice.equalsIgnoreCase("N")) {
				System.out.print("Thank you for shopping with us!");

				break;
			} 

			DecimalFormat df = new DecimalFormat("0.00");

		}

		kb.close();
	}

	public static String totalChange(double totalPrice, double totalPayment) {
		DecimalFormat df = new DecimalFormat("0.00");

		String billsNeeded = "";

		double change = (totalPayment * 100 - totalPrice * 100);
		if (change == 0) {
			System.out.println("Thank you for shopping with us!");
		} else if (change < 0) {
			System.out.println("Sorry! You are $" + df.format(totalPrice - totalPayment) + " short.");

		}
		while (change > 0) {
			if (change >= 2000) {
				billsNeeded += ("\n$20 : " + ((int) change / 2000));
				change %= 2000;

			} else if (change >= 1000) {
				billsNeeded += ("\n$10 : " + ((int) change / 1000));
				change %= 1000;

			}

			else if (change >= 500) {
				billsNeeded += ("\n$5 : " + ((int) change / 500));
				change %= 500;

			}

			else if (change >= 100) {
				billsNeeded += ("\n$1 : " + ((int) change / 100));
				change %= 100;

			}

			else if (change >= 25) {
				billsNeeded += ("\n$0.25 : " + ((int) change / 25));
				change %= 25;

			}

			else if (change >= 10) {
				billsNeeded += ("\n$0.10 : " + ((int) change / 10));
				change %= 10;

			}

			else if (change >= 5) {
				billsNeeded += ("\n$0.05 : " + ((int) change / 5));
				change %= 5;

			} else if (change >= 1) {
				billsNeeded += ("\n$0.01 : " + ((int) change / 1));
				change %= 1;

			}

		}
		return billsNeeded;

	}
}
