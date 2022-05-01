import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WPM_Counter {
    private static final int AVERAGE_WORD_PER_MINUTE = 5;
    static String[] words = {"ActionScript", "ActiveRecord", "AIM", "Ajax", "Algol", "Amazon", "Angular", "Apache", "AppleScript",
            "AppStream", "ASPnet", "AutoHotKey", "AWS", "Backbone", "BASIC", "Bootstrap", "Bower", "Browserify"};

    public static void main(String[] args) throws InterruptedException {
        // Initial application start timer
        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);

        // Using a random number generator to get a word from the words array
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.print(words[rand.nextInt(17)] + " ");
        }
        System.out.println();

        // Getting start time
        double startTime = LocalTime.now().toNanoOfDay();

        // Getting users input after they pressed enter
        Scanner scanner = new Scanner(System.in);
        String typedWords = scanner.nextLine();

        // Getting the program end time
        double endTime = LocalTime.now().toNanoOfDay();

        // Calculate the elapsed time
        double elapsedTime = endTime - startTime;
        double seconds = elapsedTime / 1000000000.0;

        /**
         * Calculating the words per minute
         * Using formula
         * (x characters / 5) / 1 min = y WPM
         */
        int numberOfChars = typedWords.length();
        int wordsPerMinute = (int) ((((double) numberOfChars / AVERAGE_WORD_PER_MINUTE) / seconds) * 60);

        System.out.println("Your WPM is " + wordsPerMinute + "!");
    }
}
