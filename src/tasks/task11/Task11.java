package tasks.task11;

import exceptions.OperationNotFoundException;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("Scanner:");
        Scanner scanner = new Scanner(System.in);
        Integer num1 = Integer.parseInt(scanner.nextLine());
        Integer num2 = Integer.parseInt(scanner.nextLine());
        String str = scanner.nextLine();

        System.out.println("if else");
        if (!str.equals("add") && !str.equals("sub")) {
            throw new OperationNotFoundException(" bad operation ");
        } else {
            System.out.println("Operation correct");
        }

        System.out.println("switch");
        switch(str) {
            case "add":
                System.out.println(num1 + num2);
                break;
            case "sub":
                System.out.println(num1-num2);
                break;
        }

        System.out.println("for");
        for(int i = 0; i < num1; i++) {
            System.out.println(num2 - i);
        }

        System.out.println("while");
        while(num1 < 10) {
            System.out.println(num1);
            num1++;
        }
        System.out.println("do while");
        do {
            System.out.println(num2);
            num2++;
        } while (num2 < 10);

        System.out.println("var");
        var a = "";
        System.out.println(a.getClass());
    }
}
