package Practice;

public class Armstrong {
public static void main(String[]args) {
	int num=153;
	int r;
	int sum=0;
	int temp=num;
	while(num>0) {
		r=num%10;
		sum=r*r*r+sum;
		num=num/10;
	}
	if(temp==sum) {
	System.out.println("Number is Armstrong");
	}
	else
	{
		System.out.println("Number is not Armstrong");
	}
}
}
