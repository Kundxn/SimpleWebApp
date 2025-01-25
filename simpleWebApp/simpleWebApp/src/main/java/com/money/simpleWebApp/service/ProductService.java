package com.money.simpleWebApp.service;

import com.money.simpleWebApp.model.Product;
import com.money.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElseThrow(() -> new IllegalArgumentException("Product not found"));
    }

    public void addProduct(Product product) {
        repo.save(product);
    }

    public void updateProduct(Product product) {
        // Make sure product exists before updating
        if (repo.existsById(product.getProdid())) {
            repo.save(product);
        } else {
            throw new IllegalArgumentException("Product not found for update");
        }
    }

    public void deleteProduct(int id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
        } else {
            throw new IllegalArgumentException("Product not found for deletion");
        }
    }
}
