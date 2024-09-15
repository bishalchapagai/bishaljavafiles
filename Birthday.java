import java.util.Scanner;

public class Birthday {
    public static void main(String[] args){

    Scanner scnr = new Scanner(System.in);

    System.out.print("when were you born: ");

    int day = scnr.nextInt();
    String month = scnr.next();
    int year = scnr.nextInt();

    System.out.println("Day: "+day);
    System.out.println("Month: "+month);
    System.out.println("Year: "+year);


    }
}
