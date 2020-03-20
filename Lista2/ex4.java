import java.util.Scanner;

class ex4{
	static final int EARLY=0;
	static final int REGULAR=1;

	static double gymPrice(int type, double hours, double price){
		double total_amount;
		if(type==EARLY){
			total_amount=(hours*price)-(hours*price)*0.07;
			return total_amount;
		}
		else{
			total_amount=(hours*price);
			return total_amount;
		}
	}
	static public void main(String[] args){
		Scanner scan= new Scanner(System.in);
		System.out.println("Insert the type payment (0=Early,1=Regular), number of hours/class and its price: ");
		int type=scan.nextInt();
		double hours=scan.nextDouble();
		double price=scan.nextDouble();
		double x=gymPrice(type,hours,price);
		System.out.println("You will have to pay: "+x+" dollars.");
	}
}	
