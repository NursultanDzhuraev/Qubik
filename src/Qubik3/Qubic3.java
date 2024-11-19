package Qubik3;

import java.util.Random;

public class Qubic3 {  public static void printDcie(int side) {
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

    public static int rollTheDice() {
        Random random = new Random();
        int num = random.nextInt(1, 7);
        return num;
    }
    public static boolean cheated(int san){
    Random random = new Random();
    int prosent = random.nextInt(100);
    int getCheated = 0;
    switch (san){
        case 1:
            getCheated = 50;
            break;
        case 2:
            getCheated = 25;
            break;
        case 3:
            getCheated = 16;
            break;
    }
    return prosent < getCheated;
    }
}


