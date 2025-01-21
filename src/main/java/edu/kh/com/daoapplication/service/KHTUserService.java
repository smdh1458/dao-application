package edu.kh.com.daoapplication.service;


import edu.kh.com.daoapplication.dao.KHTUser;
import edu.kh.com.daoapplication.repository.KHTUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KHTUserService {

    @Autowired
    private KHTUserRepository khtUserRepository;

    // 모든 유저 조회
    public List<KHTUser> findAll() {
        return khtUserRepository.findAll();
    }

    //유저 저장하기
    public KHTUser save(KHTUser khtUser) {
        return khtUserRepository.save(khtUser);
    }


}
