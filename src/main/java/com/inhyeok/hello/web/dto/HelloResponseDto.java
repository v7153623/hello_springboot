package com.inhyeok.hello.web.dto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
//선언된 필드에 get 메소드 생성
@RequiredArgsConstructor
// 선언된 모든 final 필드가 포함된 생성자를 생성
// final이 없으면 생성자에 포함 안됨

//이 클래스는 데이터 클래스(C로 치면 구조체)임. 안에 인자만 들어감.
public class HelloResponseDto {
    private final String name;
    private final int amount;

}
