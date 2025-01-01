import java.io.IOException;
import java.util.*;

public class FindBestPhones {
    public static String PHONES_FILE = "phone-data.txt";

    public static void main(String[] args) {
        // TODO: use the parseFile method to get the phone data from the file
        try {
            PhoneParser parser = new PhoneParser();
            List<Phone> parsedPhones = parser.parseFile(PHONES_FILE);

            PhoneList phoneList = new PhoneList();

            // Add phones to PhoneList
            for (Phone phone : parsedPhones) {
                phoneList.addPhone(phone);
            }

            // TODO: print the model names of all the best phones
            System.out.println("Best Phones:");
            for (Phone phone : phoneList.getBestPhones()) {
                System.out.println(phone.getModel());
            }
        } catch (IOException e) {
            System.err.println("An error occurred while processing the file: " + e.getMessage());
        }
    }
}