package com.fsse2401.backend_project.api;

import com.fsse2401.backend_project.config.EnvConfig;
import com.fsse2401.backend_project.data.domainObject.product.response.ProductResponseData;
import com.fsse2401.backend_project.data.dto.product.response.GetAllProductResponseDto;
import com.fsse2401.backend_project.data.dto.product.response.ProductResponseDto;
import com.fsse2401.backend_project.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/public/product")
@CrossOrigin({EnvConfig.DEV_BASE_URL,EnvConfig.PROD_BASE_URL,EnvConfig.PROD_S3_BASE_URL})
public class ProductApi {
    private final ProductService productService;

    public ProductApi(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public List<GetAllProductResponseDto> getAllProduct() {
        List<GetAllProductResponseDto> getAllProductResponseDtoList = new ArrayList<>();
        for (ProductResponseData productResponseData : productService.getAllProduct()) {
            getAllProductResponseDtoList.add(new GetAllProductResponseDto(productResponseData));
        }
        return getAllProductResponseDtoList;
    }

    @GetMapping("/{id}")
    public ProductResponseDto getProductByPid(@PathVariable Integer id) {
        ProductResponseData getProductByPidResponseData = productService.getProductByPid(id);
        return new ProductResponseDto(getProductByPidResponseData);
    }
}
