
import java.util.Scanner;


public class LaunchArray {
 
    public static void main(String[] args){
        
        int a[] = new int[5];
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the elem");
        a[0]=scan.nextInt();
        System.out.println("enter the elem");
        a[1]=scan.nextInt();
        System.out.println("enter the elem");
        a[2]=scan.nextInt();
        System.out.println("enter the elem");
        a[3]=scan.nextInt();
        System.out.println("enter the elem");
        a[4]=scan.nextInt();
        System.out.println("The Elements entered are: ");
        
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        
    }
}
