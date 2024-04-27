package extra;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input for the dimensions of the array
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
        
        // Creating the 2D array
        int[][] arr = new int[rows][columns];
        
        // Taking input for each element of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        
        // Printing the array
        System.out.println("Array elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
        
        scanner.close(); // Closing the scanner
    }
}

