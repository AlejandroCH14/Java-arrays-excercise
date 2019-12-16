public class Array {

    private int[] array;
    int numElements;

    Array(int length) {
        array = new int[length];
    }

    public void insert(int newElement) {

        if (array.length == numElements) {
            int[] newArr = new int[numElements * 2];

            for (int i = 0; i < numElements; i++)
                newArr[i] = array[i];

            array = newArr;
        }

        array[numElements++] = newElement;
    }

    public void print() {

        for (int i = 0; i < numElements; i++)
            System.out.println(array[i]);
    }

    public void removeAt(int index) {

        int[] newArr = new int[numElements - 1];

        if (index < numElements && index >= 0) {

            for (int i = 0, j = 0; i < numElements; i++) {
                if (i == index)
                    continue;

                newArr[j++] = array[i];
            }

            array = newArr;
            numElements--;
        } else
            throw new IllegalArgumentException();

    }

    public int indexOf(int element) {

        for (int i = 0; i < numElements; i++)
            if (array[i] == element)
                return i;

        return -1;
    }
}