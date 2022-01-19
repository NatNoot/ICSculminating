package chess;

import java.util.Scanner;

public class GeneralScene {
	
	
	public static void openingScene(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Knight: Do you have an audience with the King?");
		System.out.println("y/n");
		
		String ans = in.nextLine();
		
		if (ans.equals("y")) {
			System.out.println("Knight: Alright, come with me.");
		} else if (ans.equals("n")) {
			System.out.println("Knight: Then get lost.");
		} else {
			System.out.println("Please answer with y or n.");
			
	}
}
}