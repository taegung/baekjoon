import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class back2346 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        Deque<Integer> balloons = new ArrayDeque<>();
        Deque<Integer> balloonIndexes = new ArrayDeque<>();
       
        for (int i = 0; i < N; i++) {
            int number = in.nextInt();
            balloons.add(number);
            balloonIndexes.add(i + 1);
        }

        while (!balloons.isEmpty()) {
            int num = balloons.pollFirst();
            int index = balloonIndexes.pollFirst();
            System.out.print(index + " ");
            
         
            int move = num;
            if (move > 0) {
                move--;
            }

        
            while (move > 0) {
                balloons.addLast(balloons.pollFirst());
                balloonIndexes.addLast(balloonIndexes.pollFirst());
                move--;
            }

         
            while (move < 0) {
                balloons.addFirst(balloons.pollLast());
                balloonIndexes.addFirst(balloonIndexes.pollLast());
                move++;
            }
            
           
            if (balloons.size() == 1) {
                System.out.print(balloonIndexes.pollFirst());
                break;
            }
        }
        
        in.close();
    }
}
