package com.company;


import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){

       Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int money;

       String sign1, sign2, sign3;

       int randomNumber1 = random.nextInt(5);
       int randomNumber2 = random.nextInt(5);
       int randomNumber3 = random.nextInt(5);

       switch (randomNumber1)
       {
           case 0:
               sign1 = "Cherries";
               break;

           case 1:
               sign1 = "Oranges";
               break;

           case 2:
               sign1 = "Plums";
               break;

           case 3:
               sign1 = "Bells";
               break;

           case 4:
               sign1 = "Melons";
               break;

           case 5:
               sign1 = "Bars";
               break;

           default:
               sign1 = "slot machine";
               break;
       }

        switch (randomNumber2)
        {
            case 0:
                sign2 = "Cherries";
                break;

            case 1:
                sign2 = "Oranges";
                break;

            case 2:
                sign2 = "Plums";
                break;

            case 3:
                sign2 = "Bells";
                break;

            case 4:
                sign2 = "Melons";
                break;

            case 5:
                sign2 = "Bars";
                break;

            default:
                sign2 = "slot machine";
                break;

        }

        switch (randomNumber3)
        {
            case 0:
                sign3 = "Cherries";
                break;

            case 1:
                sign3 = "Oranges";
                break;

            case 2:
                sign3 = "Plums";
                break;

            case 3:
                sign3 = "Bells";
                break;

            case 4:
                sign3 = "Melons";
                break;

            case 5:
                sign3 = "Bars";
                break;

            default:
                sign3 = "slot machine";
                break;
        }

        do
            {
            System.out.println("Enter amount of money into slot machine");
            money = scanner.nextInt();

            if (sign1.equals(sign2) && sign1.equals(sign3))
            {
                money *= 3;
                System.out.println("You win triple amount!");
                System.out.println("$" + money);

            }
            else if (sign2.equals(sign1) && sign2.equals(sign3))
            {
                money *= 3;
                System.out.println("You win triple amount!");
                System.out.println("$" + money);
            }
            else if (sign3.equals(sign1) && sign3.equals(sign2))
            {
                money *= 3;
                System.out.println("You win triple amount!");
                System.out.println("$" + money);
            }
            else if (sign1.equals(sign2) || sign1.equals(sign3))
            {
                money *= 2;
                System.out.println("You win double amount!");
                System.out.println("$" + money);
            }
            else if(sign2.equals(sign1) || sign2.equals(sign3))
            {
                money *= 2;
                System.out.println("You win double amount!");
                System.out.println("$" + money);
            }
            else if (sign3.equals(sign1) || sign3.equals(sign1))
            {
                money *= 2;
                System.out.println("You win double amount!");
                System.out.println("$" + money);
            }
            else
            {
                System.out.println("You won $0");
            }

            System.out.println("Do you want to play again?");
        }
        while (scanner.next().equalsIgnoreCase("yes"));
    }
}