package repository;

import java.util.ArrayList;
import java.util.List;

import objectpool.DatabasePool;

public class ProductRepository {

    public void insert(Product product) {
        DatabasePool.getConnection().sql("INSERT INTO products(id, name, price) VALUES (?, ?, ?)",
                product.getId(), product.getName(), product.getPrice());
    }

    public void update(Product product) {
        DatabasePool.getConnection().sql("UPDATE products SET name = ?, price = ? WHERE id = ?",
                product.getName(), product.getPrice());
    }

    public void delete(String id) {
        DatabasePool.getConnection().sql("DELETE FROM products WHERE id = ?", id);
    }

    public List<Product> selectAll() {
        List<Object[]> select = DatabasePool.getConnection().select("SELECT * FROM products");
        List<Product> products = new ArrayList<>();
        for (Object[] objects : select) {
            Product product = new Product();
            product.setId((String) objects[0]);
            product.setName((String) objects[0]);
            product.setPrice((Integer) objects[0]);
            products.add(product);
        }
        return products;
    }

}
