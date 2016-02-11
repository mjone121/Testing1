package p2;

public class Objects {


    public static void main(String[] peeps){

        // Creates an array of balloons
        balloon[] orders = new balloon[50];

        // Creates some balloon objects
        orders[0] = new balloon();
        orders[1] = new balloon(12, "yellow");
        orders[2] = new balloon(6, "red");

        // Prints the number of balloons created
        System.out.printf("We made %d Balloons%n", balloon.getQuantity());

        // Pops some balloons
        balloon.destroy(1, orders);

        // Prints the number of remaining balloons;
        System.out.printf("We made %d Balloons%n", balloon.getQuantity());

        // Print the balloon's characteristics
        for (balloon each : orders)
            // unless it's undefined
            if(each != null)
                System.out.printf
                    ("Balloon thing0: size %d inches; color is %s%n",
                            each.getSize(), each.getColor());

    }

}

class balloon {
    private int size;
    private String color;
    private static int quantity = 0;

    // Default Constructor
    balloon(){
        size = 10;
        color = "Orange";
        quantity++;
    }

   // Constructor Recieves size and color
    balloon (int s, String c){
        size = s;
        color = c;
        quantity++;
    }

    // Returns the sides
    int getSize(){return size;}

    // Returns the color
    String getColor(){return color;}

    // Returns the number of balloons created
    static int getQuantity(){return quantity;}

    static void destroy(int kill, balloon[] mistake) {
        quantity--;
        mistake[kill]= null;
    }
}