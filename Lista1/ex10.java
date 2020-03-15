
import java.util.Scanner;

public class ex10{
	static int numReversion(int num){
		int holder=0;
		while(num != 0){
      			holder = holder * 10;
      			holder = holder + num%10;
      			num = num/10;
		}
		return holder;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Insert the number you want to reverse: ");
		int x=scan.nextInt();
		System.out.println(numReversion(x));
	}

}
