import java.util.Scanner;

public class LinearSearch {

	public static void main(String args[]) {
		int arr[] = { 20, 32, 90, 1, 13, 7, 88, 60 };
		boolean flag = false;
		Scanner scan = new Scanner(System.in);
		int num_to_find = scan.nextInt();

		for (int num : arr) {
			if (num == num_to_find) {
				flag = true;
				break;
			}
		}

		if (flag) {
			System.out.println("Number: " + num_to_find + "is present in List!");
		} else {
			System.out.println("Number: " + num_to_find + "is NOT present in List :(");
		}
		scan.close();
	}
}