package chapter4;

public class SwitchCase1 {

	public static void main(String[] args) {

		int now = 5;
		String brand = null;

		switch(now){
		
		case 1 : brand = "�౹";
			break;
		
		case 2 : brand = "�����ܰ�";
			break;
		
		case 3 : brand = "�Ǻΰ�";
			break;
			
		case 4 : brand = "ġ��";
			break;
		
		case 5 : brand = "�ｺ Ŭ��";
			break;
		}
		
		System.out.println(now+"���� "+brand+"�Դϴ�");
	}

}
