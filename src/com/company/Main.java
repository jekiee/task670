package com.company;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("INPUT.TXT")));
        int num = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();
        int index = 1;
        int number = 0;
        while(index <= num) {
            number++;
            while (!isSuperNumber(number)) {
                number++;
            }
            index++;
        }
        System.out.println(number);
    }

    private static boolean isSuperNumber(int number) {

        HashSet<Integer> set = new HashSet<Integer>();

        while(number > 0) {
            int digit = number % 10;
            if (set.contains(digit)) {
                return false;
            }
            set.add(digit);
            number /= 10;
        }
        return true;
    }
}
