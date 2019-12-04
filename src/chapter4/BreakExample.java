package chapter4;

public class BreakExample {

	public static void main(String[] args) {

		int sum = 0;
		int num = 0;
		
		for(num=0; sum<100; num++) { //합한값이 100을 넘을때 종료
			sum += num;
		}
		
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);
		System.out.println();
		int sum2 = 0;
		int num2 = 0;
		
		for(num2=0; ; num2++) {
			sum2+=num2;
			if(sum2>=100)
				break;
		}
		System.out.println("num : " + num2);
		System.out.println("sum : " + sum2);
	}

}
