package com.plurasight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter game score in the following format (Home:Visitor|21:9)");
        String scoreInput = scanner.nextLine();
        String[] inputList = scoreInput.split("\\|");
        String[] homeAwayList = inputList[0].split(":");
        String[] scoreList = inputList[1].split(":");
        int homeScore = Integer.parseInt(scoreList[0]);
        int awayScore = Integer.parseInt(scoreList[1]);
        if(homeScore > awayScore){
            System.out.println("Winner: " + homeAwayList[0]);
        } else if (awayScore > homeScore) {
            System.out.println("Winner: " + homeAwayList[1]);
        }
        else{System.out.println("Is a thigh!");
        }
        }

    }
