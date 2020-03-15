import java.util.Scanner; 
class ex7{
	static public double dothePhysics(){
                Scanner scan = new Scanner(System.in);
		System.out.println("Insert the heigth of the object: ");
                double height=scan.nextDouble();
                System.out.println("Insert the value of gravity: ");
		double gravity=scan.nextDouble();
		double time=Math.sqrt(Math.abs(height)*2/gravity);
		return time;
	}
	static public void main(String args[]){
		System.out.println(dothePhysics());
	}
}

