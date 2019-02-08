import java.util.*;


class Guesser
{
	int gnum;
	int guessNum()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Guesser kindly guess the number");
		gnum = scan.nextInt();
		return gnum; 
	}

}


class Player

{
	int pnum;
	int guessNum()
{
		Scanner scan = new Scanner(System.in);
		System.out.println("Player kindly guess the number");
		pnum = scan.nextInt();
		return pnum;
	}
}

class Umpire

{
	int numfromguesser;
	int numfromplayer1;
	int numfromplayer2;
	int numfromplayer3;

	void collectNumFromGuesser()
	{
	Guesser g= new Guesser();
	numfromguesser=g.guessNum();
		}

 void collectNumFromPlayer()
	{

	 Player P1 = new Player();
	 Player P2 = new Player();
	 Player P3 = new Player();

	 numfromplayer1= P1.guessNum();
	 numfromplayer2= P2.guessNum();
	 numfromplayer3= P3.guessNum();

	}

void Compare()

	{
		if (numfromguesser == numfromplayer1)
		{
			System.out.println("Player1 is the Winner");
		}

		else if (numfromguesser == numfromplayer2)
		{
			System.out.println("Player2 is the Winner");
		}

		
	else if  (numfromguesser == numfromplayer3)
		{
			System.out.println("Player3 is the Winner");
		}
		else 
		{
		System.out.println("Player lost try again");
		}
	}
 }


class LaunchGame

{
	public static void main(String args[]) 
	{
		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.Compare();
	}
}
