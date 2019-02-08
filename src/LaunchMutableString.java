public class LaunchMutableString {
    
    public static void main(String[] args){
        
        StringBuffer s1 = new StringBuffer("RAMA");
        System.out.println(s1);
        s1.append("sita                                1");
        System.out.println(s1);
        System.out.println(s1.capacity());
        s1.trimToSize();
        System.out.println(s1);
    }
    
}
