import java.util.Scanner;

public class AgeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int num = scanner.nextInt();

        String result = ageCheck(num);
        System.out.println(result);

        scanner.close();
    }

    private static String ageCheck(int age) {
        if (age < 3) {
            return "Infant";
        } else if (age >= 3 && age < 5) {
            return "Toddler";
        } else if (age >= 5 && age < 12) {
            return "Child";
        } else if (age >= 12 && age < 18) {
            return "Young adult";
        } else if (age >= 18 && age <= 68) {
            return "Adult";
        } else if (age > 68) {
            return "Pensioner";
        } else {
            return "Age is invalid";
        }
    }
}
