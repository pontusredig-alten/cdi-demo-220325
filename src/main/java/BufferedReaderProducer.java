import jakarta.enterprise.inject.Produces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderProducer {

    @Produces
    BufferedReader getBufferedReader() {
        return new BufferedReader(new InputStreamReader(System.in));
    }

}
