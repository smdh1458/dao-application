package edu.kh.com.daoapplication.controller;

import edu.kh.com.daoapplication.dao.KHTProduct;
import edu.kh.com.daoapplication.dao.KHTUser;
import edu.kh.com.daoapplication.service.KHTProductService;
import edu.kh.com.daoapplication.service.KHTUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class ApiController {

    @Autowired
    private KHTUserService khtUserService;
    @Autowired
    private KHTProductService khtProductService;

    //ajax url을 이용해서 DB에 저장된 DB 불러오기
    @GetMapping("/api/users")
    public List<KHTUser> findAll() {
        List<KHTUser> users = khtUserService.findAll();
        log.info(users.toString());
        return users;
    }

    // ajax url을 이용해서 DB에 회원 저장하기
    @PostMapping("/api/saveUser")
    public KHTUser saveUser(@RequestBody KHTUser khtUser) {
        return khtUserService.save(khtUser);
    }

    //모든 제품 조회 /api/products
    @GetMapping("/api/products")
    public List<KHTProduct> getAllProducts() {
        List<KHTProduct> allProducts = khtProductService.findAll();
        log.info(allProducts.toString());
        return allProducts;
    }

    //제품 등록은 /api/saveProduct
    @PostMapping("/api/saveProduct")
    public KHTProduct saveProduct(@RequestBody KHTProduct product) {
        return khtProductService.save(product);
    }
}
