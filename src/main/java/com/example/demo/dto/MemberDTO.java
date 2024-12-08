package com.example.demo.dto;

import lombok.*;

// Lombok 어노테이션: Getter, Setter, 기본 생성자, 전체 생성자, toString 자동 생성
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MemberDTO {
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;
}