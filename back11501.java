package baekjoon;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class back11501 {
    
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int K = in.nextInt(); 
        long arr[]=new long[K];
        for (int q = 0; q < K; q++) {
            int N = in.nextInt(); 
            long result = 0;
            ArrayList<Long> list1 = new ArrayList<>(N);
            for (int i = 0; i < N; i++) {
                long num = in.nextLong();
                list1.add(num);
            }

            long max = list1.get(N - 1); 
            for (int i = N - 2; i >= 0; i--) {
                if (list1.get(i) < max) {
                  
                    result += max - list1.get(i);
                } else {
                    
                    max = list1.get(i);
                }
            }
            arr[q]=result;
        }

        for (int i=0; i<K;i++) {
            System.out.println(arr[i]);
        }
        in.close();
    }
    
    
   

}
