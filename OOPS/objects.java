public class objects {
    public static void main(String[] args) {
        // Lens lensOner = 
        // new Lens (brand:"sony", focalLength:"85mm", isPrime:true);
        Lens lensOne = new Lens("sony", "85mm", true);
        System.out.println("Brand: " + lensOne.brand);
        System.out.println("Focal Length: " + lensOne.focalLength);
        System.out.println("Is Prime: " + lensOne.isPrime);
    }
}

class Lens {
    String brand;
    String focalLength;
    boolean isPrime;

    Lens(String brand, String focalLength, boolean isPrime) {
        this.brand = brand;
        this.focalLength = focalLength;
        this.isPrime = isPrime;
    }
}
