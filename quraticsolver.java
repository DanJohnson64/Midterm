import java.lang.*;
public class quraticsolver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		int a = 7777777777;
		int b = 3333333333;
=======
		int a = 5;
		int b = 6;
>>>>>>> ca02a3c2e61abcf99c03e1780f1284d5928915fd
		int c = 2;
		if (b*b - 4*a*c <0)
			System.out.println("This equation " + a + "x^2 + " + b +"x + " + c +" has no solution");
		else
			{
				System.out.println("The solution for the equation " + a + "x^2 + " + b +"x + " + c +" are");
				System.out.println((-b+Math.sqrt(b*b-4*a*c))/2*a + " and " + (-b-Math.sqrt(b*b-4*a*c))/2*a);
			}
	}

}
