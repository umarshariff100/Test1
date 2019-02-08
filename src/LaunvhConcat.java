
public class LaunvhConcat {
 public static void main(String[] args){
     String s1= "RAMA";
     String s2= "SITA";
     String s3 = s1 + s2;
     String s4 = s3; // references are compared
     if(s3 == s4){
         System.out.println("Strings are equal");
     }
     else{
         System.out.println("Strings are not equal");
     }

 }   
}
