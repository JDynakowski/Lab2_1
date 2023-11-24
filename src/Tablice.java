//Zadanie 3
import java.util.Arrays;
import java.util.stream.IntStream;

public class Tablice {
    public static void main(String[] args) {
        // Przykładowe tablice
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        // Sumowanie bez pętli
        int sum1 = Arrays.stream(array1).sum();
        int sum2 = Arrays.stream(array2).sum();
        System.out.println("\nSuma tablicy 1: " + sum1);
        System.out.println("Suma tablicy 2: " + sum2);

        // Maksimum i minimum bez pętli
        int max1 = Arrays.stream(array1).max().orElse(Integer.MIN_VALUE);
        int min1 = Arrays.stream(array1).min().orElse(Integer.MAX_VALUE);
        int max2 = Arrays.stream(array2).max().orElse(Integer.MIN_VALUE);
        int min2 = Arrays.stream(array2).min().orElse(Integer.MAX_VALUE);
        System.out.println("\nArray 1: MAX: " + max1 + " MIN: " + min1);
        System.out.println("Array 2: MAX:  " + max2 + " MIN: " + min2);

        // Średnia w obu tablic
        double average1 = Arrays.stream(array1).average().orElse(Double.NaN);
        double average2 = Arrays.stream(array2).average().orElse(Double.NaN);
        System.out.println("\nŚrednia tablicy 1: " + average1);
        System.out.println("Średnia tablicy 2: " + average2);

        // Kopiowanie tablic 1 i 2
        int[] copyOfArray1 = Arrays.copyOf(array1, array1.length);
        int[] copyOfArray2 = Arrays.copyOf(array2, array2.length);

        // Wybieranie elementów spełniających kryterium w tab 1 >3, w tab 2 <9
        int[] filteredArray1 = Arrays.stream(array1).filter(x -> x > 3).toArray();
        int[] filteredArray2 = Arrays.stream(array2).filter(x -> x < 9).toArray();

        // Usuwanie elementu
        int[] arrayWithoutElement1 = IntStream.range(0, array1.length)
                .filter(i -> i != 2)
                .map(i -> array1[i])
                .toArray();

        // Łączenie tablic 1 & 2
        int[] combinedArray = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).toArray();

        // Zliczanie wystąpień wartości 8 w tab 2
        long count = Arrays.stream(array2).filter(x -> x == 8).count();
        System.out.println("\nLiczba wystąpień wartości 8 w tablicy 2: " + count);
    }
}
