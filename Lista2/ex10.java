import java.util.Scanner;

class ex10{

    static String hurricaneClassifier(final double wind){

            if (wind<=118 && wind>=62) return "Tropical Storm";
            else if (wind<=153 && wind>=119) return "Hurricane - Category I";
            else if (wind<=177 && wind>=154) return "Hurricane - Category II";
            else if (wind<=209 && wind>=178) return "Hurricane - Category III";
            else if (wind<=249 && wind>=210) return "Hurricane - Category IV";
            else if (wind>=249) return "Hurricane - Category V";
            else return "-1";
    }

    public static void main(final String[] args) {
        final Scanner scan = new Scanner(System.in);
        System.out.println("Insert the wind speed in km/h: ");
        final double wind = scan.nextDouble();
        final String x = hurricaneClassifier(wind);
        System.out.println(x);
    }
}