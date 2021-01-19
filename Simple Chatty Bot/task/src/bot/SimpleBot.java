package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is Zin.");
        System.out.println("I was created in 2021.");
        System.out.println("Please, remind me your name.");

        String userName = scanner.nextLine();

        System.out.format("What a great name you have, %s!", userName);
    }
}
