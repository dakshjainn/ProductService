package com.example.sst_backend.Services;

import com.example.sst_backend.Model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProductService {
    Product getProductById(Long id);

    List<Product> getAllProducts();
}
