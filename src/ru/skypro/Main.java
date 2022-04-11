package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // Задача 1.1

        int[] massiveOne = new int[]{1, 2, 3};
        for (int i = 0; i < massiveOne.length; i++)
            if (i == massiveOne.length - 1) {
                System.out.print(massiveOne[i]);
            } else {
                System.out.print(massiveOne[i] + ", ");
            }
        System.out.print("\n");
        //Задача 1.2
        double[] massiveTwo = {1.57, 7.654, 9.986};
        for (int a = 0; a < massiveTwo.length; a++)
            if (a == massiveTwo.length - 1) {
                System.out.print(massiveTwo[a]);
            } else {
                System.out.print(massiveTwo[a] + ", ");
            }
        System.out.print("\n");

        //Задача 1.3
        int[] massiveThree = new int[8];
        massiveThree[0] = 15;
        massiveThree[1] = 10;
        massiveThree[2] = 11;
        massiveThree[3] = 18;
        massiveThree[4] = 3;
        massiveThree[5] = 12;
        massiveThree[6] = 9;
        for (int f = 0; f < massiveThree.length; f++)
            if (f == massiveThree.length - 1) {
                System.out.print(massiveThree[f]);
            } else {
                System.out.print(massiveThree[f] + ", ");
            }
        System.out.println("\n");

        //Задача 3
        for (int i = massiveOne.length - 1; i >= 0; i--)
            if (i == massiveOne.length - 1 || i == massiveTwo.length - 2) {
                System.out.print(massiveOne[i] + ",");
            } else {
                System.out.print(massiveOne[i]);
            }
        System.out.println("\n");

        for (int a = massiveTwo.length - 1; a >= 0; a--) {
            if (a == massiveTwo.length - 1 || a == massiveTwo.length - 2) {
                System.out.print(massiveTwo[a] + ",");
            } else {
                System.out.print(massiveTwo[a]);
            }
        }
        System.out.println("\n");

        for (int f = massiveThree.length -1 ; f >=0 ; f--) {
            if (f == 0) {
                System.out.print(massiveThree[f]);
            } else {
                System.out.print( massiveThree[f] + ", ");
            }
        }

        System.out.println("\n");
    //Задание 4
        for (int i = 0; i < massiveOne.length; i++) {
            if (massiveOne[i]% 2 != 0) {
                massiveOne[i] = massiveOne[i] +1;
            } else if (massiveOne[i] % 2 ==0 ) {
            }
                System.out.print(massiveOne[i] + ",");

        }

    }
}
