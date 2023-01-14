package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int computerScore = 0;
        int userScore = 0;

        while ( computerScore + userScore < 3) {
            String[] choicesList = {"rock", "paper", "scissors"};
            Scanner scanner = new Scanner(System.in);
            String user = scanner.nextLine();
            System.out.println("seciminiz :" + user);


            Random random = new Random();
            int index = random.nextInt(choicesList.length);
            System.out.println("Computer :" + choicesList[index]);
            String computer = choicesList[index];

            if(user.equals(computer)) {
                System.out.println("You tied");
            }
            else if (user.equals("rock") & computer.equals("paper")) {
                    System.out.println("Computer Won!");
                    computerScore ++;
            }
            else if (user.equals("rock") & computer.equals("scissors")) {
                System.out.println("You Won!");
                userScore ++;
            }
            else if (user.equals("paper") & computer.equals("rock")) {
                System.out.println("You Won!");
                userScore ++;
            }
            else if (user.equals("paper") & computer.equals("scissors")) {
                System.out.println("Computer Won!");
                computerScore ++;
            }
            else if (user.equals("scissors") & computer.equals("paper")) {
                System.out.println("User Won!");
                userScore ++;
            }
            else if (user.equals("scissors") & computer.equals("rock")) {
                System.out.println("Computer Won!");
                computerScore ++;
            }
        }
        System.out.println("Total Score :" + " " + computerScore + ":" + userScore);
        if(computerScore > userScore ){
            System.out.println("Computer Won!");
        }
        else {
            System.out.println("Congratulations! You won!");
        }





    }
}