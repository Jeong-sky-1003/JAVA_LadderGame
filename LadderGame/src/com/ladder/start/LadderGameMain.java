package com.ladder.start;

import com.ladder.play.GameController;

public class LadderGameMain {

	public static void main(String[] args) {
		
		/*Ladder ladder = new Ladder();
		
		ladder.init();
		
		/*for(int i = 0; i < 50; i++) {
			System.out.println();
		}
		*/
		
		//ladder.setLadder();
		
		GameController controller = new GameController();
		controller.start();

	}

}
