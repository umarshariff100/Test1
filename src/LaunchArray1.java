
import java.util.Scanner;


public class LaunchArray1 {
 
    @SuppressWarnings("empty-statement")
    public static void main(String[] args){
        
        int a[] = new int[5];
        int i;
        Scanner scan = new Scanner(System.in);
        for(i=0; i<=4; i++){
        System.out.println("enter the elem");
        a[i]=scan.nextInt();
        }
        
        
        for(i=0; i<=4; i++){
        System.out.println("The Elements enetred are:" + a[i]);
        
                
    }
        
}
}
