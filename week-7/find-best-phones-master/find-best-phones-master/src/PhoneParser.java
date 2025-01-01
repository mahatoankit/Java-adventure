import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PhoneParser {
    /*
     * Parses a phone data string, in the following format:
     * 
     *     model screenSize batteryCapacity
     * 
     * The model name is encoded with underscores instead of spaces.
     */
    public static Phone parse(String data) throws IOException {
        String[] phoneData = data.split(" ");

        if (phoneData.length != 3) {
            throw new IOException("Invalid data format. Expected model screenSize batteryCapacity.");
        }

        return new Phone(phoneData[0], Double.parseDouble(phoneData[1]), Integer.parseInt(phoneData[2]));
    }

    /*
     * Returns a PhoneList by parsing a text file containing the phone data.
     */
    public List<Phone> parseFile(String filename) throws IOException {
        List<Phone> phoneList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = reader.readLine()) != null) {
                Phone newPhone = parse(line);
                phoneList.add(newPhone);
            }
        } catch (FileNotFoundException e) {
            throw new IOException("File not found: " + filename, e);
        } catch (IOException e) {
            throw new IOException("Error reading the file: " + filename, e);
        }

        return phoneList;
    }
    public static void main(String args[]) {
    	
    }
}
