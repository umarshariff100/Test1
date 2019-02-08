
import java.util.Scanner;


public class LaunchArrayDoWhileLoop{
 
    @SuppressWarnings("empty-statement")
    public static void main(String[] args){
        
        int a[] = new int[5];
        Scanner scan = new Scanner(System.in);
        int i;
         i=0;
         do{
             System.out.println("Enter the Elements");
             a[i]=scan.nextInt();
             i++;
         }while(i<=4);
         
        i=0;
         do{
             System.out.println(a[i]);
             i++;
         } while(i<=4);
        }
}
