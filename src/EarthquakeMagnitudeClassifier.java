package src;

import java.util.Scanner;

public class EarthquakeMagnitudeClassifier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the magnitude of the earthquake: ");
        double magnitude = scanner.nextDouble();

        String classifier = findClassifier(magnitude);
        System.out.println(classifier);
    }


}

