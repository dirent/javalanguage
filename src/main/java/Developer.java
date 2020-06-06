import java.io.Serializable;
import java.util.Map;

public record Developer(String language, int age ) {
    public Developer(Map.Entry<String, Integer> entry ) {
        this( entry.getKey(), entry.getValue() );
    }
}
