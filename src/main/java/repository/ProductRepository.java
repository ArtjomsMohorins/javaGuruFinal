package repository;

import controller.Product;
import service.ItemNotFoundException;
import service.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository implements Repository<Long, Product> {

    private Map<Long, Product> index = new HashMap<>();

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(index.values());
    }

    @Override
    public Product findById(Long id) throws ItemNotFoundException {
        if(index.containsKey(id)){
            return index.get(id);
        }else{
            throw new ItemNotFoundException("Cannot find product with id = " + id);
        }
    }

    @Override
    public void save(Product object) {
        index.put(object.getId(), object);
    }

    @Override
    public void delete(Long id) throws ItemNotFoundException {
        if(index.containsKey(id)){
            index.remove(id);
        }else{
            throw new ItemNotFoundException("Cannot delete product with id = " + id);
        }
    }

}
