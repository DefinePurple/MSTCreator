package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int numberOfVerts, numberOfEdges, maxWeight;

        System.out.print("Enter file name: ");
        Scanner reader = new Scanner(System.in);
        String fileName = reader.nextLine();

        System.out.print("Enter number of verts: ");
        reader = new Scanner(System.in);
        numberOfVerts = reader.nextInt();

        System.out.print("Enter number of edges (Minimum " + numberOfVerts +"): ");
        reader = new Scanner(System.in);
        numberOfEdges = reader.nextInt();
        if(numberOfEdges <= numberOfVerts){
            numberOfEdges = numberOfVerts + 1;
        }
        System.out.print("Enter max weight: ");
        reader = new Scanner(System.in);
        maxWeight = reader.nextInt();




        try {
            Graph g = new Graph(numberOfVerts, numberOfEdges);
            g.display();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }













        if (fileName.length() < 5)
            fileName += ".txt";
        if (fileName.charAt(fileName.length() - 4) != '.')
            fileName += ".txt";

        System.out.println("Writing to " + fileName);
        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;
        try {
            String content = "This is the content";
            fileWriter = new FileWriter(fileName);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(content);
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedWriter != null)
                    bufferedWriter.close();
                if (fileWriter != null)
                    fileWriter.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }//end main
}
