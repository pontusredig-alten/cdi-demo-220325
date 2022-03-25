import jakarta.enterprise.inject.Alternative;

@Alternative
public class UpperCaseTextProcessor implements TextProcessor{
    @Override
    public String processText(String text) {
        return text.toUpperCase();
    }
}
