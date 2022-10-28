import java.util.Scanner;

public class HomeWorkFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = scanner.nextInt();
        double numberTwo = 0;

        for (int i = 1; i <= number ; i++)
         numberTwo += 1.0/i;
        System.out.println(numberTwo);
        }


    }
