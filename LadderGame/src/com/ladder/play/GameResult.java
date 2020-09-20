package com.ladder.play;

import java.util.ArrayList;

public class GameResult {
	
	public String[] result(ArrayList<String[]> ladder) {
		
		Game game = new Game();
		String []result = new String[4];

		int i = 0;
		int []indexNum = {0,2,4,6};
		
		for (int j = 0; j < 4; j++) {

			int index = indexNum[j];
			
			for (int row = 1; row < 21; row++) {
					
				String []tmp = ladder.get(row);
					
				if (index > 0 ) {
					
					if (!tmp[index - 1].equals("      ")) {
						index -= 2;
					} else if (index == 6) {
	
					} else if (!tmp[index + 1].equals("      ")) {
						index += 2;
					} else if (tmp[index - 1].equals("      ") &&
									tmp[index - 1].equals("      ")) {
					} 
					
				} else if (index < 6 ) {
					
					if (!tmp[index + 1].equals("      ")) {
						index += 2;
					} else if (index == 0) {
					
					} else if (!tmp[index - 1].equals("      ")) {
						index -= 2;
					} else if (!tmp[index + 1].equals("      ")) {
						index += 2;
					} else if (tmp[index + 1].equals("      ") &&
									tmp[index - 1].equals("      ") ) {

					} 
					
				} //if문 끝
				
			} // 행 for문 끝 
			
			if (ladder.get(21)[index].equals("♥")) {
				result[i] = "당첨";
			} else {
				result[i] = "탈락";
			}
			
			i++;
			
		} // 열 for문 끝
		
		return result;
		
	}
	
	public String result(ArrayList<String[]> ladder, int index) {

		String result = "탈락";
		
		if (ladder.get(21)[index].equals("♥")) {
			result = "당첨";
		}
		
		return result;
		
	}

}
