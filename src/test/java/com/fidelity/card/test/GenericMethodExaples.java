package com.fidelity.card.test;

public class GenericMethodExaples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] num = { 1, 2, 3, 4, 5 };

		Character[] c = { 'a', 'b', 'c', 'd', 'e' };

		printMe(num);
		printMe(c);

	}

	public static void printMe(Integer[] i) {

		for (Integer x : i) {

			System.out.println(x);
		}
	}

	public static void printMe(Character[] c) {

		for (Character x : c)
			System.out.println(x);

	}

}
