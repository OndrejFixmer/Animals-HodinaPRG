package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String[]> animl = new ArrayList<>();


        try {
            BufferedReader br = new BufferedReader(new FileReader("animals.csv"));

            String nextLine = br.readLine();
            while (nextLine != null) {
                String[] row = nextLine.split(";");
                animl.add(row);


                nextLine = br.readLine();
            }
            for (int i = 0; i < animl.size(); i++) {
                if (animl.get(i)[1].equals("0")) {
                    animl.get(i)[1] = "Dog";
                } else if (animl.get(i)[1].equals("1")) {
                    animl.get(i)[1] = "Cat";
                } else if (animl.get(i)[1].equals("2")) {
                    animl.get(i)[1] = "Donkey";
                } else if (animl.get(i)[1].equals("3")) {
                    animl.get(i)[1] = "Parrot";
                } else if (animl.get(i)[1].equals("4")) {
                    animl.get(i)[1] = "Horse";
                } else if (animl.get(i)[1].equals("5")) {
                    animl.get(i)[1] = "Fox";
                } else if (animl.get(i)[1].equals("6")) {
                    animl.get(i)[1] = "Lion";
                } else if (animl.get(i)[1].equals("7")) {
                    animl.get(i)[1] = "Tiger";
                } else if (animl.get(i)[1].equals("8")) {
                    animl.get(i)[1] = "Lizard";
                } else if (animl.get(i)[1].equals("9")) {
                    animl.get(i)[1] = "Bear";
                }

                if (animl.get(i)[1].equals("TYPE")) {
                    animl.get(i)[1] = "TYP_ZVÍŘETE";
                }
                if (animl.get(i)[2].equals("NAME")) {
                    animl.get(i)[2] = "JMÉNO_ZVÍŘETE";
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("Animal1/ukol1.txt"));

            for (int i = 0; i < animl.size(); i++) {
                bw.write(animl.get(i)[2]);
                    bw.write(";");
                        bw.write(animl.get(i)[1]);
                        bw.write(";");
                    bw.write(animl.get(i)[4]);
                bw.newLine();
            }

            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
