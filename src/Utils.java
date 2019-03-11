import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
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
        String[] electionLines =  parseStringIntoArray(electionData, 1);
        String[] educationLines = parseStringIntoArray(educationData, 5);
        String[] unemploymentLines = parseStringIntoArray(unemploymentData, 8);

        ArrayList <County> counties = createListOfCounties(unemploymentLines, states);

        for (String line:electionLines) {
            Election2016 e = new Election2016();
            String[] components = line.split(",");
            String name = components[9];
            e.setDemVotes(Double.parseDouble(components[1]));
            e.setGopVotes(Double.parseDouble(components[2]));
            e.setTotalVotes(Double.parseDouble(components[3]));

            counties.get(counties.indexOf(name));
        }

        for (String line:educationLines) {
            Education2016 e = new Education2016();
            String[] components = line.split(",");
            e.setBachelorsOrMore();
            e.setNoHighSchool();
            e.setSomeCollege();
            e.setOnlyHighSchool();
        }

        for (String line:unemploymentLines) {
            Employment2016 e = new Employment2016();
            String[] components = line.split(",");
            e.setEmployedLaborForce();
            e.setTotalLaborForce();
            e.setUnemployedLaborForce();
            e.setUnemployedPercent();

        }

        return states;
    }

    private static ArrayList<State> createListOfStates(String[] electionLines) {
        ArrayList <State> states = new ArrayList<>();

        for (int i = 1; i < electionLines.length; i++) {
            String[] components = electionLines[i].split(",");
        }
    }

    private static String[] parseStringIntoArray(String electionData, int ignore) {
        String[] lines = electionData.split("\n");

        for (int i = ignore; i < lines.length; i++) {
            String line = lines[i];
            while (line.contains("\"")) {
                int firstQuote = line.indexOf("\"");
                int secondQuote = line.indexOf("\"", firstQuote + 1);

                if (firstQuote != -1) {
                    String diff = line.substring(firstQuote, secondQuote + 1);
                    String copy = diff;
                    copy = copy.replaceAll("\"", "");
                    copy = copy.replaceAll(",", "");
                    line = line.replaceFirst(diff, copy);
                }
            }
            parseString(line);
            lines[i] = line;
        }
        return lines;
    }

    private static ArrayList<State> getStateList(ArrayList<String[]> election) {
        ArrayList<State> stateList = new ArrayList<>();
        for (String[] dataLine : election) {
            String stateName = dataLine[1];
            if (!stateList.contains(stateList)) {
                State s = new State(stateName);
                stateList.add(s);
            }
        }
        return stateList;
    }
    private static ArrayList<State> getAllStateData() {

    }

    private static String parseString(String s) {
        s = s.replaceAll("%", "");
        s = s.replaceAll("$", "");
        s = s.replaceAll("%", "");
        return s;
    }

    private static String removeAllQuotes(String s) {
        return s.replaceAll("\"", "");
    }
}


