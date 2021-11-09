import java.util.Scanner;
import java.util.Random;

public class first{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hangman game!!!");
        System.out.println("Game wil be avaliable soon!!!!");

        final String[] random_words = {"JavaScript", "Cotlin", "Java", "Python"};
        Random random = new Random();
        int index = random.nextInt(random_words.length);

        while(true){
            System.out.println(random_words[index]);
            System.out.println("Guess the word:> ");
            String word_1 = scanner.next();
            if(word_1.equals(random_words[index])){
                System.out.println("You win !!!");
                break;
            }
            else{
                System.out.println("You lose!!!!");
                continue;
            }
        }
    }
}
