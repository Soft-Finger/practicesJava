package Vector;

public class MyVector {
    final static int SCALING_RATIO = 2;
    final static int INITIAL_SIZE = 4;
    final static int NO_FOUND_INDEX = -1;

    static Object[] tab = new Object[SCALING_RATIO];
    static int nbElements = 0;
    public static void main(String[] args) {

    }

    public static int size1() {
        int length = tab.length;
        return length;
    }

    public static void reSize() {
        Object[] temp = new Object[size1() * SCALING_RATIO];
        for (int i = 0; i < size1(); i++) {
            temp[i] = tab[i];
        }
    }

    public static void nbeElements() {
        for (int i = 0; i < size1(); i ++) {
            nbElements++;
        }
    }
}
