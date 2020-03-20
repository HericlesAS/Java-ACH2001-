import java.util.Scanner;

class ex3{
	static public void main (String[] args){
		Scanner scan= new Scanner(System.in);
		System.out.println("Insert the var value: ");
		int var=scan.nextInt();
		if(var>10 || var<4){
			System.out.println("fora");
		}
	}
}
