package P1;


public class Lucks {
    public static void main(String[] luck){
        int big = biggest(3,4);
        System.out.printf("The biggest number is %d%n", big);
    }

    public static int biggest(int a, int b){
        return (a > b) ? a : b;
    }
}
