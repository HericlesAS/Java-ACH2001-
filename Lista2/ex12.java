import java.util.Scanner;
import java.lang.Math;

class ex12{

    static boolean checkTriangle(final int a, final int b, final int c){
        if(Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2) || Math.pow(a,2)+Math.pow(c,2)==Math.pow(b,2) || Math.pow(b,2)+Math.pow(c,2)==Math.pow(a,2)) return true;
        else return false; 

    }

    public static void main(final String[] args){
        final Scanner scan = new Scanner(System.in);
        System.out.println("Insert the three integer numbers to check if they can compose an rectangle triangle: ");
        final int a = scan.nextInt();
        final int b = scan.nextInt();
        final int c = scan.nextInt();
        System.out.println(checkTriangle(a,b,c));

    }
}