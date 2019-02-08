
import java.util.Scanner;


class Launch2DArray {
public static void main(String args[]){
    int i, j;
    int a[][]= new int[3][5];
    Scanner scan = new Scanner(System.in);
    for(i=0; i <= a.length-1; ++i){
        for(j=0; j <= a[i].length-1; ++j){
            
            System.out.println("enter the marks of class" +  i + "student" +  j);
            a[i][j]=scan.nextInt();
        }
    }
 
    System.out.println("Student Marks are :");
    for(i=0; i<=a.length-1; ++i){
        for(j=0; j <=a[i].length-1; ++j){
            System.out.println(a[i][j]);
        }
    }

}    
}
