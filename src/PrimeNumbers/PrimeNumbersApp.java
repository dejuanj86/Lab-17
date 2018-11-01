package PrimeNumbers;
import java.util.*;

public class PrimeNumbersApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<Integer> primes = new ArrayList<Integer>();
		int list = 2;	//start at first prime
		int nthPrime;
		String choice = "y";
		System.out.println("Let's locate some primes!");
		System.out.println("This program will find any prime, in order, from first prime number on");
		System.out.println();
		
		while(choice.matches("[yY].*"))
		{
			System.out.print("What prime number are you looking for? ");
			nthPrime = scan.nextInt();
			
			while(primes.size() != nthPrime)
			{
				if(isPrime(list))
					primes.add(list);
				
					list++;
			}
			
			//test for check isPrime
			//System.out.println(isPrime(8));
			
			System.out.println("The number " + nthPrime + " prime is " + primes.get(nthPrime-1));
			System.out.println();
			System.out.println("Do you want to find another (y/n)? ");
			choice = scan.next();
			scan.nextLine();
		}
	}
	
	public static boolean isPrime(int num)
	{
		int temp;
		boolean isPrime = true;
		
		//capture the input in an integer
		
		for(int i=2;i<=num/2;i++)
		{
	       temp=num%i;
		   if(temp==0)
		   {
		      isPrime = false;
		      break;
		   }
		}
		return isPrime;
	}

}