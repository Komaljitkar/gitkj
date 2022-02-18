import java.util.Scanner;
class Bank
{
	public static void main(String args[])
	{
		double x, nec, ffa, edu, ltss, play, give;
		Scanner so=new Scanner(System.in);
		System.out.println("Enter your salary:");
		x=so.nextInt();
		
		nec=x*55/100;
		ffa=x*10/100;
		edu=x*10/100;
		ltss=x*10/100;
		play=x*10/100;
		give=x*5/100;
		
		System.out.println("Necessity (NEC) is:"+nec);
		System.out.println("Finance Freedom Account is:"+ffa);
		System.out.println("Education (EDU) is:"+edu);
		System.out.println("Long Term Spending Saving is:"+ltss);
		System.out.println("Play account (Play)is:"+play);
		System.out.println("Give account (Play)is:"+give);
	}
}