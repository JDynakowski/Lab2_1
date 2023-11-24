//Zadanie 2
import java.util.Scanner;

public class Zmienne
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Deklaracja zmiennych
        int intValue;
        double doubleValue;
        char charValue;
        boolean booleanValue;

        // Wczytanie wartości
        System.out.print("Podaj wartość typu int: ");
        intValue = scanner.nextInt();
        System.out.print("Podaj wartość typu double: ");
        doubleValue = scanner.nextDouble();
        System.out.print("Podaj wartość typu char: ");
        charValue = scanner.next().charAt(0);
        System.out.print("Podaj wartość typu boolean (true/false): ");
        booleanValue = scanner.nextBoolean();

        // Konwersje i wyświetlanie
        System.out.println("Konwersja Double: " + doubleValue + " na: integer " + (int) doubleValue);
        System.out.println("Konwersja Int: " + intValue + " na: double " + (double) intValue);
        System.out.println("Konwersja Char: " + charValue + " na: integer " + (int) charValue);
        System.out.println("Konwersja Boolean: " + booleanValue + " na: String " + String.valueOf(booleanValue));
    }
}

