

import java.util.Scanner;



public class AssigQ17
 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int bin1, bin2;
		int i = 0, carry = 0;
		int arr[] = new int[10];

		System.out.println("Input first binary number");
		bin1 = sc.nextInt();
		System.out.println("Input second binary number");
		bin2 = sc.nextInt();

		while (bin1 != 0 || bin2 != 0) {
			arr[i] = ((bin1 % 10 + bin2 % 10 + carry) % 2);
			i++;
			carry = ((bin1 % 10 + bin2 % 10 + carry) / 2);
			bin1 = bin1 / 10;
			bin2 = bin2 / 10;

		}

		if (carry != 0) {
			arr[i] = carry;
			i++;
		}

		System.out.println("sum of two binary numbers :");
		i--;
		while (i >= 0) {
			System.out.print(arr[i]);
			i--;
		}

	}

}
