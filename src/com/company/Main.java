package com.company;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("Alphabet.txt")) {
            for (int i = 0; i < 26; i++) {
                writer.append(String.valueOf((char)('A' + i)));
                writer.append(String.valueOf((char)('a' + i))).append('\n');
            }
            for (int i = 0; i <= 9; i++) {
              writer.write(i + "\n");
            }
        } catch(IOException e){
            e.printStackTrace();
        }


        try(FileReader reader = new FileReader("Alphabet.txt")) {
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
             e.printStackTrace();
        }
    }
}