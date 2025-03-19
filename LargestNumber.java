import java.util.Scanner;

class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int largest = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > largest)
                largest = arr[i];
        System.out.println("Largest number: " + largest);
        sc.close();
    }
}