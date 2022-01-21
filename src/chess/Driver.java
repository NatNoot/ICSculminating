package chess;


public class Driver {

	public static void main(String[] args) throws Exception {
		
		String ans = GeneralScene.openingScene(args);
		
		if (ans.equals("n")) {
			GeneralScene.read("Qscene1.txt");
			GeneralScene.read("Qscene2.txt");
			GeneralScene.read("Qscene3.txt");
			GeneralScene.read("Qscene4.txt");
			GeneralScene.read("Qscene5.txt");
		}
		else if (ans.equals("y")) {  
			GeneralScene.read("Kscene1.txt");
			GeneralScene.threeOpt();
			
			GeneralScene.read("Kscene2.txt");
			
			GeneralScene.read("Kscene3.txt");
			
			GeneralScene.read("Kscene4.txt");
			
			GeneralScene.read("Kscene5.txt");
			
		}  
	}
}

