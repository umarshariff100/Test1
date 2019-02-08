class Dog

{
	String name;
	String breed;
	int price;
		

}

class LaunchDog

{

	public static void main(String args[])

	{
	Dog d = new Dog();
        d.breed= "Lobo";
        d.name = "TOMI";
        d.price = 1000;
	           System.out.println(d.name);
                   System.out.println(d.breed);
                   System.out.println(d.price);
	}
}
