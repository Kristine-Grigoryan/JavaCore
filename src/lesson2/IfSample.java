package lesson2;

public class IfSample {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        if (x < y) {
            System.out.println("x менше y");
        }
        x = x * 2;
        if (x == y) {
            System.out.println("x типер  равно  y");
        }
        x = x * 2;
        if (x > y) {
            System.out.println("x болше y  ");
        }
    }
}