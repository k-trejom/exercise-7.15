import java.util.Scanner;
import java.util.Arrays;

public class EliminateDuplicates {
    public static int[] eliminateDuplicates(int[] list) {
        return Array.stream(list)
        .distinct()
        .toArray();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] numbers = new int[10];
        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        int[] uniqueNumbers = eliminateDuplicates(numbers);
        System.out.println("The distint numbers are: ");
        for (int number : uniqueNumbers) {
            System.out.println(number + " ");
        }
    }
}
//110924_TrejoKevin_Exercise7.15