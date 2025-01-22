package edu.kh.com.daoapplication.entity;


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
}
