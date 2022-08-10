package org.example;

import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        ReadFile_Array();
    }

    private static void ReadFile_String()
    {
        String filePath = "src/main/java/Data/Subjects.txt";
        // Declaring object of StringBuilder class
        StringBuilder builder = new StringBuilder();

        // try block to check for exceptions where
        // object of BufferedReader class us created
        // to read filepath
        try (BufferedReader buffer = new BufferedReader(
                new FileReader(filePath))) {

            String str;

            // Condition check via buffer.readLine() method
            // holding true upto that the while loop runs
            while ((str = buffer.readLine()) != null) {

                builder.append(str).append("\n");
            }
        }

        // Catch block to handle the exceptions
        catch (IOException e) {

            // Print the line number here exception occurred
            // using printStackTrace() method
            e.printStackTrace();
        }

        // Returning a string
        System.out.println(builder.toString());
    }

    public static void ReadFile_Array(){
        try{
            // list that holds strings of a file
            List<String> listOfStrings
                    = new ArrayList<String>();

            // load data from file
            BufferedReader bf = new BufferedReader(
                    new FileReader("src/main/java/Data/Subjects.txt"));

            // read entire line as string
            String line = bf.readLine();

            // checking for end of file
            while (line != null) {
                listOfStrings.add(line);
                line = bf.readLine();
            }

            // closing bufferreader object
            bf.close();

            // storing the data in arraylist to array
            String[] array
                    = listOfStrings.toArray(new String[0]);

            // printing each line of file
            // which is stored in array
            for (String str : array) {
                System.out.println(str);
            }
        } catch (IOException e){}

    }
}