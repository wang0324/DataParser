/***
 * Main class for data parsers
 * @author Kevin Wang
 */
public class Main {

    public static void main(String[] args) {
        String data = Utils.readFileAsString("data\\2016_Presidential_Results.csv");
        System.out.println(data);
    }
}
