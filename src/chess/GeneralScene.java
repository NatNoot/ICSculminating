package chess;

import java.util.Scanner;

public class GeneralScene {
	
	
	public static String openingScene(String[] args) {
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
		return ans;
	}
	public static void sceneOneA() {
		System.out.println("System: succesfully entered queen pathway");
	}
	public static void sceneTwoA() {
		System.out.println("System: succesfully entered queen scene two");
	}
	public static void sceneThreeA() {
		System.out.println("System: succesfully entered queen scene three");
	}
	public static void sceneFourA() {
		System.out.println("System: succesfully entered queen scene four");
	}
	public static void sceneFiveA() {
		System.out.println("System: succesfully entered queen scene five");
	}
		
	public static void sceneOneB() {
		System.out.println("System: succesfully entered king pathway");
	}
	public static void sceneTwoB() {
		System.out.println("System: succesfully entered king scene two");
	}
	public static void sceneThreeB() {
		System.out.println("System: succesfully entered king scene three");
	}
	public static void sceneFourB() {
		System.out.println("System: succesfully entered king scene four");
	}
	public static void sceneFiveB() {
		System.out.println("System: succesfully entered king scene five");
	}
}
