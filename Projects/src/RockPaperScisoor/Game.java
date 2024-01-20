package RockPaperScisoor;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Game {

    //Variables
    private String computerSelection;
    private String playerSelection;
    private int playerWonTimes = 0;
    private int computerWonTimes = 0;
    private int totalGamesPlayed = 0;
    private String[] selection = {"Rock", "Paper", "Scissor"};

    //get the computerSelection
    public String getComputerSelection(){
        Random random = new Random();
        int randomIndex = random.nextInt(selection.length);
        //System.out.println(randomIndex);
        return selection[randomIndex];
    }

    //get the playerSelection
    public String getPlayerSelection(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your selection: [rock/paper/scissor]");
        String input = in.nextLine().toLowerCase();
        if (input.equals("rock") || input.equals("paper") || input.equals("scissor")) {
            return input;
        }
        System.out.println("Wrong Input!");
        return getPlayerSelection();
    }

    private void display(int computerWonTimes, int playerWonTimes, String computerSelection){
        System.out.println("-------------------------------------------");
        System.out.println("Computer selection is: "+ computerSelection);
        System.out.println("Your score: "+playerWonTimes);
        System.out.println("Computer score: "+ computerWonTimes);
        System.out.println("--------------------------------------------");
        System.out.println();
    }

    private void displayWinner(int computerWonTimes, int playerWonTimes, int totalGamesPlayed){
        System.out.println("===============================================");
        System.out.println("Total games played: "+totalGamesPlayed);
        System.out.println("Total times you won: "+playerWonTimes);
        System.out.println("Total times computer won: "+computerWonTimes);
        if ( playerWonTimes > computerWonTimes ){
            System.out.println("Congratulations! You Won ");
            System.out.println("===========================================");
        }
        else if (playerWonTimes < computerWonTimes){
            System.out.println("Sorry! You lost the game");
            System.out.println("===========================================");
        }
        else{
            System.out.println("Match drawn!");
            System.out.println("===========================================");
        }
        askToPlayAgain();
    }

    private void askToPlayAgain(){
        Scanner in = new Scanner(System.in);
        System.out.println("Do you want to play again? [y/n]");
        String input = in.nextLine().toLowerCase();
        if (input.equals("y")){
            totalGamesPlayed = 0;
            playerWonTimes = 0;
            computerWonTimes = 0;
            gameSimulation();
        }
        else if (input.equals("n")){
            System.out.println("Thank you for playing!");
        }
        else{
            System.out.println("Wrong Input!");
            askToPlayAgain();
        }
    }

    public void gameSimulation(){
        while ( totalGamesPlayed < 5 ){
            playerSelection = getPlayerSelection().toLowerCase();
            computerSelection = getComputerSelection().toLowerCase();
            switch (playerSelection) {
                case "rock" -> {
                    if (computerSelection.equals("paper")) {
                        computerWonTimes += 1;
                        display(computerWonTimes, playerWonTimes, computerSelection);
                    } else if (computerSelection.equals("scissor")) {
                        playerWonTimes += 1;
                        display(computerWonTimes, playerWonTimes, computerSelection);
                    } else {
                        display(computerWonTimes, playerWonTimes, computerSelection);
                    }
                }
                case "paper" -> {
                    if (computerSelection.equals("scissor")) {
                        computerWonTimes += 1;
                        display(computerWonTimes, playerWonTimes, computerSelection);
                    } else if (computerSelection.equals("rock")) {
                        playerWonTimes += 1;
                        display(computerWonTimes, playerWonTimes, computerSelection);
                    } else {
                        display(computerWonTimes, playerWonTimes, computerSelection);
                    }
                }
                case "scissor" -> {
                    if (computerSelection.equals("paper")) {
                        playerWonTimes += 1;
                        display(computerWonTimes, playerWonTimes, computerSelection);
                    } else if (computerSelection.equals("rock")) {
                        computerWonTimes += 1;
                        display(computerWonTimes, playerWonTimes, computerSelection);
                    } else {
                        display(computerWonTimes, playerWonTimes, computerSelection);
                    }
                }
            }
            totalGamesPlayed ++;
        }
        displayWinner(computerWonTimes, playerWonTimes, totalGamesPlayed);
    }

}
