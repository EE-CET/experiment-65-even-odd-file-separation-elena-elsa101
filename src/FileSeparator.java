import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileSeparator {
    public static void main(String[] args) {
        // Step 1: Read from numbers.txt and separate into even.txt and odd.txt
        // Hint: Use Scanner to read from the file and PrintWriter to write to files.
        try {
            // TODO: Initialize Scanner for numbers.txt
            Scanner sc = new Scanner(new File("numbers.txt"));
            
            // TODO: Initialize PrintWriter for even.txt and odd.txt
            PrintWriter evenWriter = new PrintWriter("even.txt");
            PrintWriter oddWriter = new PrintWriter("odd.txt");
            
            // TODO: Loop through the input file, check if numbers are even or odd, and write to respective files
            while (sc.hasNextInt()) {
                int num = sc.nextInt();
                if (num % 2 == 0) {
                    evenWriter.print(num + " ");
                } else {
                    oddWriter.print(num + " ");
                }
            }
            
            // TODO: Close all resources (Scanner and both PrintWriters) to save the files properly
            sc.close();
            evenWriter.close();
            oddWriter.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Error processing files.");
        }

        // Step 2: Read and display even.txt
        System.out.print("Even File: ");
        // TODO: Read even.txt and print its contents on a single line
        try {
            Scanner scEven = new Scanner(new File("even.txt"));
            while (scEven.hasNext()) {
                System.out.print(scEven.next() + " ");
            }
            scEven.close();
        } catch (FileNotFoundException e) {
            System.out.print("");
        }
        System.out.println();

        // Step 3: Read and display odd.txt
        System.out.print("Odd File: ");
        // TODO: Read odd.txt and print its contents on a single line
        try {
            Scanner scOdd = new Scanner(new File("odd.txt"));
            while (scOdd.hasNext()) {
                System.out.print(scOdd.next() + " ");
            }
            scOdd.close();
        } catch (FileNotFoundException e) {
            System.out.print("");
        }
        System.out.println();
    }
}
