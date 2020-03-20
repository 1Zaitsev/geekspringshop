package qdo_ln.geekspringshop.services;

import lombok.RequiredArgsConstructor;
import org.springframework.expression.ExpressionException;
import org.springframework.stereotype.Service;
import qdo_ln.geekspringshop.persistence.entities.Product;
import qdo_ln.geekspringshop.persistence.entities.enums.ProductCategory;
import qdo_ln.geekspringshop.persistence.repositories.ProductRepository;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public Product findOneById(UUID id) throws Exception {
        return productRepository.findById(id).orElseThrow(
                () -> new Exception("")
        );
    }

    public List<Product> findAll(Integer category) {
        return category == null ?
                productRepository.findAll() :
                productRepository.findAllByCategory(ProductCategory.values()[category]);
    }
}
