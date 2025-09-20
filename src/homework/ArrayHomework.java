package homework;

public class ArrayHomework {

    public static void main(String[] args) {
        int[] numbers = {16, 8, 15, 6, 10, 6, 8, 52, 9, 2};
        int n = 6;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < n) {
                n = numbers[i];
                System.out.println("n = " + n);
            }
            System.out.println();
        }

        int[] array = {8, 15, 5, 8, 9, 6, 3, 1, 5, 10, 23};
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
        int[] nums = {8, 3, 5, 5, 4, 4, 6, 8,};
        System.out.println("dublicate");
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) ;
            }
            System.out.println(nums[i] + "");
        }
        System.out.println();
    }
}





