package Practice;

import static java.lang.System.out;

class P123Q4_2 {
  private static char st = '*';
  
  public static void main(String[] args) {
    int j = 3; //number of space : increase star
    int z = 1; //number of space : decrease star

    //increase
    for(int i=0;i<7;i++){
      if(i%2!=0) continue;

      //call function prtAddStar
      prtIncStar(i,j);    
      j-=1; //adjust space(decrease)
    }
    
    //decrease
    for(int ii=5;ii>=0;ii--){
      if(ii%2!=0) continue;

      //call function prtDelStar
      prtDecStar(ii,z);
      z+=1; //adjust space(increase)
    }
    
    //P123Q2 gugu = new P123Q2();
    P123Q2.gugudan(2,1);
  }

  //increase function
  public static void prtIncStar(int i, int j){
    //print space
    for(int a =0;a<j;a++){
      out.print(" ");  
    }
    //print star
    for(int b=0;b<=i;b++){
      out.print(st);
    }
    //begin a new line
    out.println("");
  }

  //decrease function
  public static void prtDecStar(int ii, int z){
    //print space
    for(int a =0;a<z;a++){
      out.print(" ");  
    }
    //print star
    for(int b=0;b<=ii;b++){
      out.print(st);
    }
    //begin a new line
    out.println("");
  }
}
