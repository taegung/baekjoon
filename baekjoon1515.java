import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class baekjoon1515 {
    public static void main(String[] args) {
        
      Scanner in=new Scanner(System.in);
      String N = in.nextLine();
      int pt=0;
      int base=0;
      
      while (base++ <= 30000) {
        String tmp = String.valueOf(base);
        for (int i = 0; i < tmp.length(); i++) {
            if (tmp.charAt(i) == N.charAt(pt))
                pt++;
            if (pt == N.length()) {
                System.out.println(base);
                return;
            }
        }
      }

    }
}

