package repositorypattern;
import java.util.Map;


public interface QueryData {

    
    public void addParameter(final String key, final Object value);

    
    public void addParameters(final Map<String, Object> parameters);

    
    public Map<String, Object> getParameters();

    
    public String getQuery();

    
    public void removeParameter(final String key);

}