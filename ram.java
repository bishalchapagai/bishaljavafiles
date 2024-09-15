import java.util.Scanner;
public class ram {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int a;
        int b;
        int c;

        a = scnr.nextInt();
        b = scnr.nextInt();
        

        if(a<0 || b<0){
            System.out.print("you cannot do this thing");
        }
        else if (a>99 || b>99 ){
            System.out.print("you cannot perform that operation");
        }
        else{
            c = a+b;
            System.out.print("the sum is: "+c);
        }
    }

    
}
