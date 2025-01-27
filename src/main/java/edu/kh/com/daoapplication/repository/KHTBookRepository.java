package edu.kh.com.daoapplication.repository;


import edu.kh.com.daoapplication.model.entity.KHTBook;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KHTBookRepository extends JpaRepository<KHTBook, Long> {
    //save
    //findAll
    // -> 기존에 JPA에서 만들었던 save 메서드를 변형해서 재설정
    // KHTBook save(String tilte, String author, String genre, String imagePath); -> 사용안함
    //find (*) By = where
    //@Select("SELECT * FROM KHTBOOK WHRER id = #{id}") // -> 이건 이미 내장되어 있음
    // from 테이블명        findBy = where 명칭 where 이름
    KHTBook                 findById(int id);
    //아이디와 이름으로 비밀번호 찾기
    //@Select("SELECT password FROM KHTBOOK WHERE id = #{id} AND name = #{name}")
    //String findPasswordByIdAndName(int id, String name);

}
