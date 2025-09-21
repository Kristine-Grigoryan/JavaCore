package homework;

public class FIgurePainter {

    public static void main(String[] args) {
        int a = 5;

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------- ");

        int b = 5;
        for (int i = b; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------");

        int c = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------");

        int d = 5;
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j >= 5 - i; j++) {

                System.out.print("*");
            }
        }
            System.out.println();
        }

    }

