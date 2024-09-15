import java.util.Scanner;//@my name is Bishal chapagain.
public class project1 {//matching class name with file name.
    public static void main(String[] args){//declaring main method with acessidentifier public.
        Scanner input = new Scanner(System.in);//using scanner to get user input from keyword

        String userWord;//Declaring string variable

        System.out.println("Who was the first president of united states");//Asking the 1st question

        userWord = input.nextLine();//Assigning the variable with input from keyword 

        int x;//Declaring integer variable x

        if(userWord.equals("George washington")){//using ifconditionals 
            System.out.println("Correct!");
            x = 1;//if correct 1 point assigned to x variable
        }else{
            System.out.println("Incorrect!");
            x = 0;//if incorrect 0 point assigned
        }

        int states ;//Declaring states variable

        System.out.println("How many states in the united states");//asking the second question.

        states = input.nextInt();//Assigning states to user input

        int y;//Declaring y variable 

        if(states == 50){//using if conditionals
            System.out.println("Correct!");
            y = 1;//if correct assign y with 1 point
        }else{
            System.out.println("Incorrect!");
            y = 0;   //if incorrect assign y with 0
        }
        
        String tOrF;//Declaring string variable tOrF meaning true or false

        System.out.println("True or False: The sun is a Star ");//Asking the third question.

        tOrF = input.next();//Assigning userinput to the variable

        int z;//Declaring integer variable z 

        if(tOrF.equals("True")){//using if conditional.
            System.out.println("Correct!");
            z = 1;//if correct assign 1 point to z
        }else{
            System.out.println("Incorrect!");
            z = 0;//if wrong assign 0 point to z
        }

        double value;//Declaring double variable value

        System.out.println("What is the value pf pi up to 2nd decimal place?");//Asking the fourth question

        value = input.nextDouble();//Assigning userinput to double variable 

        int a;//Declariing integer variable a

        if (value == 3.15){//using if conditional
            System.out.println("Correct!");
            a = 1;//Assigning 1 point to a for correct 
        }else{
            System.out.println("Incorrect!");
            a = 0;//Assigning 0 point to integer variable if incorrect
        }

        char letter;//Declaring character variable

        System.out.println("What is the first letter of the English alphabet?");//Asking the fifth question

        letter = input.next().charAt(0);//Assigning user input to char variable

        int b;//declaring int variable

        if(letter == 'a'){//using if conditionals
            System.out.println("Correct!");
            b = 1;//Assigning variable b with 1 for correct
        }else{
            System.out.println("Incorrect!");
            b = 0;//Assigning variable b with 0 for incorrect
        }
        int sum;/*Declaring the integer variable sum for adding points gained for 
                each correct or incorrect answers*/

        sum = a + b + x + y + z;//Addition of the points given for answers

        double percentage;//Declaring double variable percentage
        percentage = (sum / 5.0) * 100;/*
                                        Arthematic operator used to find 
                                        percentage of question answer correctly
                                        */
        int percent = (int)percentage;/*
                                        Type casting double datatype into integer datatype 
                                        removing decimal points
                                        */

        System.out.printf("you got %d out of 5 right, for a score of %d%%.",sum,percent); 
        /*printing the 
        final output where formatting is used to insert integer value into the sentence
         */

    
}
}