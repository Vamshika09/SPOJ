import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PRIME1 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int counter = Integer.parseInt(reader.readLine());

        while (counter-->0) {
            String[] inputs = reader.readLine().split(" ");
            int m = Integer.parseInt(inputs[0]);
            int n = Integer.parseInt(inputs[1]);

            for (int i = m; i <= n; i++) {
                if (isPrime(i)) {
                    System.out.println(i);
                }
            }

            System.out.println();
        }
    }

    private static boolean isPrime(int p) {
        if (p <= 1) {
            return false;
        }
        for (int i = 2; i * i <= p; i++) {
            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }

}
