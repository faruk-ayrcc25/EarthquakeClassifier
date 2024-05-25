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
    public static String findClassifier(double magnitude) {
        if (magnitude < 2.0) {
            return "Micro - Micro";
        } else if (magnitude >= 2.0 && magnitude < 3.0) {
            return "Very minor - Very small";
        } else if (magnitude >= 3.0 && magnitude < 4.0) {
            return "Minor - Small";
        } else if (magnitude >= 4.0 && magnitude < 5.0) {
            return "Light - Light";
        } else if (magnitude >= 5.0 && magnitude < 6.0) {
            return "Moderate - Moderate";
        } else if (magnitude >= 6.0 && magnitude < 7.0) {
            return "Strong - Strong";
        } else if (magnitude >= 7.0 && magnitude < 8.0) {
            return "Major - Major";
        } else if (magnitude >= 8.0 && magnitude < 10.0) {
            return "Great - Great";
        } else {
            return "Meteoric - Meteoric";
        }
    }

}

