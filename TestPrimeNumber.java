import java.io.*;
class PrimeNumber{
	private int n;
	public void findPrime(int n){
		int result=0;
		int mult=0;
		for(int x=1;x<=n;x++){
			mult=n%x;
			if(mult==0)
				result++;
				System.out.println("mult = "+mult+"result = "+result);		
		}
		if(result==2)
			System.out.println(n+" is a Prime Number");
		else
			System.out.println(n+" is NOT a Prime Number");
}

}

class TestPrimeNumber{

public static void main(String[] args){
	PrimeNumber num = new PrimeNumber();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
	System.out.print("Enter number to find if it is a Prime Number: ");
	String input = "";
	try{	
		input = br.readLine();
	}
	catch(IOException e){
		System.out.println("IO Exception");
	}

	int number = Integer.parseInt(input);
	num.findPrime(number);

}

}