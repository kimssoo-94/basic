package chapter4;

public class ContinueExample {

	public static void main(String[] args) {

		int total = 0;
		int num;
		
		for(num = 1; num <= 100; num++) {
			if(num % 2 == 0) //num값이 짝수인경우
				continue;    //이후 수행을 생략하고 num++수행 //밑에 처리로 continue가 아니라 for문의 증감식으로 continue한다.
			total += num;    //num 값이 홀수인 경우에만 수행
		}
		System.out.println("1부터 100까지의 홀수의 합은 "+total+"입니다");
	}

}
