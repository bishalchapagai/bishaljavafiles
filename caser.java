import java.util.Scanner;
public class caser{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        char cmd = scnr.next().charAt(0);

        char Cmd;
        switch(cmd){
            case 'o':

            System.out.println("open the file please");
            break;
            case 'c':

        System.out.println("the file must be closed")   ;
        break;
        default :

        System.out.println("please choose one option");
        break; 
    }
    }
}
