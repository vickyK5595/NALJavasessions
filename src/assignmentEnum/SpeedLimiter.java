package assignmentEnum;

public class SpeedLimiter {

	public static void main(String[] args) {
		
		SpeedLimit s = SpeedLimit.NH;
		System.out.println(s);
		System.out.println("Spped Limit of "+ s + " is :" + s.displaySpeed());

	}

}
