package Qubik;

import java.util.Random;
import java.util.Scanner;

import static Qubik.Qubik1.rollTheDice;
import static Qubik.Qubik1.printDcie;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(rollTheDice());
        System.out.println("writh number from 2 to 12");
        int y = scanner.nextInt();
        if (y < 2 || y > 12) {
            System.out.println("default number");
            return;
        }

        int qub1 = rollTheDice();
        int qub2 = rollTheDice();


        System.out.println("qubic 1");
        printDcie(qub1);
        System.out.println("qubic 2");
        printDcie(qub2);

        int x = qub1 + qub2;
        int result = x - Math.abs(x - y) * 2;
        System.out.println("On the dice feel " + x + " points");
        System.out.println("Result is  " + x + "-Math.abs(" + x + "-" + y + ")*2 :" + result + " points");

        if (result > 0) {
            System.out.println("User win !");
        } else {
            System.out.println("User lost !");

        }
    }
}


