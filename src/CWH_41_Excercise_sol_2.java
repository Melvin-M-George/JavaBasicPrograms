import java.util.Scanner;
import java.util.Random;
public class CWH_41_Excercise_sol_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper and 2 for Scissor");
        int UserInput = sc.nextInt();

        Random random = new Random();
        int ComputerInput = random.nextInt(3);

        if(ComputerInput==0){
            System.out.println("Computer Choice: Rock");
        }if(ComputerInput==1){
            System.out.println("Computer Choice: Paper");
        }if(ComputerInput==2){
            System.out.println("Computer Choice: Scissor");
        }

        if(UserInput==ComputerInput){
            System.out.println("Draw, Play again!");
        }
        else if (UserInput==0 && ComputerInput==2 || UserInput==1 && ComputerInput==0 ||
                UserInput==2 && ComputerInput==1) {
            System.out.println("You Win!!");
        }
        else{
            System.out.println("Computer Win!!");
        }



    }

}
