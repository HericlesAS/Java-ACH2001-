import java.util.Scanner;

class ex7{
	static final int FAHRENHEIT=0;
	static final int CELSIUS=1;
	static double convertTemp(int type, double temp){
		switch(type){
			case FAHRENHEIT: return ((5/9)*(temp-32));
			case CELSIUS: return ((9*temp)/5 +32);
			default: return(-1);
		}
	}
	static public void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the type of conversion (0: FAHRENHEIT->CELSIUS , 1: CELSIUS->FAHRENHEIT): ");
		int type = scan.nextInt();
		double temp = scan.nextDouble();
		double x = convertTemp(type,temp);
		System.out.println(x); 
	}


}
