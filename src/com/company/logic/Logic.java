package com.company.logic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Logic {
    ArrayList<Shape> processedData = new ArrayList<>();
    public void vypocetVseho() {
        ArrayList<String> data = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("./resources/input.txt"));
            String nextLine = br.readLine();
            while (nextLine != null) {
                data.add(nextLine);
                nextLine = br.readLine();
            }
            br.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        for (int i = 0; i < data.size(); i++) {
            String dataContent[] = data.get(i).split(" ");

            if (dataContent[0].equals("C")){
                processedData.add(new Circle((int) Float.parseFloat(dataContent[1])));
            }
            if (dataContent[0].equals("S")){
                processedData.add(new Square((int) Float.parseFloat(dataContent[1])));
            }
            if (dataContent[0].equals("R")){
                processedData.add(new Rectangle((int) Float.parseFloat(dataContent[1]), (int) Float.parseFloat(dataContent[2])));
            }
        }
    }
    public float prumerVsechObvodu(){
        int suma = 0;
        int vysledek = 0;
        for (Shape shape : processedData){
            suma += shape.vypocetObvodu();
            vysledek++;
        }
        return (float) suma / vysledek;
    }
    public float prumerVsechObsahu(){
        int suma = 0;
        int vysledek = 0;
        for (Shape shape : processedData){
            suma += shape.vypocetObsahu();
            vysledek++;
        }
        return (float) suma / vysledek;
    }
}
