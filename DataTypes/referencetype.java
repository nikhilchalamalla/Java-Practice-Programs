import java.time.LocalDate;

public class referencetype {
    public static void main(String[] args) {
        String name = new String("Nikhil");
        System.out.println(name.toUpperCase());
        LocalDate now = LocalDate.now();
        System.out.println(now.getDayOfYear());
    }
}
