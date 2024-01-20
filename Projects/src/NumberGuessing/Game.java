package NumberGuessing;

import java.util.Scanner;

public class Game {
    private int guessesLeft = 3;

    private int computerSelection(){
        int num = (int) (Math.random()*100 + 1);
        System.out.println(num);
        return num;
    }

    private int getUserGuessedNumber(){
        Scanner in = new Scanner(System.in);
        System.out.println("Pick a number between 1 - 100");
        int pick = in.nextInt();
        if ( pick <= 100 ){
            return pick;
        }
        System.out.println("Wrong Input! ");
        return  getUserGuessedNumber();
    }

    private void playGame(int generatedNumber){
        while (guessesLeft > 0){
            for ( int i=0; i<3; i++ ){
                int userNum = getUserGuessedNumber();
                if ( userNum == generatedNumber ){
                    displayWinMessage();
                    break;
                }
                else if ( userNum > generatedNumber ){
                    guessesLeft--;
                    guessLeftMessage("greater");
                }
                else {
                    guessesLeft--;
                    guessLeftMessage("lesser");
                }
            }
        }
    }

    private void guessLeftMessage(String message){
        if ( guessesLeft != 0 ){
            System.out.println("You guessing is "+message+", try again");
            System.out.println("You have "+guessesLeft+" guesses left");
            System.out.println();
        }
        else{
            displayLoseMessage();
        }
    }

    private void displayWinMessage(){
        System.out.println("==============================");
        System.out.println("Congratulations! you won");
        System.out.println("==============================");
        System.out.println();
        playAgain();
    }

    private void displayLoseMessage(){
        System.out.println("==============================");
        System.out.println("Sorry! you lost");
        System.out.println("==============================");
        System.out.println();
        playAgain();
    }

    private void playAgain(){
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want to play again? [y/n]");
        String next = in.nextLine();
        if (next.equals("y")){
            guessesLeft = 3;
            gameSimulation();
        }
        else if (next.equals("n")){
            System.out.println("Thank you for playing!");
        }
        else {
            playAgain();
        }
    }

    public void gameSimulation(){
        int generatedNumber = computerSelection();
        playGame(generatedNumber);
    }
}
