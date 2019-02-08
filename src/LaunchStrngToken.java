

import java.util.StringTokenizer;

public class LaunchStrngToken {
public static void main (String[] args){
    StringTokenizer s; 
    s = new StringTokenizer("Aradhya's Brilliance Center For Java and Testing", "raceyg" );
    while(s.hasMoreTokens()){
        System.out.println(s.nextToken());
        
    }
}    
}
    

