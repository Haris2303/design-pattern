package repository;

import java.util.List;

public class RepositoryApp {

    public static void main(String[] args) {
        Product product = new Product();
        product.setId("1");
        product.setName("Product 1");
        product.setPrice(100000);

        ProductRepository repository = new ProductRepository();
        repository.insert(product);

        product.setPrice(2000);

        repository.update(product);

        repository.delete(product.getId());

        List<Product> products = repository.selectAll();
    }
}
