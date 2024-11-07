import java.util.Scanner;
import java.util.HashMap;

public class back1946 {
    public static void main(String[] args) {
         
         Scanner in=new Scanner(System.in);
          int num=in.nextInt();
          for(int q=0;q<num;q++){
         int N = in.nextInt();
         HashMap<Integer,Integer> h1 = new HashMap<Integer,Integer>();
         

         for(int i=0;i<N;i++){
            int a=in.nextInt();
            int b=in.nextInt();
            h1.put(a,b);
         }
        int count=1;
        int min=h1.get(1);
         for(int i=2; i<N+1;i++){
              int v =h1.get(i);
            if(min>v){
                  count++;
                  min=v;
            } 
         }

         System.out.println(count);
        }


       
           
    }
}
