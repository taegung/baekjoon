import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class back1764 {
    

    
    
    public static void main(String[] args) {

         Scanner in=new Scanner(System.in);

         int N = in.nextInt();
         int M = in.nextInt();
     
        HashMap<Integer,String> h1 = new HashMap<Integer,String>();
        ArrayList<String> list = new ArrayList<>();

       
         for(int i=0;i<N;i++){
             String str1=in.next();
             h1.put(i,str1);
         }
         int count=0;
         for(int i=0;i<M;i++){
            String str2 =in.next();
            if(h1.containsValue(str2)){
             list.add(str2);
             count++;
          }
        }
       Collections.sort(list);
        System.out.println(count);
        for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));
       }



          


         
     
        

        
    }
    
}
