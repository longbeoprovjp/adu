import java.util.Scanner;
public class ap {

	public static void main(String[] args) {
		final int MAX_SIZE = 10;
		Scanner socan = new Scanner(System.in);
		System.out.println("How many students are there(please input up to 10)?");
		int count = socan.nextInt();
		while (count>MAX_SIZE||count<0) {
			System.out.println("Please input the right value.");
			System.out.println("How many students are there(please input up to 10)?");
			count = socan.nextInt();
		}
		int i = 0;
		String[] stNames = new String[count];
		int[] stID = new int[count];
		float[] stGPA = new float[count];
		float total = 0;
		float min = stGPA[0];
		float max = stGPA[0];
		for (i = 0; i< stNames.length; i++) {
			System.out.println("Enter the " + (i+1) + " student");
			stNames[i] = socan.next();
		}
		for (i = 0; i< stID.length; i++) {
			System.out.println("Enter the " + (i+1) + " student ID");
			stID[i] = socan.nextInt();
		}
		for (i = 0; i< stGPA.length; i++) {
			System.out.println("Enter the " + (i+1) + " student GPA");
			stGPA[i] = socan.nextFloat();
		}
		for (i = 0; i< stGPA.length; i++) {
			total += stGPA[i]; 
		}
		for (i = 0; i< stGPA.length ; i++) {
			if (stGPA[i]> max) {
				max = stGPA[i];
			}
			else if (stGPA[i]< min) {
				min = stGPA[i];
			}
//		}
//		for (i = 0; i< stGPA.length; i++) {
			
		}
		System.out.println("Average GPA is: " + total/count);
		System.out.println("Minimum GPA is: " + min);
		System.out.println("Maximum GPA is: " + max);
		System.out.println("Do you want to search for any student information?");
		System.out.println("Enter the student ID");
		int inputID = socan.nextInt();
		for (i = 0; i< stGPA.length; i++) {
			if (inputID == stID[i]) {
				System.out.println("The student you are looking for is " + stNames[i] + ", his/her GPA is " + stGPA[i]);
			}
			if (inputID != stID[i]) {
				System.out.println("Student doesn't exist");
				break;
			}
		}
			
	}

}
