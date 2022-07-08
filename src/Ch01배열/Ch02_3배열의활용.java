package Ch01배열;

public class Ch02_3배열의활용 {

	public static void main(String[] args) {
		int sum = 0; //총합을 정하기 위한 변수
		float average = 0f; // 평균을 저장하기 위한 변수
		
		int[] score = {100, 88, 100,100 ,90};
		
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		average = sum / (float)score.length; // 계ㅏ산결과를 float 타입으로 얻으려 형변환
		
		System.out.println("총합: " + sum);
		System.out.println("평균: "  + average);
	}

}
