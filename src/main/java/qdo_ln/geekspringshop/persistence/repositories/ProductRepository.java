package qdo_ln.geekspringshop.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import qdo_ln.geekspringshop.persistence.entities.Product;
import qdo_ln.geekspringshop.persistence.entities.enums.ProductCategory;

import java.util.List;
import java.util.UUID;

public interface ProductRepository extends JpaRepository<Product, UUID> {
    List<Product> findAll();

    List<Product> findAllByCategory(ProductCategory category);
}
