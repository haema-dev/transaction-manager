package com.example.demo.jdbc;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PurchaseService {

    private final ProductRepository productRepository; // 상품 레포지토리

    private final OrderRepository orderRepository; // 주문 레포지토리

    @Transactional(rollbackFor = Exception.class) // 예외가 발생하면 트랜잭션 롤백
    public void purchaseProduct(Long productId, int quantity) throws Exception {
//        // 상품 찾기
//        Product product = productRepository.getProject(productId);
//        if (product == null) {
//            throw new Exception("상품을 찾을 수 없습니다.");
//        }
//
//        // 재고 확인
//        if (product.getStock() < quantity) {
//            throw new Exception("재고가 부족합니다.");
//        }
//
//        // 주문 생성
//        Order order = new Order(product, quantity);
//        productRepository.insertOrder("createOrder", order);
//
//        // 재고 감소
//        product.decreaseStock(quantity);
//        sqlSessionTemplate.update("updateProductStock", product);
    }
}
