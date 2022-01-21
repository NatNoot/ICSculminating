package chess;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class QueenLine {
	
	public static void main() throws Exception{
		
		ArrayList<String> lines = new ArrayList<String>();
	
		File file = new File("Qscene1.txt");
		Scanner in = new Scanner(file);
		
		while (in.hasNextLine()) {
			lines.add(in.nextLine());
		}
		in.close();
		
		for (int i = 0; i < lines.size(); i++) {
			Scanner key = new Scanner(System.in);
			String nextKey = key.nextLine();
			System.out.println(lines.get(i));
			//System.out.println("Press Enter to Continue");
		}	
	}
}
