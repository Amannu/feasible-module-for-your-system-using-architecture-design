
package repositorypattern;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;


public final class DefaultQueryData implements QueryData {

    /**
     * Parameters for the query.
     * <p>
     * These will be set into the query string inside the
     * {@code com.wandrell.pattern.repository.Repository Repository}, adapting
     * it to the API being used.
     */
    private final Map<String, Object> params;
    /**
     * The string for the query.
     */
    private final String              queryStr;

    /**
     * Constructs a {@code DefaultQuery} with no parameters.
     * 
     * @param query
     *            the query string
     */
    public DefaultQueryData(final String query) {
        this(query, new LinkedHashMap<String, Object>());
    }

    /**
     * Constructs a {@code DefaultQuery} with the specified query's data.
     * <p>
     * Parameters are pairs of keys on the query and the object which will be
     * used to substitute them.
     * 
     * @param query
     *            the query string
     * @param parameters
     *            the query's parameters
     */
    public DefaultQueryData(final String query,
            final Map<String, Object> parameters) {
        super();


        queryStr = query;
        params = parameters;
    }

    @Override
    public final void addParameter(final String key, final Object value) {

        params.put(key, value);
    }

    @Override
    public final void addParameters(final Map<String, Object> parameters) {
       
        params.putAll(parameters);
    }

    @Override
    public final Map<String, Object> getParameters() {
        return Collections.unmodifiableMap(params);
    }

    @Override
    public final String getQuery() {
        return queryStr;
    }

    @Override
    public final void removeParameter(final String key) {
        params.remove(key);
    }

}