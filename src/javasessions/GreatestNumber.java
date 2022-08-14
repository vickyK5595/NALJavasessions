package javasessions;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 650;
		int b = 650;
		int c = 650;
		int d = 200;
		
		if ( a > b && a > c && a > d) {
			System.out.println("a is the greatest value");
		}
		else if (b > c && b>d ) {
			System.out.println("b is the greatest value");
		}
		else if (c > d) {
			System.out.println("c is the greatest value");
		}
		else {
			System.out.println("d is the greatest value");
		}

	}

}
