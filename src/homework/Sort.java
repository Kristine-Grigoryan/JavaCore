package homework;

public class Sort {

    public static void main(String[] args) {
        int[] numbers = {4, 7, 1, 3, 9, 0, 2};
        for (int i = 0; i < numbers.length - 1; i++) {
            int min = numbers[i];
            int minIndex = i;

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    minIndex = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = temp;
        }

        for (int number : numbers) {
            System.out.print(number + "  ");

        }
    }
}





