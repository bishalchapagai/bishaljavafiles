import java.util.Scanner;
public class mathmatics{
    public static void main(String[] args){
    Scanner banana = new Scanner(System.in);

    double number = banana.nextDouble();
    number = Math.ceil(number);/*ceil always to upper limit
    floor always to lower limit and round according to condition
    */

    System.out.println(number);

    }

}