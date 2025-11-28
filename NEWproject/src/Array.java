public class Array {
    public static void main() {
        int[] array = new int[10];

        for (int i = 1; i < array.length; i++) {
            array[i] = i;
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
