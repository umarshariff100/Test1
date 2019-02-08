class Dog1

{
	String name;
	String breed;
	int cost;
	

}

class LaunchDog1

{

	public static void main (String[] args)

	{
	Dog1 d1 = new Dog1();
	d1.name = "Lobo";
	d1.breed = "Brown";
	d1.cost = 1000;
            System.out.println(d1.name);
            System.out.println(d1.breed);
            System.out.println(d1.cost);
            
        Dog1 d2 = d1;
                   
        System.out.println(d2.name);
            System.out.println(d2.breed);
            System.out.println(d2.cost);
        
	}
}
