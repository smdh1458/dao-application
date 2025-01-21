package edu.kh.com.daoapplication.dao;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class KHTUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    //nullable = null 값 ok? false = null값 허용 안함
    @Column(unique=true, nullable=false)
    private String username;


    //unique = 똑같은 값을 허용할 것인가? false = null값 허용 안함
    @Column(unique = false, nullable = false)
    private String password;

}
