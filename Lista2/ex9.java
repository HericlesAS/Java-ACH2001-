import java.util.Scanner;

class ex9{
	static final int MILES = 0;
	static final int FOOT = 1;
	static final int YARDS = 2;
	static final int INCHES = 3;
	static final double MMTOKM= 0.000001; //Milimeters to kilometers
	static final double INCTOMM = 25.3995; // Inches to milimeters

	static double imperialConverter(int type, double value){
		switch(type){
			case 0: return (value*1760*3*12*INCTOMM)*MMTOKM;
			case 1: return (value*12*INCTOMM)*MMTOKM;
			case 2:	return (value*3*12*INCTOMM)*MMTOKM;
			case 3: return (value*INCTOMM)*MMTOKM;
			default: return (-1);
	
		}

	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the unit value of input (MILES->0 , FOOT-> 1 , YARDS->2 , INCHES->3): ");
		int type = scan.nextInt();
		System.out.println("Enter the value you want to convert to quilometers: ");
		double value = scan.nextDouble();
		double x = imperialConverter(type,value);
		System.out.println(x+" Kilometers.");
	}
}
