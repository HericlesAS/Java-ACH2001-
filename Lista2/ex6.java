import java.util.Scanner;

class ex6{
	static int largestNumber(int a,int b, int c){
		
		if(a>b && a>c) return a;
		else if(b>a && b>c) return b;
		else return c;
		
	}	
	
	public static void main(String[] args){
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter 3 integer values: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int x= largestNumber(a,b,c);
		System.out.println(x+" Is the largest.");
	}


}
