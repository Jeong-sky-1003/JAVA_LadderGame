package com.ladder.play;

import java.util.ArrayList;
import java.util.Scanner;

import com.ladder.setting.Ladder;

public class GameController {

	private Scanner sc;
	
	private Game game;
	private Ladder ladder;
	private GameOutput output;
	private GameResult result;
	
	private ArrayList<String[]> gameLadder;
	private ArrayList<String[]> moveLadder;
	
	public GameController() {
		
		sc = new Scanner(System.in);
		
		output = new GameOutput();
		result = new GameResult();
		
	}
	
	public void Constructor() {
		
		game = new Game();
		ladder = new Ladder();
		moveLadder = new ArrayList<>();
		gameLadder = new ArrayList<>();
		
	}
	
	public void start() {
		
		boolean chk = true;

		while(chk) {
			
			System.out.println("\n=========================================\n");
			System.out.print("1.게임 시작 | 2.종료\n메뉴 >> ");
			int menu = sc.nextInt();
			System.out.println("\n=========================================\n");
			
			switch(menu) {
			
				case 1:
					
					this.Constructor();
					
					ArrayList<String[]> initLadder = new ArrayList<>();
					initLadder = ladder.init();

					output.view(initLadder);
					gameLadder = game.ladderCopy(ladder.setLadder(initLadder));	
					
					String num = game.play();
					
					ArrayList<String[]> tmp = new ArrayList<>();
					tmp = game.ladderCopy(gameLadder);
					
					moveLadder.addAll(game.move(tmp, num));
					output.view(moveLadder);
					
					String message = result.result(moveLadder, game.index);
					output.view(message);
					
					String[] list = result.result(moveLadder);
					output.view(list);
					
					while(true) {
						
						System.out.print("1. 다른 결과보기 | 2.이전 메뉴\n메뉴 >> ");
						menu = sc.nextInt();
						System.out.println("\n=========================================\n");
						
						if (menu == 1) {
							
							num = game.play();
							
							tmp.clear();
							moveLadder.clear();
							tmp = game.ladderCopy(gameLadder);
							
							moveLadder.addAll(game.move(tmp, num));
							output.view(moveLadder);
							
						} else {
							break;
						}
						
						System.out.println("\n=========================================\n");
						
					}
					
					break;
					
				default:
					chk = false;
					break;
					
			}
			
		}
		
	}
	
}
