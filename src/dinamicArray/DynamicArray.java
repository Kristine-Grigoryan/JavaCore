package dinamicArray;

public class DynamicArray {


    int[] array = new int[10];
    int size = 0;

    DynamicArray() {
        array = new int[10];
    }

    DynamicArray(int defaultlength) {
        array = new int[defaultlength];

    }

    public void add(int value) {
        if (array.length == size)
            extand();

        array[size] = value;
        size++;
    }


    void extand() {
        int[] temp = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    int getByIndex(int index) {
        if (index < 0 || index > size) {
            return -1;
        }
        return array[index];
    }

    public void deleteByIndex(int index) {
        for (int i = index; i < size; i++) {
            array[i - 1] = array[i];
        }
        size--;
    }

    public void set(int index, int value) {
        if (index < 0 || index >= size) {
            System.out.println("invalid index!");
            return;
        }
        array[index] = value;
    }

    public boolean exsits(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
            return false;
        }
        return false;
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");

            System.out.println();

        }

    }
}






