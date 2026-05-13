public class breakndContinue {
    public static void main(String[] args) {
        String[] names = {"Anna", "Ali", "Bob", "Mike"};
        for(String name : names) {
            // System.out.println(name);
            // break;
            
            if(name.equals("Bob")) {
                break;
            }
            System.out.println(name);

            if(name.startsWith("A")) {
                continue;
            }
            System.out.println(name);
        }
    }
}
