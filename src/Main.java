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

        System.out.println(Utils.removeAllQuotes(electionData));

//        ArrayList <ElectionResult> arr = Utils.parse2016PresidentialResults(data);
//        for (ElectionResult E:arr) {
//            System.out.println(E.toString());
//        }

//        DataManager DM = Utils.parseAllData(electionData, educationData, unemploymentData);
//        ArrayList <State> arr = (ArrayList<State>) DM.getStates();
//        for (State s:arr) {
//            for (County c: s.getCounties()) {
//
//            }
//        }

    }
}
