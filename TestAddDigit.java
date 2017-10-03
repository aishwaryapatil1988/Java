import java.io.*;

class AddDigit{
	private int number;
	public int addDigits(int number){
		int addnum=0;
		while(number!=0){
			int rem=number%10;
			addnum=addnum+rem;
			number=number/10;
		}
		return addnum;
	}
}
class TestAddDigit{

public static void main(String[] args){
	AddDigit a = new AddDigit();
	String str="";
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter number for adding digits: ");
	try{
		str = br.readLine();
	}
	catch(IOException e){
		System.out.println("IO Exception");
	}
	int inputNumber=Integer.parseInt(str);
	int digitAddition=a.addDigits(inputNumber);
	System.out.println("Addition of Digits is: "+digitAddition);
}

}