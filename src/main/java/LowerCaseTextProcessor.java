import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.Default;

@Alternative
public class LowerCaseTextProcessor implements TextProcessor {
    @Override
    public String processText(String text) {
        return text.toLowerCase();
    }
}
