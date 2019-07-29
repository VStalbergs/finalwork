package finalwork.service;

import lv.javaguru.demo.finalwork.database.FieldIsEmptyException;
import lv.javaguru.demo.finalwork.database.Product;

import java.math.BigDecimal;

public class ProductValidationService {

    public boolean validateProduct(Product product) throws FieldIsEmptyException {
        return validateName(product) && validatePrice(product) && validateCategory(product);
    }

    private boolean validateName(Product product) throws FieldIsEmptyException {
        if (product.getName()==null || product.getName().equals("")) {
            try {
                throw new FieldIsEmptyException("Name is not entered");
            } catch (FieldIsEmptyException e){
                System.out.println("Name is not entered");
            }
            return false;

        }
        return true;
    }

    private boolean validatePrice(Product product) throws FieldIsEmptyException {
        if (product.getPrice()==null || product.getPrice().equals(new BigDecimal(0)) ) {
            throw new FieldIsEmptyException("Price is not entered");
        }
        return true;
    }

    private boolean validateCategory(Product product) throws FieldIsEmptyException {
        if (product.getCategory()==null) {
            throw new FieldIsEmptyException("Category is not entered");
        }
        return true;
    }


}
