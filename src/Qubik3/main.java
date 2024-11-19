package Qubik3;

import java.util.Random;
import java.util.Scanner;

import static Qubik.Qubik1.printDcie;
import static Qubik.Qubik1.rollTheDice;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int userTotal = 0;
        int computerTotal = 0;
        for (int i = 1; i <=3; i++) {
            System.out.println("\n Round "+i);

        System.out.println("writh number from 2 to 12");
        int y = scanner.nextInt();
        if (y < 2 || y > 12) {
            System.out.println("default number");
            return;
        }


            int qub1 = rollTheDice();
            int qub2 = rollTheDice();
            int qub3 = rollTheDice();
            int qub4 = rollTheDice();
            System.out.println("User rolls the dices ...");
            System.out.println("qubic 1");
            printDcie(qub1);
            System.out.println("qubic 2");
            printDcie(qub2);

            int x = qub1 + qub2;
            int result = x - Math.abs(x - y) * 2;
            System.out.println("On the dice feel " + x + " points");
            System.out.println("Result is  " + x + "-Math.abs(" + x + "-" + y + ")*2 :" + result + " points");
            userTotal +=result;
            System.out.println("User total = " + userTotal);

            int b = random.nextInt(2, 12);
            System.out.println("b number = " + b);
            System.out.println("Computer rolls the dices ...");
            System.out.println("qubic 1");
            printDcie(qub3);
            System.out.println("qubic 2");
            printDcie(qub4);

            int a = qub3 + qub4;
            int result2 = a - Math.abs(a - b) * 2;
            System.out.println("On the dice feel " + a + " points");
            System.out.println("Result is  " + a + "-Math.abs(" + a + "-" + b + ")*2 :" + result2+ " points");
            computerTotal += result2;
            System.out.println("Computer total = "+computerTotal);
        }
        System.out.println("User total = " + userTotal);
        System.out.println("Computer total = "+computerTotal);
        if (userTotal > computerTotal) {
            System.out.println("User win !");
        }else if (userTotal==computerTotal){
            System.out.println("draw in the game");
        }
        else {
            System.out.println("User lost !");

        }

    }
    }

