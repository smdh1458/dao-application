package edu.kh.com.daoapplication.service;

import edu.kh.com.daoapplication.dao.KHTProduct;
import edu.kh.com.daoapplication.dao.KHTUser;
import edu.kh.com.daoapplication.repository.KHTProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KHTProductService {
    @Autowired
    private KHTProductRepository productRepository;

    //모든 제품 조회
    public List<KHTProduct> findAll() {
        return productRepository.findAll();
    }

    //제품 저장하기
    public KHTProduct save(KHTProduct product) {
        return productRepository.save(product);
    }
}
