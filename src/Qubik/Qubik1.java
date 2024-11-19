package Qubik;

import java.util.Random;
import java.util.Scanner;

public class Qubik1 {


    public static void printDcie(int side) {
        switch (side) {
            case 1:
                System.out.println("""
                        +---------+
                        |         |
                        |    #    |
                        |         |
                        +---------+
                        """);
                break;
            case 2:
                System.out.println("""
                        +---------+
                        |         |
                        |  #   #  |
                        |         |
                        +---------+
                       """);
                break;
            case 3:
                System.out.println("""
                        +---------+
                        |    #    |
                        |    #    |
                        |    #    |
                        +---------+
                      """);
                break;
            case 4:
                System.out.println("""
                         +---------+
                         |  #   #  |
                         |         |
                         |  #   #  |
                         +---------+
                        """);
                break;
            case 5:
                System.out.println("""
                          +---------+
                          |  #    # |
                          |    #    |
                          |  #    # |
                          +---------+
                        """);
                break;
            case 6:
                System.out.println("""
                         +---------+
                         |  #   #  |
                         |  #   #  |
                         |  #   #  |
                         +---------+
                        
                        """);
                break;
        }



    }
public static int rollTheDice(){
        Random random = new Random();
        int num = random.nextInt(1,7);
        return num;


    }
}




