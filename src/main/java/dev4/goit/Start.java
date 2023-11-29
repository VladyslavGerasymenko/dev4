package dev4.goit;

import java.util.Scanner;

public class Start {

    public void start() {
        Convector convector = new Convector();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.nextLine();
            if (str.equalsIgnoreCase("Close")) {
                break;
            }
            StringBuilder result = convector.convert(str.toLowerCase());
            System.out.println(result);
        }
    }
}
