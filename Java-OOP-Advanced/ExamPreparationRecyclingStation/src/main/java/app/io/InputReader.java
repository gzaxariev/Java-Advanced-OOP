package app.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputReader implements Reader {

    private Scanner scanner;

    public InputReader(Scanner scanner) {
        this.scanner = new Scanner(System.in) ;
    }

    @Override
    public String readLine() {
        return scanner.nextLine();
    }
}
