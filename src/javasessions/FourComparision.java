package javasessions;

public class FourComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10;
		int j = 200;
		int k = 84;
		int l = 41;
		
		if (i>j && i>k && i>l) {
			System.out.println("i is Greatest");
		}
		else if(j>k && j>l) {
			System.out.println("j is Greatest");
		}
		else if(k>l) {
			System.out.println("k is Greatest");
		}
		else {
			System.out.println("l is Greatest");
		}
		
		
		for (char c = 'A'; c<= 'Z' ; c++) {
			System.out.println("ASCII value for  " + c +" :    " + (int)c);
		}
		Object arr[]=new Object[5];
		arr[0]="Testing";
		arr[1]=100;
		arr[2]=false;
		System.out.println(arr[3]);
	}

}
