// public class passportExample {
//     public static void main(String[] args) {
//         string passportNumber = "123456";
//         Passport ukPassport = new Passport("1234", LocalDate.of(2025,1,26));

//     }

//     class Passport {
//         String number;
//         LocalDate expiryDate;

//         Passport(String number, LocalDate expiryDate) {
//             this.number = number;
//             this.expiryDate = expiryDate;
//         }
//     }
// }



import java.time.LocalDate;   // ✅ import added

public class passportExample {
    public static void main(String[] args) {
        String passportNumber = "123456";   // ✅ String with capital S
        Passport ukPassport = new Passport("1234", LocalDate.of(2025, 1, 26));

        System.out.println("Passport Number: " + ukPassport.number);
        System.out.println("Expiry Date: " + ukPassport.expiryDate);
    }
}

// ✅ Passport class moved outside main
class Passport {
    String number;
    LocalDate expiryDate;

    Passport(String number, LocalDate expiryDate) {
        this.number = number;
        this.expiryDate = expiryDate;
    }
}
