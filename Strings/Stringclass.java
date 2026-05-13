public class Stringclass {
    public static void main(String[] args) {
        char a = 'A';
        char b = 'B';

        // String name = new String("Amigoscode");
        String name = "Amigoscode";

        System.out.println(a);
        System.out.println(b);
        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(6));

        String code = new String("codes");
        System.out.println(name.contains(code));
        System.out.println(name.equals(code));
        
    }
}
