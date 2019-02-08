public class LaunchStringEnsureCapacity {
public static void main(String[] args){
    
    StringBuffer s = new StringBuffer(20);
    System.out.println(s.capacity());
    s.ensureCapacity(100);
    System.out.println(s.capacity());
}    
}
