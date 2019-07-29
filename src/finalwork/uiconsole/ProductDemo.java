package finalwork.uiconsole;

import lv.javaguru.demo.finalwork.database.FieldIsEmptyException;
import lv.javaguru.demo.finalwork.database.Product;
import lv.javaguru.demo.finalwork.database.ProductCategories;
import lv.javaguru.demo.finalwork.service.ProductServicesWithDatabase;

import java.math.BigDecimal;


public class ProductDemo {
    public static void main(String[] args) throws FieldIsEmptyException {
        Product product1 = new Product();
        product1.setName("Milk");
        product1.setPrice(new BigDecimal("0.9"));
        product1.setCategory(ProductCategories.DAIRY);

        Product product2 = new Product();
        product2.setName("Bread");
        product2.setPrice(new BigDecimal("1.1"));
        product2.setCategory(ProductCategories.BEKARY);



        ProductServicesWithDatabase productServicesWithDatabase = new ProductServicesWithDatabase();
        productServicesWithDatabase.add(product1);
        productServicesWithDatabase.add(product2);
        productServicesWithDatabase.print();


        /*ProductValidationService productValidationService = new ProductValidationService();
        boolean productIsValidated = productValidationService.validateProduct(product1);
        System.out.println(productIsValidated);
        System.out.println(product1);*/




        /*Product product3 = new Product();
        Product product4 = new Product();
        System.out.println(product4);*/



    }

}
