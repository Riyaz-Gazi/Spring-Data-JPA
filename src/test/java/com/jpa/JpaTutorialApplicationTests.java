package com.jpa;

import com.jpa.entity.Product;
import com.jpa.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class JpaTutorialApplicationTests {

	@Autowired
	ProductRepository productRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void testRepository(){
		Product product = Product.builder().
				sku("nestle234")
				.title("Nestle  & chocolate")
				.price(BigDecimal.valueOf(1236.45))
				.quantity(12)
				.build();
		Product savedProduct = productRepository.save(product);
		System.out.println(savedProduct);

	}

	@Test
	void getRepository(){
		List<Product> products = productRepository.findAll();
//		List<Product> products = productRepository.findByCreatedAtAfter(LocalDateTime.of(2025,1,1,0,0,0));
//		List<Product>products = productRepository.findByQuantityAndPrice(12,BigDecimal.valueOf(123.45));
//		List<Product> products = productRepository.findByTitleLike("%Bis%");
//		List<Product> products = productRepository.findByTitleContainingIgnoreCase("Bis");
//		List<Product> products = productRepository.findByTitle("Parle-G");

		System.out.println("------------");
		System.out.println(products);

	}

	@Test
	void getSingleFromRepository(){
		Optional<Product> product = productRepository.findByTitleAndPrice("Nestle chocolate",BigDecimal.valueOf(123.45));
		product.ifPresent(System.out::println);
	}

}
