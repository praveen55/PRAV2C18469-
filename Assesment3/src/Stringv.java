
public class Stringv {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s = "Hi ";
		String s1=s.concat("Everyone");
		System.out.println(s1);
		String s2=new String("Hi ");
		if(s.equals(s2))
		{
		System.out.println(s2);	
		}
		else
		{
			System.out.println("no");
		}
	}

}
