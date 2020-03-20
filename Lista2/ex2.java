import java.util.Scanner;

class ex2{
	static public void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert the a,b,c values: ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		if (a>0 && a<b){
			c=0;
		}
		System.out.println("The final c value is: " +c);
	}
}
