import java.util.Scanner;//@my name is bishal chapagain
public class Heights {
    public static void main(String[] args){//This is the main method
        Scanner scnr = new Scanner(System.in);

        int feet;//It is for variable declaration
        int inches;
        
        
        System.out.print("How tall are you?(Use the form 'feet''inches'): ");
        feet = scnr.nextInt();//It is the user input
        inches = scnr.nextInt();

        int inInches;
        inInches = (feet * 12) + inches;//This is the conversion of feet into inches
        System.out.println("you are "+inInches +" inches tall.");

    double avggiraffe;
        avggiraffe = 192.0 / inInches;//This is comparision between giraffe and our height
        System.out.printf("The average girrafe is %.1f times taller than you.",avggiraffe);
        //This is output displayed in the screen
    }
}   
