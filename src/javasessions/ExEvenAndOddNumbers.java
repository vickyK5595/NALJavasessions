package javasessions;

public class ExEvenAndOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String evenNumbers = "";
		String oddNumbers = "";
		for(int i=1;i<100;++i)
		{
			if(i%2==0)
			{
				evenNumbers = ( evenNumbers + i +",");
			}
		}
		for(int i=1;i<100;++i)
		{
			if(i%2==1)
			{
				oddNumbers = ( oddNumbers + i +",");
			}
		}
		
		System.out.println(evenNumbers);
		System.out.println(oddNumbers);
		
		for(int c = 'a'; c<='z'; c++) 
		{
			System.out.println(c);
		}
		for(char c = 'A'; c<='Z'; c++) 
		{
			System.out.println((int)c);
		}
		for(char c = '0'; c<='9'; c++)
		{
			System.out.println((int)c);
		}

	}

}
