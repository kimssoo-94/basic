package chapter4;

public class NestedLoop {

	public static void main(String[] args) {

		int dan;
		int times;
		
		for(dan =2; dan<=9; dan++) {
			for(times=1; times<=9; times++) {
				System.out.println(dan + "X" + times + "=" +dan * times);
			}
			
			System.out.println(); //���ٶ���
		}
		
		System.out.println("3�ܺ��� 7�ܱ���");
		
		
		int i;
		int z;
		
		for(i=3; i<=7; i++) {
			for(z=1; z<=9; z++) {
				System.out.println(i + "X" + z +"=" + i*z);
			}
			
			System.out.println();
		}
		
	}

}
