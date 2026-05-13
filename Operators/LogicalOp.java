public class LogicalOp {
    public static void main(String[] args) {
        boolean isAdult = false;
        boolean isStudent = false;
        System.out.println(isAdult && isStudent);
        System.out.println(isAdult || isStudent);
        // System.out.println(isAdult ! isStudent);

        boolean isAmigoscode = true;

        System.out.println((!isAdult || isStudent) && isAmigoscode);

        System.out.println(!isAdult == true);
    }
}
