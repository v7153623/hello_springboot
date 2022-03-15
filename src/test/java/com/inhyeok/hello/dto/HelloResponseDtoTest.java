package com.inhyeok.hello.dto;
import com.inhyeok.hello.web.dto.HelloResponseDto;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {

    @Test
    public void 롬복_기능_테스트(){
        //given
        String name="test";
        int amount=1000;

        //when
        HelloResponseDto dto=new HelloResponseDto(name,amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);
        //assertj라는 테스트 검증 라이브러리의 검증 메소드, 검증하고 싶은 대상을 메소드 인자로 받음.
        //메소드체이닝이 지원되어서 isEqualTo와 같이 메소드를 이어 사용가능함.
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
