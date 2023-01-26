package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();

		boolean a = x > y;
		boolean b = y > z;
		boolean c = x < y;
		boolean d = y < z;
		boolean isOrdered1 = a && b;
		boolean isOrdered2 = c && d;
		boolean isOrdered3 = isOrdered1 || isOrdered2;
		System.out.println(isOrdered3);
	}

}
