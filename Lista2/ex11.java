import java.util.Scanner;

class ex11{

    static boolean isDivisible(int a, int b){
        if(a%b==0 && b!=0) return true;
        else return false;

    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insert the two integer numbers to check if the last is divisor of the first: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(isDivisible(a,b));

    }
}