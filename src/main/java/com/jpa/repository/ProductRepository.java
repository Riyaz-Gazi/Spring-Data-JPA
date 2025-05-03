package com.jpa.repository;

import com.jpa.entity.Product;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    List<Product> findByTitle(String title, Pageable pageable);

    List<Product> findByTitleOrderByPrice(String title);

    List<Product> findBy(Sort sort);

    List<Product> findByOrderByPrice();

    List<Product> findByCreatedAtAfter(LocalDateTime after);

    List<Product> findByQuantityAndPrice(int quantity, BigDecimal price);
    List<Product> findByQuantityGreaterThanAndPriceLessThan(int quantity, BigDecimal price);

    List<Product> findByTitleLike(String title);

    List<Product> findByTitleContainingIgnoreCase(String title,Pageable pageable );

//    Optional<Product> findByTitleAndPrice(String title,BigDecimal price);

//    @Query("select e from Product e where e.title=:title and e.price=:price")
    @Query("select e from Product e where e.title=?1 and e.price=?2")
    Optional<Product> findByTitleAndPrice(String title , BigDecimal price);
}
