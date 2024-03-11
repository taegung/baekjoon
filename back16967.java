import java.util.Scanner;

public class back16967 {
    public static void main(String[] args){
           Scanner in =new Scanner(System.in);

           int H=in.nextInt();
           int W=in.nextInt();
           int X=in.nextInt();
           int Y=in.nextInt();

           int arrB [][] =new int[H+X][W+Y];

           for(int i=0;i<H+X;i++){
            for(int k=0;k<W+Y;k++){
                arrB[i][k]=in.nextInt();
            }
           }
           int arrA1[][]=new int [H][W];
         
           for(int i=0;i<H;i++){
            for(int k=0;k<W;k++){
                arrA1[i][k]=arrB[i][k]; 
            }
          
           }

           for(int i=0+X;i<H;i++){
            for(int k=0+Y;k<W;k++){             
             arrA1[i][k]-=arrA1[i-X][k-Y];
            }
           
           }

           for(int i=0;i<H;i++){
            for(int k=0;k<W;k++){
                System.out.print(arrA1[i][k]+" ");
            }
            System.out.println();
           }



    }
}
