import java.util.Arrays;
import java.util.Scanner;

public class back1449 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int N=in.nextInt();
        int L=in.nextInt();
        int arr[] =new int[N];
        for(int i=0;i<N;i++){
               arr[i]=in.nextInt();
        }
          Arrays.sort(arr);
         int count=1;
        double pt=arr[0]-0.5+L;
    
        for(int i=1;i<N;i++){
            if(arr[i]>pt){
                   count++;
                   pt=arr[i]-0.5+L;
            }
        }

        System.out.println(count);
    }
}
