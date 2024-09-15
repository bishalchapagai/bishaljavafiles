import java.util.Scanner;
import java.util.Random;

public class number {
    public static void main(String[] args){
        Scanner bis = new Scanner(System.in);
        Random rand = new Random();

        int bishal = rand.nextInt(26)+97;
        char ram = (char)bishal;
        boolean isCorrect = false;

        char guess;
        System.out.println("can you guess correct random number?");

        guess = bis.next().charAt(0);

        if(guess == ram){
            System.out.println("you are great");
            isCorrect = true;
        }else if (guess < ram){
            System.out.println("Guess little higher");
        }
        else if(guess > ram){
            System.out.println("Guess little lower");
        }
        else{
            System.out.println("guess again");
        }

        if(!isCorrect){
            System.out.println("youhave won");

            guess = bis.next().charAt(0);

            if(guess == ram){
                System.out.println("you are great");
                isCorrect = true;
            }else if (guess < ram){
                System.out.println("Guess little higher");
            }
            else if(guess > ram){
                System.out.println("Guess little lower");
            }
            else{
                System.out.println("guess again");
            }}

            if(!isCorrect){
                System.out.println("Try again ");
    
                guess = bis.next().charAt(0);
    
                if(guess == ram){
                    System.out.println("you are great");
                    isCorrect = true;
                }else if (guess < ram){
                    System.out.println("Guess little higher");
                }
                else if(guess > ram){
                    System.out.println("Guess little lower");
                }
                else{
                    System.out.println("guess again");
                }

                if(!isCorrect){
                    System.out.println("please try again");
        
                    guess = bis.next().charAt(0);
        
                    if(guess == ram){
                        System.out.println("you are great");
                        isCorrect = true;
                    }else if (guess < ram){
                        System.out.println("Guess little higher");
                    }
                    else if(guess > ram){
                        System.out.println("Guess little lower");
                    }
                    else{
                        System.out.println("guess again");
                    }}

                    if(!isCorrect){
                        System.out.println("you have lost the battle");
                    }
            }
            
        }
    }

    

