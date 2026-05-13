// import javax.naming.LinkException;

public class classes {
    public static void main(String[] args) {
        Lens lens1 = new Lens("Canon", "50mm", true);
        System.out.println(lens1.brand + " " + lens1.focalLength + " Prime: " + lens1.isPrime);
    }
}

class Lens {
    String brand;
    String focalLength;
    boolean isPrime;

    Lens(String brand, String focallength, boolean isPrime) {
        this.brand = brand;
        this.focalLength = focallength;
        this.isPrime = isPrime;
    }
}