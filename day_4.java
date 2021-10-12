import java.util.Scanner;
import java.util.Date;
public class day_4{
    public static void main(String[] args) {
        Date date = new Date();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello!My name is Igor");
        System.out.printf("I was created in " + date);

        System.out.println("Please, remind me your name.");
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + ".");

        System.out.println("Now i will prove to you that i can count to any number you want. ");
        Integer number = scanner.nextInt();
        for(int i = 0;i <= number;i++){
            System.out.println(i+ "!");
        }
    }
}