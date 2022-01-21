package chess;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class GeneralScene {
	
	public static String openingScene(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Knight: Do you have an audience with the King?");
		System.out.println("y/n");
		
		String ans = in.nextLine();
		
		//in.close();
		
		if (ans.equals("y")) {
			System.out.println("Knight: Alright, come with me.");
		} else if (ans.equals("n")) {
			System.out.println("Knight: Then get lost.");
		} else {
			System.out.println("Please answer with y or n.");
			openingScene(args);
	}
		return ans;
	}
	
	public static String threeOpt() {
		Scanner in = new Scanner(System.in);
		String choice = "";
		choice = in.nextLine();
		in.close();

		return choice;
	}
	
	public static void read(String fileName) throws Exception{
		
		ArrayList<String> lines = new ArrayList<String>();
	
		File file = new File(fileName);
		Scanner in = new Scanner(file);
		
		while (in.hasNextLine()) {
			lines.add(in.nextLine());
		}
		in.close();
		
		for (int i = 0; i < lines.size(); i++) {
			Scanner key = new Scanner(System.in);
			String nextKey = key.nextLine();
			String temp = lines.get(i);
			
			if (temp.equals("[all]")) {
				System.out.println(lines.get(i+1));
				System.out.println(lines.get(i+2));
				System.out.println(lines.get(i+3));
				i = i + 4;
			} else if (temp.equals("///")) {
				threeOpt();
			}
			
			if (!temp.equals("///") && !temp.equals("[all]")){
				System.out.println(lines.get(i));
			}
			//System.out.println("Press Enter to Continue");
		}	
	}
}
