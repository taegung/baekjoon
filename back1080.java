
import java.util.Scanner;

public class back1080 {
    public static void main(String args[]){

       
        Scanner in =new Scanner(System.in);

        int N =in.nextInt();
        int M =in.nextInt();

        int arrA[][] =new int[N][M];
        int arrB[][]= new int[N][M];
        in.nextLine();

        for(int i=0;i<N;i++){
            String num=in.nextLine();
            for(int k=0;k<M;k++){
                arrA[i][k]=num.charAt(k)-'0';
            }
        }
        for(int i=0;i<N;i++){
            String num=in.nextLine();
            for(int k=0;k<M;k++){
                arrB[i][k]=num.charAt(k)-'0';
            }
        }

        if(N<3 || M<3){
            int count=0;
            out:
            for(int i=0;i<N;i++){
                for(int k=0;k<M;k++){
                    if(arrA[i][k]!=arrB[i][k]){
                        count=-1;
                         break out;
                    }
                }
            }
            if(count!=-1){
                System.out.println(0);
            }
            else{
                System.out.println(count);
            }
            
        }
        else{
            int count=0;
            outerLoop:
            for(int i=0;i<N;i++){
                for(int k=0;k<M;k++){
                    if(arrA[i][k]!=arrB[i][k]){
                        count++;
                        if((i+3>N)||(k+3>M)){
                            count=-1;
                           break outerLoop;  
                        } 
                        for(int a=i; a < i+3; a++) {
                            for(int b=k; b < k+3; b++) {
                                if(arrA[a][b] == 0){
                                    arrA[a][b] = 1;
                                } else {
                                    arrA[a][b] = 0;     
                                }
                            }
                        }

                    }
                }
            }
           

           
            System.out.println(count);
        } 

    }

}