import java.util.Arrays;

public class HomeWorkMasive {
    public static void main(String[] args) {
        int [] masive = new int [100];

        for (int i = 0; i < 100; i++) {
            masive[i] = 10;

        }
        masive[1] = 0;
        masive[99] = 0;

        System.out.println(Arrays.toString(masive));


    }
}
