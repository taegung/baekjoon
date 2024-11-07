package baekjoon;

import java.util.*;
public class swea1 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        for(int w=1;w<11;w++) {
            int N = in.nextInt();
            int apt[] = new int[N];
            for (int i = 0; i < N; i++) {
                apt[i] = in.nextInt();
            }
            int count = 0;
            for (int i = 2; i < N - 2; i++) {
                int test = apt[i];
                int max = 0;
                for (int j = i - 2; j < i + 3; j++) {
                    if (max < apt[j] && j != i) {
                        max = apt[j];
                    }
                }

                if (test > max) {
                    count = count + test - max;
                }

            }

            System.out.println("#"+w+" "+count);


        }
    }
}
