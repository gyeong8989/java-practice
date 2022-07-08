package Ch01배열;

import java.util.Arrays;

public class Ch03_2차원배열초기화 {

	public static void main(String[] args) {
		int[][] score = {
							{100, 200, 300},
							{10, 20, 30},
							{10, 20, 30},
							{40, 50, 60}
						};
			int sum = 0;
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				
				System.out.printf("score[%d][%d]=%d%n", i,j, score[i][j]);
				
				sum += score[i][j];
			}
			System.out.println();
			
		}
		System.out.println("sum = " + sum);

	}

}
