import java.util.Arrays;
public class userdefinemethods {
    public static void main(String[] args) {
        char[] letters = {'A', 'A', 'B', 'C', 'D', 'D', 'D'};
        int count = countOccurrences(letters, 'B');
        System.out.println(count);
    }

    public static int countOccurrences(char[] letters, char searchLetter) {
        int count = 0;
        // System.out.println("method countOccurrences was invoked");
        // System.out.println(Arrays.toString(letters));
        // System.out.println(searchLetter);
        // return -1;

        for(char letter : letters) {           
            if(letter == searchLetter) {
                count++;
            }
        }
        return count;


    }
}
