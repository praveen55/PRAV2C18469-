import java.util.Scanner;

enum vechile
{
	car,bike,truck;
}
public class Enumm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vechile car =vechile.car;
		vechile bike =vechile.bike;
		vechile truck =vechile.truck;
		switch(bike){
		case car:
			System.out.println("red colur");
			break;
		case bike:
			System.out.println("black colour");
			break;
		case truck:
			System.out.println("brown colour");
			break;
			}
		}
	}

