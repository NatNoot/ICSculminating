package chess;


public class Driver {

	public static void main(String[] args) {
		
		//TESTING
		String ans = GeneralScene.openingScene(args);
		
		if (ans.equals("n")) {
			GeneralScene.sceneOneA();
			GeneralScene.sceneTwoA();
			GeneralScene.sceneThreeA();
			GeneralScene.sceneFourA();
			GeneralScene.sceneFiveA();
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

