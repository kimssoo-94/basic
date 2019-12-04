package Practice;

public class P123Q3 {

	//구구단을 단보다 곱하는 수가 작거나 같은경우까지만 출력하는 프로그램
	public static void main(String[] args) {

		int x;
		int y;
		
		for(x=1;x<=9;x++) {
			for(y=1;y<=9;y++) {
				if(x<=y)
					break;				
				System.out.println(x+"X"+y+"="+x*y);
			}
		}
		
	}

}
