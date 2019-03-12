import javax.xml.crypto.Data;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Utils {
    ArrayList <State> states;

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

//    public static ArrayList<ElectionResult> parse2016PresidentialResults(String data) {
//        ArrayList<ElectionResult> results = new ArrayList<>();
//        String[] lines = data.split("\n");
//
//        for (int i = 1; i < lines.length; i++) {
//            String line = lines[i];
//
//            int firstQuote = line.indexOf("\"");
//            int secondQuote = line.indexOf("\"", firstQuote + 1);
//
//            if (firstQuote != -1) {
//                String diff = line.substring(firstQuote, secondQuote + 1);
//                String copy = diff;
//                copy = copy.replaceAll("\"", "");
//                copy = copy.replaceAll(",", "");
//                line = line.replaceFirst(diff, copy);
//            }
//            line = line.replaceFirst("%", "");
//
//            String[] components = line.split(",");
//            results.add(new ElectionResult(Double.parseDouble(components[1]), Double.parseDouble(components[2]), Double.parseDouble(components[3]), Double.parseDouble(components[4]), Double.parseDouble(components[5]), Double.parseDouble(components[6]), Double.parseDouble(components[7]) * 0.01, components[8], components[9], Double.parseDouble(components[10])));
//        }
//
//        return results;
//    }

    public static DataManager parseAllData(String electionData, String educationData, String unemploymentData) {
        String[] electionLines = parseStringIntoArray(electionData, 1);
        String[] educationLines = parseStringIntoArray(educationData, 5);
        String[] unemploymentLines = parseStringIntoArray(unemploymentData, 8);

        ArrayList <State> states = getAllStates(electionLines, educationLines, unemploymentLines);
        /*
        General Idea;
        add all state info in one method. First loop through the election data and get all state names.
        for each state, add to counties list
        then for each county, ass all education, employment, and election data

        add state list to data manger and return it
         */

        return new DataManager(states);
    }

    private static ArrayList<State> getAllStates(String[] electionLines, String[] educationLines, String[] unemploymentLines) {
        for (String line:electionLines) {
            String[] components = cleanLine(line);
        }
    }

    private static String[] cleanLine(String line) {

    }

    private static String[] parseStringIntoArray(String data, int linesToSkip) {
        String[] lines = data.split("\n");
        String[] usable = new String[lines.length-linesToSkip];

        int index = 0;
        for (int i = linesToSkip; i < lines.length; i++) {
            usable[index] = lines[i];
            index++;
        }

        return usable;
    }

}


