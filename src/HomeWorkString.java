package org.wikipedia;

import java.util.Scanner;

public class HomeWorkString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        int size = string.length();

        if (size > 10 ) {
            System.out.println(true);
    }
        else {
            System.out.println(false);}

        int firstSymbol = string.charAt(0);

        if (firstSymbol == lastSymbol){
            System.out.println(true);}

        else {
                System.out.println(false);}}

}
