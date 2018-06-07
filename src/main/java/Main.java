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
            if (substringCheck(lineElements[0], lineElements[1])) {
                writer.println("Tak");
            } else {
                writer.println("Nie");
            }
        }
        writer.close();
    }

    private static boolean substringCheck(String stringToCheck, String substring) {
        if (stringToCheck.length() >= substring.length()) {
            String[] stringToCheckElements = stringToCheck.split("");
            String[] substringElements = substring.split("");
            int substringElementsIndex = 0;
            for (String stringToCheckElement : stringToCheckElements) {
                if (stringToCheckElement.equals(substringElements[substringElementsIndex])) {
                    if (substringElementsIndex < substringElements.length - 1) {
                        substringElementsIndex++;
                    } else {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
