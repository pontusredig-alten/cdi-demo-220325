import jakarta.inject.Inject;

import java.io.BufferedReader;
import java.io.IOException;

public class TextApplication {

    private final TextProcessor textProcessor;
    private final BufferedReader userInputReader;

    @Inject
    public TextApplication(TextProcessor textProcessor, BufferedReader userInputReader) {
        this.textProcessor = textProcessor;
        this.userInputReader = userInputReader;
    }

    public void run() throws IOException {
        System.out.println("Enter the text to process: ");
        String text = userInputReader.readLine();
        System.out.println(textProcessor.processText(text));
    }


}
