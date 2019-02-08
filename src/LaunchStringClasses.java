
import java.util.Arrays;

public class LaunchStringClasses {

public static void main(String[] args){
    String s1 = new String("RajaRamMohanRoy");
    System.out.println(s1.startsWith("Raja"));
    System.out.println(s1.contains("Ram"));
    System.out.println(s1.endsWith("oy"));
    System.out.println(s1.contains("Soha"));
    System.out.println(s1.toUpperCase());
    System.out.println(s1.toLowerCase());
    System.out.println(s1.indexOf("M"));
    System.out.println(s1.charAt(11));
    System.out.println(s1.substring(7, 13));
    System.out.println(s1.subSequence(2, 9));
    System.out.println(s1.codePointAt(0));
    System.out.println(Arrays.toString(s1.getBytes()));
    System.out.println(s1.hashCode());
    
    
    
}    
}
