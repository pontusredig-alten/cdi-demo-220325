import jakarta.enterprise.inject.Alternative;
import jakarta.enterprise.inject.Default;

@Alternative
public class ReverseTextProcessor implements TextProcessor {
    @Override
    public String processText(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
