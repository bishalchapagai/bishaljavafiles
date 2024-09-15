import java.util.Scanner;
public class oper {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int ram = scnr.nextInt();
        String ramesh = (ram >= 90 &&  ram<=100) ? "A+" : "not a A+";
        System.out.println(ramesh);
    }
    
}
