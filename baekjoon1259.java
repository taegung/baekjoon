package baekjoon;

import java.util.Scanner;

public class baekjoon1259 {
    public static void main(String[] args) {
        
      Scanner in=new Scanner(System.in);
      
      for(;;){
          int score = in.nextInt();
        if(score==0){
            break;
        }
        else{
            String s=String.valueOf(score);
            StringBuffer s1=new StringBuffer(s);
            String reverse =s1.reverse().toString();
           
            if(s.equals(reverse)){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }

      }
    }
}
