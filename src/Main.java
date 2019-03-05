import java.util.ArrayList;

/***
 * Main class for data parsers
 * @author Kevin Wang
 */
public class Main {

    public static void main(String[] args) {
        String data = Utils.readFileAsString("data\\2016_Presidential_Results.csv");

        ArrayList <ElectionResult> arr = Utils.parse2016PresidentialResults(data);
        for (ElectionResult E:arr) {
            System.out.println(E.toString());
        }
    }
}
