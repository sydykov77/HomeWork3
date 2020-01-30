package com.company;

import javax.naming.Name;

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

            }

        }

        
    }

}

