package java_course_01_01;

import java.util.Scanner;

public class Welcome {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String score = s.nextLine();
		while (!score.equals("exit")) {
			int i = Integer.parseInt(score);
			for (int j = 1; j <= i; j++) {
				for (int k = 1; k <= i; k++) {
					System.out.print(j * k + "\t");
				}
				System.out.println();
			}
			score = s.nextLine();
		}
		
		
		System.out.println("BYE BYE!!!");

	}
}
