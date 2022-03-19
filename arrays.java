import java.util.Scanner;
import java.util.Random;
public class arrays {

	public static void main(String[] args) {
		final int MAX_SIZE = 10;
		Scanner socan = new Scanner(System.in);
		Random rand = new Random();
		int[] numbers = new int[MAX_SIZE];
//		int[] stID = new int[MAX_SIZE];
//		String[] stLastName = new String[MAX_SIZE];
//		int[] num = {10,11,12};
//		String[] lastNames = {"Long", "beo"};
//		System.out.println(num[1]);
//		int[] n = new int[MAX_SIZE];
//		System.out.println(num.length);
//		numbers[5] = 19;
//		System.out.println(numbers[5]);
//		
//		for (int i = 0; i < stID.length; i++) {
//			stID[i] = i+1;
//		}
//		
//		for (int i = 0; i < stID.length; i++) {
//			System.out.println(stID[i]);
//		}
//		System.out.println("-------------------");
		
//
		for (int i = 0; i<numbers.length; i++) {
			numbers[i] = rand.nextInt(100)+1;
		}
		for (int i = 0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		int sum = 0;
		for (int i = 0; i<numbers.length; i++) {
			sum = numbers[i] + sum;
		}
		System.out.println("sum = " + sum);
		
//
//		int min = numbers[0];
//		for (int i = 0; i< numbers.length; i++) {
//			if (numbers[i]<min) {
//				min = numbers[i];
//			}
//		}
//		System.out.println(min);
		
		int i = 0;
		int minIndex = 0;
		int min = numbers[0];
		for (i = 0; i< numbers.length; i++) {
			if (numbers[i]<min) {
				min = numbers[i];
				minIndex = i;
			}
		}
		System.out.println(min);
		System.out.println(minIndex);
	}

}
