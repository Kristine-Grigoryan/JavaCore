package lesson4;

public class ArrayUtil {

    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        for (int i = 0; i < 9; i++) {
            System.out.print(numbers[i] + "  ");
        }
        System.out.println();
        System.out.println(numbers[0]);
        System.out.println(numbers[8]);


        System.out.println(numbers.length);
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
         System.out.println(numbers[i] + "") ;

            }
            System.out.println();

            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] % 2 == 0) ;
                {
                    System.out.print(numbers[i] + "  ");
                }
                System.out.println();

                int result = 0;
                for (int k = 0; k < numbers.length; k++) {
                    result = result + numbers[i];
                }
                System.out.println(result / numbers.length);

                System.out.println();

                if (numbers.length % 2 == 1) {
                    int minddeIndex = numbers.length / 2;
                    {
                        System.out.println("numbers.length  / 2  + numbers[minnddeIndex" );


                    }
                }
            }

        }

    }

}











