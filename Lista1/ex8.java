
import java.util.Scanner; 

class ex8{
	public static void main(String args[]){
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Insert the a,b,c parameters: ");
	  double a= scan.nextDouble();
	  double b= scan.nextDouble();
	  double c=scan.nextDouble();
	  double delta=Math.pow(b,2)-(4*a*c);
	  if (delta>0){
	    double solution1=(-b+Math.sqrt(delta)/(2*a));
	    double solution2=(-b-Math.sqrt(delta)/(2*a));
	    System.out.println("The roots are " + solution1 + " and "+ solution2);
	  }
	  else if(delta==0){
	    double solution1=(-b/(2*a));
	    System.out.println("The roots are "+ solution1);
	  }
	  else{
	    System.out.println("There are no real roots");
	  }
	  
	    
	 }

 }
