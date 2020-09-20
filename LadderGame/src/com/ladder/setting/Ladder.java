package com.ladder.setting;

import java.util.ArrayList;

public class Ladder {
	
	private ArrayList<String[]> ladder = null;
	
	public ArrayList<String[]> init() {
		
		String []tmp = {"1","      ","2","      ","3","      ","4"};
		
		ladder = new ArrayList<>();
		ladder.add(tmp);
		
		for (int i = 0; i < 20; i++) {

			tmp = new String[7];
			
			for (int j = 0; j < 7; j++) {	

				if(j%2 == 0) {
					tmp[j] = "|";
				} else {
					tmp[j] = "      ";
				}
			
			}

			ladder.add(tmp);
					
		}
		
		return ladder;
		
	}

	public ArrayList<String[]> setLadder(ArrayList<String[]> ladder) {
		
		String []tmp = null;
		//ArrayList<String[]> ladder = ladderData;
		
		int []setCol = {1,1,3,3,5,5,0};
		int []setRow = new int[7];
		
		for (int i = 0; i < setRow.length; i++) {
			
			setRow[i] = (int)(Math.random() * 17 + 2);
			
			for (int j = 0; j < i; j++) {
				
				if (setRow[i] == setRow[j]) {
					i--;
					break;
				}
				
			}
		
		}
		
		setCol[6] = setCol[(int)(Math.random() * 5)];
		
		for (int i = 0; i < setRow.length; i++) {
			
			tmp = ladder.get(setRow[i]);
			tmp[setCol[i]] = "------";

			ladder.set(setRow[i], tmp);
			
		}
		
		tmp = new String[7];
		
		while(true) {
			
			int success = (int)(Math.random() * 16);
			
			success /= 2;
			
			if (success % 2 == 0) {
				tmp[success] = "♥";
				break;
			}
			
		}
		
		for (int i = 0; i < tmp.length; i++) {
			
			if (tmp[i] == null) {
				
				if (i % 2 == 0) {
					tmp[i] = "x";
				} else {
					tmp[i] = "      ";
				}
			
			}
			
		}
		
		ladder.add(tmp);
		
		return ladder;
		
	}
	
}
