package Practice;

public class P123Q3 {

	//�������� �ܺ��� ���ϴ� ���� �۰ų� ������������ ����ϴ� ���α׷�
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
