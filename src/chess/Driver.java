package chess;


public class Driver {

	public static void main(String[] args) throws Exception {
		
		//TESTING
		String ans = GeneralScene.openingScene(args);
		
		if (ans.equals("n")) {
			QueenLine.main();
		}
		else {
			GeneralScene.sceneOneB();
			GeneralScene.sceneTwoB();
			GeneralScene.sceneThreeB();
			GeneralScene.sceneFourB();
			GeneralScene.sceneFiveB();
		} 
		}
	}

