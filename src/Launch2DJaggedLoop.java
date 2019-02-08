
import java.util.Scanner;


class Launch2DJaggedLoop {
public static void main(String args[]){
    int i, j;
    int a[][]= new int[3][];   //Jagged Loop Array
    a[0]= new int[7];
    a[1] = new int[4];
    a[2] = new int[6];
    Scanner scan = new Scanner(System.in);
    for(i=0; i <= a.length-1; ++i){
        for(j=0; j <= a[i].length-1; ++j){
            
            System.out.println("enter the marks of class" + i + "student" + j);
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

