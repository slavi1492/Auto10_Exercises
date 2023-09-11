package ConstructorsExceptions;

// import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exception_2 {

        private static FileWriter getFileWriter(String filePath) {
            try {
                FileWriter fileWriter = new FileWriter(filePath, true);
                return fileWriter;
            } catch (IOException f) {
                System.out.println("File not found");
            }
            return null;
        }
        protected static void closeFileWriter(FileWriter fileWriter) {
            try {
                fileWriter.close();
            } catch (IOException e1) {
                System.out.println("File is already closed");
            }
        }
        public static void printToFile(FileWriter fileWriter, String text, int repeat) {
            for (int i = 0; i < repeat; i++) {
                try {
                    fileWriter.write(text + "\n");
                } catch (IOException e) {
                    System.out.println("Nothing to write in file");
                }
            }
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String filePath = scanner.nextLine();
            int howManyTimesToPrintTheTextToFile = scanner.nextInt();
            String textToAdd = scanner.nextLine();
            printToFile(getFileWriter(filePath), textToAdd, howManyTimesToPrintTheTextToFile);
        }
}