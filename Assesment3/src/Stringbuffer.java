
public class Stringbuffer {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		StringBuffer p =new StringBuffer("yad ecin a evaH");
		p.append(new StringBuffer("!OLLEH"));
		p.insert(15,"~");
		p.reverse();
		{
		System.out.println(p);
		}
		p.delete(5, 7);
		p.insert(5, " \nGood Morning\n");
		{
		System.out.println(p);
	}
	}

}
