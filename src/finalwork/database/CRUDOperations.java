package finalwork.database;

import java.util.List;

public interface CRUDOperations<T> {
    void add(T item);

    T getById(String id) throws ItemNotFoundException;

    List<T> findAll();

    void deleteById(String id) throws ItemNotFoundException;
}
