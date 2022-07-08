package Ch01배열;

public class Ch03_3이차원배열 {

	public static void main(String[] args) {
		int[][]	score = {
				{100,200,300},
				{20, 30, 40},
				{30, 40, 50},
				{40, 50, 60},
				{50, 60, 70}
		};
		
		int korTotal = 0, engTotal = 0, mathTotal = 0;
		
		System.out.println("번호  국어  영어  수학  총점  평균");
		System.out.println("=============================");
		
		for(int i = 0; i < score.length; i++) {
			int sum = 0; 		//개인별 총점
			float avg = 0.0f;	//개인변 평균
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			System.out.printf("%3d",i+1);
			
			for(int j=0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%5d", score[i][j]);
			}
			avg = sum/(float)score[i].length;// 평균계산
			System.out.printf("%5d %5.1f%n",sum,avg);
		}
		System.out.println("=============================");
		System.out.printf("총점: %3d %4d %d%n",korTotal,engTotal,mathTotal);
	}

}
