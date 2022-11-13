package laba8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RunFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try(FileWriter writer = new FileWriter("D:\\java\\num1\\src\\laba8\\text.txt", true)){
            String s;
            s = scanner.nextLine();
            writer.write(s);
            writer.append("\n");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
