package repetition;

import java.io.InputStream;

public class BytesSequence {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        for (byte i : inputStream.readAllBytes()) {
            System.out.print(i);
        }
    }
}