public class LaunchMutibleStrngCapacity {

public static void main(String[] args){
    StringBuilder s = new StringBuilder();
    System.out.println(s.capacity());
    s.append("SACHIN TENDULKAR");
    System.out.println(s.capacity());
    s.append("IS A BATSMAN");
    System.out.println(s.capacity());
    s.append("HE IS AN MP ALSO");
    System.out.println(s.capacity());
    s.append(" JSON stands for JavaScript Object Notation. JSON objects are used for transferring data between server and client, XML serves the same purpose. However JSON objects have several advantages over XML and we are going to discuss them in this tutorial along with JSON concepts and its usages.\n" +
"\n" +
"Let’s have a look at the piece of a JSON data: It basically has key-value pairs.");
    System.out.println(s.capacity());
}     
}
