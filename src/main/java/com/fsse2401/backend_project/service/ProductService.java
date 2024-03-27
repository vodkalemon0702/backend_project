package com.fsse2401.backend_project.service;

import com.fsse2401.backend_project.data.domainObject.product.response.ProductResponseData;
import com.fsse2401.backend_project.data.entity.ProductEntity;

import java.util.List;

public interface ProductService {
    List<ProductResponseData> getAllProduct();

    ProductResponseData getProductByPid(Integer pid);

    ProductEntity getProductById(Integer pid);

    boolean isValidQuantity(ProductEntity entity, Integer quantity);

    boolean isValidQuantity(Integer pid, Integer quantity);

    boolean deductStock(Integer pid, Integer quantity);
}
