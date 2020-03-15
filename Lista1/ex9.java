import java.util.Scanner;

class ex9{
	static public void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert the team and player number, also the amount of yellow and red card: ");
		int team=scan.nextInt();
		int player=scan.nextInt();
		double yellowcard=scan.nextInt();
		double redcard=scan.nextInt();
		double debt=(yellowcard*1000.2)+(redcard*4523.75);
		System.out.println("The player "+player+" of team "+team+" has a penalty of "+debt+" reais.");
	}

}
