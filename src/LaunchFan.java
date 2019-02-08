class Fan{
    int cost;
    String color;
    int Blades;
    
    void rotate(){
        System.out.println("Fan is rotating");
    }
    void blowAir(){
        System.out.println("Fan is Blowing the Air");
    }
    void noOfBlades(){
        System.out.println("The Fan has 3 or 4 Blades");
    }
    
}
public class LaunchFan {
    public static void main(String args[]){
        Fan f = new Fan();
        f.color="Green";
        f.cost= 1000;
        f.Blades=34;
        System.out.println(f.color);
        System.out.println(f.cost);
        System.out.println(f.Blades);
        f.rotate();
        f.blowAir();
        f.noOfBlades();
        
        
    }
    
}
