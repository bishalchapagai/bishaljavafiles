import java.util.Random;
import java.util.Scanner;

public class code {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        Random bishal = new Random();

        int ram = bishal.nextInt(26)+97;
        char randcharacter = (char)ram;
        char guess;
        boolean isguesscorrect = false;

        System.out.println("Guess your letter");

        guess = scnr.next().charAt(0);


        if(randcharacter == guess ){
        
            System.out.println("you have won!");
            isguesscorrect = true;
        }
        else if (randcharacter < guess){
            
            System.out.println("get to something earlier");
        }
        else if (randcharacter > guess){
            
            System.out.println("you can guess little higher");
        }
        else{
            System.out.print("try again");
            
        }


        if(!isguesscorrect){

            System.out.println("you can try again");

            guess = scnr.next().charAt(0);


        if(randcharacter == guess ){
            
            System.out.println("you have won!");
            isguesscorrect = true;
        }
        else if (randcharacter < guess){
            
            System.out.println("get to something earlier");
        }
        else if (randcharacter > guess){
            
            
            System.out.println("you can guess little higher");
        }

        else{
            System.out.print("try again");
            
            }}


        if(!isguesscorrect){
            
            System.out.println("you can try again");

            guess = scnr.next().charAt(0);
        
        if(randcharacter == guess ){
            
            System.out.println("you have won!");
            isguesscorrect = true;
        }
        else if (randcharacter < guess){
        
            System.out.println("get to something earlier");
        }
        else if (randcharacter > guess){
            
            System.out.println("you can guess little higher");
        }
        else{
            System.out.print("try again");
            
        }}


        if(!isguesscorrect){

            System.out.println("you can try again");
            
            guess = scnr.next().charAt(0);

            if(randcharacter == guess ){
                
                System.out.println("you have won!");
                isguesscorrect = true;
            }
            else if (randcharacter < guess){
                
                System.out.println("get to something earlier");
            }
            else if (randcharacter > guess){
                
                System.out.println("you can guess little higher");
            }
            else{
                
                System.out.print("try again");
                
            }

            if(!isguesscorrect){
                
                System.out.println("you can try again");
                
                guess = scnr.next().charAt(0);

                if(randcharacter == guess ){
                
                    System.out.println("you have won!");
                    isguesscorrect = true;
                }
                else if (randcharacter < guess){
                    
                    System.out.println("get to something earlier");
                }
                else if (randcharacter > guess){
                    
                    System.out.println("you can guess little higher");
                }
                else{
                    System.out.print("try again");
                    
            }}

        }
    }

        

    }

