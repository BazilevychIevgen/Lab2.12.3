package edu.brainacad;

import java.util.Scanner;

/**
 * Created by Admin on 09.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        for (MyDayOfWeek lol : MyDayOfWeek.values()) {
            switch (lol) {

                case SUNDAY:
                    System.out.println("My java day:" + lol);
                    break;
                case MONDAY:
                    System.out.println("My java day:" + lol);
                    break;
                case TUESDAY:
                    System.out.println("My java day:" + lol);
                    break;
                case WEDNESDAY:
                    System.out.println("My java day:" + lol);
                    break;
                case THURSDAY:
                    System.out.println("My java day:" + lol);
                    break;
                case FRIDAY:
                    System.out.println("My java day:" + lol);
                    break;
                case SATURDAY:
                    System.out.println("My java day:" + lol);


            }
        }
        Scanner scan = new Scanner(System.in);
        String day = scan.nextLine();

        System.out.println(MyDayOfWeek.valueOf(day).nextDay());
    }

}