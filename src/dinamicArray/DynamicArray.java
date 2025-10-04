package dinamicArray;

public class DynamicArray {


    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size] = value;
        size++;
    }

    private void extend() {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;

    }

    public int getByIndexs(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        return array[index];
    }

    public void print() {

    }
}
