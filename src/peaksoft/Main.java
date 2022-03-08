package peaksoft;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (FileWriter alphabet = new FileWriter("EnglishAlphabet.txt")) {

            for (int i = 65; i < 91; i++) {
                alphabet.write((char) i + " " + (char) (i + 32) + "\n");
            }
            for (int i = 0; i < 10; i++) {
                alphabet.write(i + "\n");
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (FileReader fileReader = new FileReader("EnglishAlphabet.txt")) {
            Scanner scanner = new Scanner(fileReader);

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }










    }
}
