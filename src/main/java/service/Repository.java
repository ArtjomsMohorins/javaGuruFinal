package service;

import java.util.List;

public interface Repository<String,T> {
    List<T> findAll();
    T findById(Long id) throws ItemNotFoundException;
    void save(T object);
    void delete(Long id) throws ItemNotFoundException;
}
