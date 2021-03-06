import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException { //http://pl.spoj.com/problems/AL_13_10/
        String line;
        String[] lineElements;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);

        int t = Integer.parseInt(reader.readLine());
        for (int i = 0; i < t; i++) {
            line = reader.readLine();
            lineElements = line.split("\\s");
            writer.println(substringCheckResult(lineElements[0], lineElements[1]));
        }
        writer.close();
    }

    private static String substringCheckResult(String stringToCheck, String substring) {
        if (stringToCheck.length() >= substring.length()) {
            int substringIndex = 0;
            int substringLength = substring.length() - 1;
            for (int i = 0; i < stringToCheck.length(); i++) {
                if (stringToCheck.charAt(i) == substring.charAt(substringIndex)) {
                    if (substringIndex < substringLength) {
                        substringIndex++;
                    } else {
                        return "Tak";
                    }
                }
            }
        }
        return "Nie";
    }
}
