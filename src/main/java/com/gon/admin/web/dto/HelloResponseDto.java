package com.gon.admin.web.dto;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter //선언된 모든 필드에 get 메서드 새성
@RequiredArgsConstructor //선언된 final 필드가 포함된 생성자 생성
public class HelloResponseDto {
    private final String name;
    private final int amount;
}
