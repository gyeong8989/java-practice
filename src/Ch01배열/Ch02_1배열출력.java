package Ch01배열;

//Arrays.toString 사용하려면 import 해얌
import java.util.Arrays;

public class Ch02_1배열출력 {

	public static void main(String[] args) {
		int[] iArr= {100, 95, 80, 70, 60};
		
		
		System.out.println(iArr);
		//iArr 주소값 나옴 [I@626b2d4a [배열의미 I인티저 타입 @62..주소
		
		//char[] chArr = {'a','b','c','d'};
		//system.out.println(chArr); a b c 출력된다 
		
		
		//for문 사용해서 배열의 요소를 순서대로 하나씩 출력
		for (int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
			
		//for문 말고 Arrays.toString(iArr)); 사용 가능
		// 배열을 문자형으로 변환 해서 출력
		
			
		}
		System.out.println(Arrays.toString(iArr));
	}

}
