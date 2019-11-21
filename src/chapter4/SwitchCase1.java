package chapter4;

public class SwitchCase1 {

	public static void main(String[] args) {

		int now = 5;
		String brand = null;

		switch(now){
		
		case 1 : brand = "약국";
			break;
		
		case 2 : brand = "정형외과";
			break;
		
		case 3 : brand = "피부과";
			break;
			
		case 4 : brand = "치과";
			break;
		
		case 5 : brand = "헬스 클럽";
			break;
		}
		
		System.out.println(now+"층은 "+brand+"입니다");
	}

}
