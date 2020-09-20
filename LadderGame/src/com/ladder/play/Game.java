package com.ladder.play;

import java.util.ArrayList;
import java.util.Scanner;

import com.ladder.setting.Ladder;

public class Game {
	
	private Scanner sc;
	public static int index;
	
	public Game() {
		
		sc = new Scanner(System.in);
			
	}
	
	public ArrayList<String[]> ladderCopy(ArrayList<String[]> ladder) {
		
		ArrayList<String[]> copyLadder = new ArrayList<>();
		
		for(String []strings : ladder) {
			
			String []tmp = new String[7];
			
			for (int i = 0; i < strings.length; i++) {
				tmp[i] = strings[i];
			}
			
			copyLadder.add(tmp);
			
		}
		
		return copyLadder;
		
	}

	public String play() {
		
		//output.view(ladder.init());
		
		System.out.println("\n=========================================\n");
		System.out.print("사다리 번호 선택 >> ");
		
		String num = sc.next();
		
		for(int i = 0; i < 50; i++) {
			System.out.println();
		}
		
		return num;

	}

	// 사다리 따라가기
	public ArrayList<String[]> move(ArrayList<String[]> ladder, String num) {
		
		index = 0;

		for (int i = 0; i < ladder.get(0).length; i++) {
			
			if (ladder.get(0)[i].equals(num)) {
				index = i;
				break;
			}
			
		}
		
		int row = 1;
		
		while(row < 21) {
			
			String []tmp = ladder.get(row);
				
			if (index > 0 ) {
				
				if (tmp[index - 1].equals("------")) {
					
					tmp[index] = "*";
					tmp[index - 1] = "* * * ";
					tmp[index - 2] = " ";
					
					index -= 2;
					
				} else if (index == 6) {
					
					tmp[index] = "*";
					
				} else if (tmp[index + 1].equals("------")) {
					
					tmp[index] = "*";
					tmp[index + 1] = " * * *";
					tmp[index + 2] = " ";
					
					index += 2;
					
				} else if (tmp[index - 1].equals("      ") &&
								tmp[index - 1].equals("      ")) {

					tmp[index] = "*";
					
				} 
				
			} else if (index < 6 ) {
				
				if (tmp[index + 1].equals("------")) {
					
					//System.out.println("right");
					
					tmp[index] = "*";
					tmp[index + 1] = " * * *";
					tmp[index + 2] = " ";
					
					index += 2;
					
				} else if (index == 0) {
				
					tmp[index] = "*";
				
				} else if (tmp[index - 1].equals("------")) {
					
					//System.out.println("left");
					
					tmp[index] = "*";
					tmp[index - 1] = "* * * ";
					tmp[index - 2] = " ";
					
					index -= 2;
					
				} else if (tmp[index + 1].equals("------")) {
					
					//System.out.println("right");
					
					tmp[index] = "*";
					tmp[index + 1] = " * * *";
					tmp[index + 2] = " ";
					
					index += 2;
					
				} else if (tmp[index + 1].equals("      ") &&
								tmp[index - 1].equals("      ") ) {
					
					tmp[index] = "*";
					
				} 
				
			}
			
			ladder.set(row, tmp);
			row++;
			
		}

		return ladder;
		
	}

}
