import java.util.Scanner;

public class EasterDate {

    public static boolean isValidYear(int year) {
        if(year<=1900 || year >= 2099) {
            return false;
        }
        else {
            return true;
        }
    }
    public static String dateOfEaster(int year) {
        int a = year%19;
        int b = year%4;
        int c = year%7;
        int d = (19 *a +24) %30;
        int e = (2*b+4*c+6*d)%7;
        int date = 22+d+e;
        if (isValidYear(year) == true) {
            if (year == 1954 || year == 1981 || year == 2049 || year == 2076){
                date -= 7;
            } if (date > 31) {
                int num = date - 31;
                String april = "In " + year + "Easter is on April " + num;
                return april;
            } else {
                String march = "In " + year + " Easter is on March" + date;
                return march;
            }
        } else {
            return "You have entered an invalid year";
        }
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a year between 1900 and 2099");
        int num = scan.nextInt();
        System.out.println(dateOfEaster(num));
    }

}
