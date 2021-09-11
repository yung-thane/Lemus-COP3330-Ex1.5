/*
 *UCF COP3330 Fall 2021 Assignment 1.5 Solution
 * Copyright 2021 Ronald Lemus
 */


import java.util.Scanner;

public class SimpleMath {
    public static void main(String[] args){
        System.out.print("What is the first number? ");
        Scanner firstInp = new Scanner(System.in);
        String firstString = firstInp.nextLine();
        int firstNum = Integer.parseInt(firstString);

        System.out.print("What is the second number? ");
        Scanner secondInp = new Scanner(System.in);
        String secondString = secondInp.nextLine();
        int secondNum = Integer.parseInt(secondString);

        int add = firstNum + secondNum;
        int sub = firstNum - secondNum;
        int mult = firstNum * secondNum;
        int div = firstNum / secondNum;

        System.out.printf("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d", firstNum,secondNum,add,firstNum,secondNum,sub
        ,firstNum,secondNum,mult,firstNum,secondNum,div);

    }
}
