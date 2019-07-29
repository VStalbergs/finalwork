package finalwork.service;

import lv.javaguru.demo.finalwork.database.FieldIsEmptyException;
import lv.javaguru.demo.finalwork.database.Product;
import lv.javaguru.demo.finalwork.database.ProductDatabase;

public class ProductServicesWithDatabase extends ProductDatabase {

    @Override
    public void add(Product product) throws FieldIsEmptyException {
        ProductValidationService productValidationService = new ProductValidationService();
        if(productValidationService.validateProduct(product)){
            product.setId(product.getId()+1);
            super.add(product);
        }
    }
}
