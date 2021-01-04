package commit_and_push;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("Hey there!");
		try(Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Enter a number");
			int num = sc.nextInt();
			System.out.println("Squere is "+ num * num);
		} catch (Exception e) {
			System.out.println("Failed! "+e);
		}
	}

}
