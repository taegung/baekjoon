import java.util.Scanner;
public class back11501 {
    
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int N= in.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
          arr[i]=in.nextInt();
        }
        int pt=arr[0];
        int sum=0;
        for(int i=1;i<N;i++){
           
            if(pt<arr[i]){
                sum=pt;
                pt=arr[i];
            }
            else{
                pt=arr[i];
            }


            
        }


    
    
    
    
    
    
    
    
    }
}
