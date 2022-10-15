
import java.util.Scanner;

public class HomeWorkScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if (number == 0) {
        System.out.println("ошибок не обнаружено");
    }
        if (number != 0) {
            System.out.println("ERROR ERROR ERROR");
        }

        String string = scanner.nextLine();
        int size = string.length();
        int lastSymbol = string.charAt(string.length()-1);


        if (size<6 || lastSymbol != '!') {
            System.out.println("Ваш пароль неверный");}
        else {
            System.out.println("пароль принят");}
        }
        //Коментарий

    }
