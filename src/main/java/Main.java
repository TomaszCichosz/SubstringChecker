import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException { //http://pl.spoj.com/problems/AL_13_10/
        String stringToCheck, substring, line;
        String[] lineElements;
        int substringElementsIndex;
        boolean no;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);

        int t = Integer.parseInt(reader.readLine());
        for (int i = 0; i < t; i++) {
            no = true;
            line = reader.readLine();
            lineElements = line.split("\\s");
            stringToCheck = lineElements[0];
            substring = lineElements[1];
            String[] stringToCheckElements = stringToCheck.split("");
            String[] substringElements = substring.split("");
            substringElementsIndex = 0;
            if (stringToCheck.length() >= substring.length()) {
                for (int j = 0; j < stringToCheckElements.length; j++) {
                    if (stringToCheckElements[j].equals(substringElements[substringElementsIndex])) {
                        if (substringElementsIndex < substringElements.length - 1) {
                            substringElementsIndex++;
                        } else {
                            writer.println("Tak");
                            no = false;
                            j = stringToCheckElements.length;
                        }
                    }
                }
            }
            if (no) {
                writer.println("Nie");
            }
        }
        writer.close();
    }
}
