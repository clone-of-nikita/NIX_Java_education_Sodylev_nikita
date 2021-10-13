import java.util.Scanner;

import jdk.javadoc.internal.doclets.toolkit.taglets.ReturnTaglet;

import java.util.Date;
public class day_4{
    public static void main(String[] args) {
        Date date = new Date();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello!My name is Igor");
        System.out.println("I was created in " + date+".");

        System.out.println("Please, remind me your name.");
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + ".");

        System.out.println("Now i will prove to you that i can count to any number you want. ");
        Integer number = scanner.nextInt();
        for(int i = 0;i <= number;i++){
            System.out.println(i+ "!");
        }
        System.out.println("Leg me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3,5,7.");
        Integer remainder3 = scanner.nextInt();
        Integer remainder5 = scanner.nextInt();
        Integer remainder7 = scanner.nextInt();
        Integer age = ((remainder3*70 + remainder5*21+remainder7*15)%105);
        System.out.printf("Your age is " + age +";that`s good time to start programming");

        System.out.println("Lets test your programming knowledge.");
        System.out.println("Why you we use metods?");
        System.out.println("1.To repeat a statemant multiple times.");
        System.out.println("2.To decompromise a program into several small subroutines.");
        System.out.println("3.To determine the execution time of a program.");
        System.out.println("4.To interrupt the execution of a program.");
        Integer num = scanner.nextInt();

    }
}