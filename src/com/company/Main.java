package com.company;

import javax.naming.Name;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String[] name = {"Ulan", "Umar", "Bulan"};

        for (int i = 0; i <= name.length; i++) {
            switch (i) {
                case 1:
                    System.out.println("Good morning," + name[0] + "!");
                    break;
                case 2:
                    System.out.println("Good day," + name[1] + "!");
                    break;
                case 3:
                    System.out.println("Good night," + name[2] + "!");
                    break;
                case 4:
                    System.out.println("Good Job," + name[3]);
                    break;
            }

            name = Arrays.copyOf(name, name.length + 1);
            name[3] = "Urmat";

        }
    }

}

