package chapter4;

public class ContinueExample {

	public static void main(String[] args) {

		int total = 0;
		int num;
		
		for(num = 1; num <= 100; num++) {
			if(num % 2 == 0) //num���� ¦���ΰ��
				continue;    //���� ������ �����ϰ� num++���� //�ؿ� ó���� continue�� �ƴ϶� for���� ���������� continue�Ѵ�.
			total += num;    //num ���� Ȧ���� ��쿡�� ����
		}
		System.out.println("1���� 100������ Ȧ���� ���� "+total+"�Դϴ�");
	}

}
