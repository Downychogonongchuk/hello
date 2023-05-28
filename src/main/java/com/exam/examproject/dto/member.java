package com.exam.examproject.dto;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    public int idx;
    public String name;
    public String birthday;
    public String phone;
    public String address;
    public String account;
    public String password;
    public String regdate;


}
