package com.noirix;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StreamTest {
    public static void main(String[] args) {

        try(Scanner inputFromKeyboard = new Scanner(System.in)) {

            String resultFromKeyboard = "";

            System.out.println("Enter some words:");
            if (inputFromKeyboard.hasNextLine()) {
                resultFromKeyboard = inputFromKeyboard.nextLine();
                System.out.println(resultFromKeyboard);
            }


            FileWriter fileWriter = new FileWriter("C:\\Users\\Noirix\\Desktop\\text.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);

            printWriter.println(resultFromKeyboard);

//            String s = "Some, String, haha, qweqwe";
//            String[] split = s.split(",");
//
//            for (String s1 : split) {
//                System.out.println(s1.trim().toLowerCase());
//            }
            printWriter.close();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
