
import java.util.Scanner;


class Launch3DArray {
public static void main(String args[]){
    int i, j ,k ;
    int a[][][]= new int[3][][];
    a[0]= new int[3][];
    a[1] = new int[2][];
    a[2] = new int[4][];
    
    a[0][0]=new int[4];
    a[0][1]=new int[6];
    a[0][2]=new int[5];
    
    a[1][0]=new int[5];
    a[1][1]=new int[7];
    
    a[2][0]=new int[3];
    a[2][1]=new int[6];
    a[2][2]=new int[5];
    a[2][3]=new int[7];
       
    
    
    
    
    Scanner scan = new Scanner(System.in);
    for(i=0; i <= a.length-1; ++i){
        for(j=0; j <= a[i].length-1; ++j){

            for(k=0; k<= a[i][j].length-1; ++k){
            System.out.println("enter the marks of school" + i + "class" + j+ "student" +k);
            a[i][j][k]=scan.nextInt();
        }
    }
    }
    System.out.println("Student Marks are :");
    for(i=0; i<=a.length-1; ++i){
        for(j=0; j <=a[i].length-1; ++j){
            for(k=0; k<= a[i][j].length-1; ++k){
            System.out.println(a[i][j][k]);
        }
    }
    }

}    
}

