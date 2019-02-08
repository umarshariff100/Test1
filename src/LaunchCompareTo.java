public class LaunchCompareTo {
 public static void main(String[] args){
     String s1 = "SACHIN";
     String s2 = "SACHIN";
     if(s1.compareTo(s2)>0){
         System.out.println("string1 is greator than string2");
     }
     else if(s1.compareTo(s2)<0){
         System.out.println("String1 is lesser than String2");
     }
     else{
         System.out.println("String are equal");
 }   
}
}