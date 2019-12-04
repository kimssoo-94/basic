package Practice;

public class P123Q4 {

	public static void main(String[] args) {

		char ch = '*';
		int x; //1-7
		
		for(x=1;x<=7;x++) {
			if(x%2==0)
				continue;

			for(int j=3; j <= 1; j--) {
				prt(x,ch,j);
			}
		}
	}
	
	public static void prt(int num,char star,int ynum) {
		for(int p = 1; p <= ynum; p++) {
			System.out.print("");
		}
		
		for(int i = 1; i <= num; i++) {
			System.out.print(star);
		}
		System.out.println("");
	}
}
