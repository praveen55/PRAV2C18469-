import java.math.BigInteger;


public class Biginteger {
public static void main(String[] args) 
{
	// TODO Auto-generated method stub
	BigInteger s= new BigInteger("1234567");
	BigInteger p= new BigInteger("7654321");
	BigInteger g=s.add(p);
	BigInteger h=s.max(p);
	BigInteger i=s.min(p);
	{
	System.out.println("The addition of two number is "+g);
	System.out.println("The Maximum Value of two number is "+h);
	System.out.println("The Minimum Value of two number is "+i);
	}
}
}

