import java.util.Scanner;

public class HomeWorkDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //first level:
        int number;
        int division=2;

        do { number = scanner.nextInt();
          if ( number % division == 0) {
               System.out.println( division);}
           } while (false);

        //second level
        int x = scanner.nextInt();
        int p = 10;
        int k = scanner.nextInt();

        for (int i = 1; i <=k; i++) {
            x += x * p /100;
            System.out.println(x);
        }
        }
    }


