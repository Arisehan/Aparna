package Practice;

public class PrimeNumberornot {
	public static void main(String[]args) {
		int num=1;
		while(num<=100)
		{
			int pc=2;
			int dc=0;
		while(num>pc)
		{
		if(num%pc==0)
		{
		dc++;
		}pc++;
		}
		if(dc==0)
		{
		System.out.println("prime number="+num);
		}num++;
		}
	}
}
