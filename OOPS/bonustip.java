import java.util.Arrays;

public class bonustip {
    public static void main(String[] args) {
        int[] numbers = {2, 0, 1, 4, 100, 4, 90, 78, 77};
        String[] names = {"Anna", "Ali"};

        Arrays.stream(numbers).forEach(System.out::println);
        Arrays.stream(names).forEach(System.out::println);

        for(int i = 0; i < numbers.length; i++) {

        }

        for(int i = numbers.length - 1; i >= 0; i--) {

        }

        for (String name : names) {

        }
    }
}
