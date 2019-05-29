/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorypattern;

import java.util.Collection;
import java.util.LinkedList;
import java.util.function.Predicate;


public final class CollectionRepository<V>
        implements FilteredRepository<V, Predicate<V>> {

    
    private final Collection<V> data;

    
    public CollectionRepository() {
        this(new LinkedList<V>());
    }

    
    public CollectionRepository(final Collection<V> collection) {
        super();

        
        this.data = collection;
    }

    @Override
    public final void add(final V entity) {
        getData().add(entity);
    }

    @Override
    public final Collection<V> getAll() {
        return new LinkedList<V>(getData());
    }

    @Override
    public final Collection<V> getCollection(final Predicate<V> filter) {
        final Collection<V> result;

        result = new LinkedList<V>();
        for (final V entity : getData()) {
            if (filter.test(entity)) {
                result.add(entity);
            } else {
            }
        }

        return result;
    }

    @Override
    public final V getEntity(final Predicate<V> filter) {
        final Collection<V> entities;
        final V entity;

        entities = getCollection(filter);

        if (entities.isEmpty()) {
            entity = null;
        } else {
            entity = entities.iterator().next();
        }

        return entity;
    }

    @Override
    public final void remove(final V entity) {
        getData().remove(entity);
    }

    @Override
    public final void update(final V entity) {
        if (getData().contains(entity)) {
            remove(entity);
            add(entity);
        }
    }

    /**
     * Returns the entities being stored.
     * 
     * @return the entities being stored.
     */
    private final Collection<V> getData() {
        return data;
    }

}