package P1;

import java.util.Arrays;

public class poker {
    public static void main(String[] e){

        int [] maven = pokerhand();
        for (int each : maven)
        System.out.println(each);


    }

    public static int[] pokerhand() {
        int[] hand = {45, 30, 2, 0, 7,};
        Arrays.sort(hand);
        return hand;
    }
}
