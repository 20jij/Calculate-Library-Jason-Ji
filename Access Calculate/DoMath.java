//This class contains methods to perform various mathematical topic
//@author JasonJi
//client code 
//@version 9/12/18
public class DoMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Calculate.square(-3));
		System.out.println(Calculate.average(-3,-6));
		System.out.println(Calculate.average(3.7,8.8));
		System.out.println(Calculate.toDegrees(45));
		System.out.println(Calculate.discriminant(3,5,8));
		System.out.println(Calculate.toImproperFrac(3,4,5));
		System.out.println(Calculate.toMixedNum(7,2));
		System.out.println(Calculate.foil(1,1,1,1,"n"));
		//part 2
		System.out.println(Calculate.isDivisibleBy(2,2));
		System.out.println(Calculate.absValue(-2));
		System.out.println(Calculate.max(3.4, 4.5, 5.6));
		System.out.println(Calculate.min(5, 7));
		System.out.println(Calculate.round2(5.333333));
		//part3
		System.out.println(Calculate.exponent(2.0, 3));
		System.out.println(Calculate.factorial(5));
		System.out.println(Calculate.isPrime(4));
		System.out.println(Calculate.gcf(24, 16));
		System.out.println(Calculate.sqrt(1.21));
		//part4
		System.out.println(Calculate.quadForm(1,2,1));
	}
}


