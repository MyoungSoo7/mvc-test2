package lms.mvctest.was;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        new CustomWebApplicationServer(8081).start();
        System.out.println("Aa");
    }
}