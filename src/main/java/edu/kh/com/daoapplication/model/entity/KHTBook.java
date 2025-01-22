package edu.kh.com.daoapplication.model.entity;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class KHTBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //Column 작성안할 경우 기본값 (nullable = true, unique = false)
    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private String genre;

    @Column(nullable = true) // 기본값이라 작동 안하는 중
    private String imagePath; //책표지 이미지 경로 추가
}
