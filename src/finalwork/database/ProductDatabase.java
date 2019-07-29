package finalwork.database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDatabase{

    private Map<Long, Product> productDatabase = new HashMap<>();

    protected void add(Product product) throws FieldIsEmptyException {
        long id = product.getId();
        productDatabase.put(id, product);
    }

    public Object getById(String id) throws ItemNotFoundException {
        return null;
    }

    public List findAll() {
        return new ArrayList<>(productDatabase.values());
    }

    public void deleteById(String id) throws ItemNotFoundException {

    }
    public void print(){
        System.out.println(productDatabase);
    }
}
