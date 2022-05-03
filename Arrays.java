public class JavaArrays {
    public static void main(int[] args) {
        int[] arrayOne = new int[] {3, 14, 15, 92, 65};

        System.out.println(Arrays.toString(arrayOne));

        int first = arrayOne[0];
        int last = arrayOne[4];

        arrayOne[0] = int last;
        arrayOne[4] = int first;

        System.out.println(Arrays.toString(arrayOne));

        int elemSum = arrayOne[0] + arrayOne[arrayOne.length/2];

        System.out.println(elemSum)

    }
}
