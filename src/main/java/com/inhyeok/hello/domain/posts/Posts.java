package com.inhyeok.hello.domain.posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CollectionId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Getter
@NoArgsConstructor
@Entity
// DB 테이블에 링크되는 클래스이다. 엔티티만 붙이면 자동으로 테이블에 들어간다.
public class Posts {
    @Id
    //Id같은 경우는 데이터 베이스의 번호가 중요한데, 그런걸 자동으로 해줌
    //이 Id라고 하면, Primary Key임. (배웠던거 기억나지?) - 기준이 되는 키
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    //제네레이션 타입을 아이덴티티라고 하면 1씩 증가됨. sql 용어로 auto_increment
    private Long id;

    @Column(length = 500, nullable = false)
    //길이는 500글자고, 널은 들어와서는 안된다는 설정임.
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    //컬럼을 또하나 만드는 거임. 텍스트로 명시화를 시켜주고, 널은 안됨
    private String content;

    private String author;

    @Builder
    //빌더 같은 경우는 빌더방식을 의미하는데, 순서대로 생성을 시키라는 그런 의미다.
    public Posts(String title, String content, String author){
        this.title=title;
        this.content=content;
        this.author=author;
    }

    public void update(String title, String content){
        this.title=title;
        this.content=content;
    }
}

