import java.util.Scanner;

class ex5{
	static final int IN_CASH=0;
	static final int TWO_TIMES=1;
	static final int THREE_TIMES=2;
	static double checkOut(double value, int type){
		switch(type){
			case IN_CASH: return value;
			case TWO_TIMES: return (value+(value*0.10));
			case THREE_TIMES: return (value+(value*0.20));
			default: return(-1);
		}
	}

	static public void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert the total value of the shopping and the type of payment (0= In cash, 1= two installments, 2= three installments): ");
		double value = scan.nextDouble();
		int type = scan.nextInt();
		double x = checkOut(value,type);
		System.out.println("You'll have to pay: "+x+" dollars.");
	}

}
