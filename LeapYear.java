import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a year: ");
        int inputYear = Integer.valueOf(scan.nextInt());

        if(((inputYear % 4 == 0) && (inputYear % 100 != 0)) || (inputYear % 400 == 0)){
            System.out.println("The year is a leap year.");
        }else {
            System.out.println("The year is not a leap year.");
        }

    }
}
