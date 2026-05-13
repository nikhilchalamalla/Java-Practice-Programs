import java.util.Arrays;
public class ArraysExample {
    public static void main(String[] args) {
        int zero = 0;
        int one = 1;

        int [] numbers = {2, 0, 1, 4, 100};
        String[] names = {"Ali", "Maria"};
        // int [] numbers = new int[3];
        // numbers[0] = 2;
        // numbers[1] = 0;
        // numbers[2] = 1;
        // numbers[2] = 34;
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(names));
        System.out.println(names.length);

        // boolean [] bnumbers = new boolean[3];
        // System.out.println(Arrays.toString(bnumbers));

        // String [] Snumbers = new String[3];
        // System.out.println(Arrays.toString(Snumbers));

    }
}
