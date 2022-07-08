package Ch01배열;

public class Ch01배열길이 {

	public static void main(String[] args) {
		int [] score = new int[9]; // 길이가 5인 int 배열 arr을 생성
		
		//score.lenght 배열 길이 출력
		System.out.println("arr.lenght ->" +score.length);
		
		for (int i = 0; i < score.length; i++) {
			System.out.println("score.length=[" + i +"]"+ score[i] );
			//  i = index 0~4 까지 출력된다 
		}
		System.out.println("for 밖 ->" + score[1]);
	}
}
