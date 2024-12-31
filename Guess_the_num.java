import java.util.*;
public class Guess_the_num {

    public int game(){

        int Attempts=0;
        
        Scanner scanner=new Scanner(System.in);
        Random random = new Random() ;
        int compinput=random.nextInt(100)+1;

        while(true){

          
            System.out.println("GUESS THE NUMBER BETWEEN 1 TO 100");
            int userinput=scanner.nextInt();


            if(userinput < compinput){
                System.out.println(" GUESSED NUMBER IS SMALLER !!!");
                Attempts++;
            }

            else if(userinput > compinput){
                System.out.println("GUESSED NUMBER IS LARGER!!!!");
                Attempts++;
            }

            if(userinput == compinput){
                System.out.println("YOU WIN!!!");
                Attempts++;
                break;
            }

           
        }

        
        if(Attempts >=10){

            System.out.println("THE ACTUAL NUMBER IS:" + " " +compinput);

        }
        return Attempts;


    }

    public static void main(String[] args) {

        Guess_the_num obj = new Guess_the_num();
        int Attempts=obj.game();
        System.out.println("NUMBER OF ATTEMPTS:" +" " +Attempts);
        
    }


}
