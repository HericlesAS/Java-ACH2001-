import java.util.Scanner;
class ex6{
	static public float convertMoney(){
		Scanner scan = new Scanner(System.in);
                System.out.println("Insert the convertion rate: ");
                float convertion_rate=scan.nextFloat(); //Enter the value of how much 1 real  worth in dollars
                System.out.println("Insert the amount of reais you want to convert: ");
                float reais=scan.nextFloat();
                return reais*convertion_rate;

	}
	static public void main(String args[]){
		System.out.println("With the actual converstion rate, you will receive "+convertMoney()+" dollars.");
	}
}
