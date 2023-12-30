
import java.util.Scanner;

public class back1152 {
    public static void main(String args[]){

        Scanner in=new Scanner(System.in);
 
        String s= in.nextLine();
        String last=s.strip();
        String [] result =last.split(" ");
        
       if(result.length==1){
        if(result[0].equals("")){
            System.out.println(0);
        }
        else{
            System.out.println(1 );
        }
       }
       else{
        System.out.println(result.length);
       }
       
        

    }

}