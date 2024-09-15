import java.util.Scanner;
public class toll2project {
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        int timeHour;
        int timeMinute;
        int typeOfDay;
        int numPeople;
        int inputColon;
        String userInput;
        double tollAmount;

        System.out.print("Enter the time in hour:miute format");

        userInput = scnr.nextLine();
        inputColon = userInput.indexOf(":");
        timeHour = Integer.parseInt(userInput.substring(0, inputColon));
        timeMinute = Integer.parseInt(userInput.substring(inputColon+1,userInput.length()));

        System.out.println("What type of day is this weekday or weekend");
        typeOfDay = scnr.nextInt();

        if(typeOfDay == 0){if(timeHour < 6){
            tollAmount = 1.55;}
            else if(timeHour < 10){
                tollAmount = 4.65;
            }
            else if (timeHour < 18){
                tollAmount = 2.35;
            }
            else if (timeHour > 18){
                tollAmount = 1.55;
            }
            else{
                if(timeHour < 8){
                    tollAmount = 1.55;
                }
                else if(timeHour < 12){
                    tollAmount = 3.05;
                }
                else if(timeHour < 16){
                    tollAmount = 3.45;
                }
                else if(timeHour < 19){
                    tollAmount = 3.60;
                }
                else if(timeHour <22){
                    tollAmount = 3.05;
                }
                    else if(timeHour>22){
                        tollAmount = 1.55;
                    }

                    System.out.print("How many people are there:");
                    numPeople = scnr.nextInt();

                    if(numPeople > 3){
                        if((typeOfDay == 0) && (timeHour < 6)){
                            tollAmount = tollAmount * 0.5;
                        }
                        else if((typeOfDay == 1)&&(timeHour <= 10)){
                            tollAmount = tollAmount*0.5;
                        }
                        else{
                            tollAmount = tollAmount;
                        }
                            
                        }
                        
                    }
                }

            }
        }
            

        

    
    

