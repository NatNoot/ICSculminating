package chess;

import java.io.File;
import java.util.Scanner;

public class QueenLine {
	
	public static void main() throws Exception{
		String temp = "";
	
		File file = new File("scene2.txt");
		Scanner in = new Scanner(file);
		
		while (in.hasNextLine()) {
			String line = in.nextLine();
			System.out.println(line);
		}
	
	}
}
