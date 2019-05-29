package repositorypattern;

import java.util.Collection;


public interface FilteredRepository<V, F> extends Repository<V> {


    public Collection<V> getCollection(final F filter);

    
    public V getEntity(final F filter);

}