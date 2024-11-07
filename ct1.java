package baekjoon;

import java.util.Scanner;
import java.util.HashMap;

public class ct1 {

    public static void main(String[] args) {
        
        Scanner in =new Scanner(System.in);
        
        String s= in.nextLine();
        HashMap<String,String> h1=new HashMap<String,String>();
        HashMap<String,String> h2=new HashMap<String,String>();

        
            h1.put("zero","0");
            h1.put("one","1");
            h1.put("two","2");
            h1.put("three","3");
            h1.put("four","4");
            h1.put("five","5");
            h1.put("six","6");
            h1.put("seven","7");
            h1.put("eight","8");
            h1.put("nine","9");
            h2.put("0","0");
            h2.put("1","1");
            h2.put("2","2");
            h2.put("3","3");
            h2.put("4","4");
            h2.put("5","5");
            h2.put("6","6");
            h2.put("7","7");
            h2.put("8","8");
            h2.put("9","9");
            char[] chr = s.toCharArray();
            String change = "";
            String result="";
            for (int i = 0; i < chr.length; i++) {
                String s1 =Character.toString(chr[i]);
                if(h2.containsKey(s1)){
                     result+=s1;
                }else{
                    change += s1; 
                    if(h1.containsKey(change)){
                        result+=h1.get(change);
                        change="";
                    }
                }
            }
            int answer=Integer.parseInt(result);

            System.out.println(answer);
       



    }
    
}


