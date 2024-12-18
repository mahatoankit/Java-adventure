public class TenGreenBottles {

    public static void main(String[] args) {
        for (int n = 10; n > 0; n--) {
            if (n == 1) {
                System.out.println(n + " green bottle, hanging on the wall");
                System.out.println(n + " green bottle, hanging on the wall");
            } else {
                System.out.println(n + " green bottles, hanging on the wall");
                System.out.println(n + " green bottles, hanging on the wall");
            }
            
            System.out.println("And if one green bottle");
            System.out.println("should accidentally fall");
            
            if (n - 1 == 1) {
                System.out.println("There'll be " + (n - 1) + " green bottle,");
            } else if (n - 1 == 0) {
                System.out.println("There'll be no green bottles,");
            } else {
                System.out.println("There'll be " + (n - 1) + " green bottles,");
            }
            
            System.out.println("hanging on the wall");
            System.out.println();
        }
    }
}
