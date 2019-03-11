import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Utils {

    public static String readFileAsString(String filepath) {
        StringBuilder output = new StringBuilder();

        try (Scanner scanner = new Scanner(new File(filepath))) {

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                output.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return output.toString();
    }

    public static ArrayList<ElectionResult> parse2016PresidentialResults(String data) {
        ArrayList<ElectionResult> results = new ArrayList<>();
        String[] lines = data.split("\n");

        for (int i = 1; i < lines.length; i++) {
            String line = lines[i];

            int firstQuote = line.indexOf("\"");
            int secondQuote = line.indexOf("\"", firstQuote + 1);

            if (firstQuote != -1) {
                String diff = line.substring(firstQuote, secondQuote + 1);
                String copy = diff;
                copy = copy.replaceAll("\"", "");
                copy = copy.replaceAll(",", "");
                line = line.replaceFirst(diff, copy);
            }
            line = line.replaceFirst("%", "");

            String[] components = line.split(",");
            results.add(new ElectionResult(Double.parseDouble(components[1]), Double.parseDouble(components[2]), Double.parseDouble(components[3]), Double.parseDouble(components[4]), Double.parseDouble(components[5]), Double.parseDouble(components[6]), Double.parseDouble(components[7]) * 0.01, components[8], components[9], Double.parseDouble(components[10])));
        }

        return results;
    }

    public static DataManager parseAllData(String electionData, String educationData, String unemploymentData) {
        String[] electionLines = electionData.split("\n");
        String[] educationLines = educationData.split("\n");
    }
}


