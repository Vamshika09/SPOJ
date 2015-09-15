import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TEST {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while (!(input = reader.readLine()).equals("42")) {
            System.out.println(input);
        }
    }

}
