package homework;

public class Homework1 {

    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        if (x < y) {
            System.out.println("x  փոքր է y-ից");

            x = x * 2;
            if (x == y) {
                System.out.println("x   հավասար է y-ից");
            }
            x = x * 2;
            if (x > y) {
                System.out.println("x  մեծ է y-ից  ");
            }

        }

    }
}


