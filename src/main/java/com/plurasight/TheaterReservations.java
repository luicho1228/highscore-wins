package com.plurasight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args){
        //Get data from user and store it in variables
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter full name: ");
        String name = scanner.nextLine();
        String[] fullname = name.strip().split(" ");
        System.out.println("Enter date of show: (MM/dd/yyyy)");
        String showDateInput = scanner.nextLine();
        System.out.println("Enter number of tickets: ");
        int numberOfTickets = scanner.nextInt();

        //load date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate showDate = LocalDate.parse(showDateInput,formatter);

        //check if there is more than 1 ticket bought and display results
        if(numberOfTickets > 1){
            System.out.println(numberOfTickets + " tickets reserved for " + showDate.format(formatter)
                    + " under " + fullname[1] + ", " + fullname[0]);
        }else {
            System.out.println(numberOfTickets + " ticket reserved for " + showDate.format(formatter)
                    + " under " + fullname[1] + " " + fullname[0]);
        }
    }
}
