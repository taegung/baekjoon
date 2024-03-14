import java.util.Scanner;
public class back1105 {

    public static void main(String[] args) {
        
        Scanner in =new Scanner(System.in);

        String L =in.next();
        String R =in.next();
         int Llength=L.length();
         int Rlength=R.length();

         int arrL[] = new int[Llength];
         int arrR[] = new int[Rlength];
        for(int i=0;i<Llength;i++){
            arrL[i]=L.charAt(i)-'0';
        }
        for(int i=0;i<Rlength;i++){
            arrR[i]=R.charAt(i)-'0';  
        }

        int count=0;
        int first8=0;
       

        if(L.equals(R)){
           
            for(int i=0;i<Llength;i++){
                 if(arrL[i]==8){
                    count++;
                 }
            }
        }
        else{
            for(int i=0;i<Llength;i++){
            
                if(arrL[i]==arrR[i]){
                    if(arrL[i]==8){
                      count++;
                    }
               }
               else{
                break;
               }
               
            }
        }

         if(L.length()<R.length()){   
              System.out.println(0);
         }
         else{
            System.out.println(count);
         }








    }
    
}
