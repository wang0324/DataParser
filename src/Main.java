import java.util.ArrayList;
import java.util.List;

/***
 * Main class for data parsers
 * @author Kevin Wang
 */
public class Main {

    public static void main(String[] args) {
        String electionData = Utils.readFileAsString("data\\2016_Presidential_Results.csv");
        String educationData = Utils.readFileAsString("data\\Education.csv");
        String unemploymentData = Utils.readFileAsString("data\\Unemployment.csv");

        DataManager manager = Utils.parseAllData(electionData, educationData, unemploymentData);
        manager.displayAllData();
    }
}
