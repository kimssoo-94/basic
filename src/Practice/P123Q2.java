package Practice;

public class P123Q2 {
	//�������� ¦�� �ܸ� ����ϴ� ���α׷�
	public static void gugudan(int x, int y) {
		
		int a=0;
		int b=0;
		
		for(a=x;a<=9;a++) {
			
			if(a%2!=0)
				continue;
			
			for(b=y;b<=9;b++) {
			
				System.out.println(a+"X"+b+"="+a*b);
				
			}
		}
		
	}
	
	public void dddd(int x, int y) {
		
		int a=0;
		int b=0;
		gugudan(1,2);
		for(a=x;a<=9;a++) {
			
			if(a%2!=0)
				continue;
			
			for(b=y;b<=9;b++) {
			
				System.out.println(a+"X"+b+"="+a*b);
				
			}
		}
		
	}

}
