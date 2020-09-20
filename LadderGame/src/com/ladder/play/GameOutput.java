package com.ladder.play;

import java.util.ArrayList;

public class GameOutput {
	
	public void view(String message) {
		System.out.println(message);
	}

	public void view(String[] list) {

		System.out.println("\n\n================ 전체 결과 ================\n");
		
		for (int i = 0; i < list.length; i++) {
			System.out.println("\t" + (i+1) + "번\t>>\t" + list[i]);
		}
		
		System.out.println("\n=========================================\n");
		
	}
	
	public void view(ArrayList<String[]> ladder) {
		
		for (int i = 0; i < ladder.size(); i++) {
			
			for (int j = 0; j < ladder.get(i).length; j++) {
				System.out.print(ladder.get(i)[j]);
			}
			
			System.out.println();
			
		}
		
	}
	
}
