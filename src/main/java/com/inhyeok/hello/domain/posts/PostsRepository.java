package com.inhyeok.hello.domain.posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface PostsRepository extends JpaRepository<Posts, Long>{
    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();
}
//패키지에 있는 녀석을 Repository가 관리해줌. jpa를 상속했는데, jpa는 저장해야 할 항목을 알아서
//db에 넣어준다. 별거없다.
//그냥 이렇게만 만들어도 동작을 한다. 자동으로 코드가 생성이 된다.
//Posts를 배치하고, Long은 Id로 들어갈 것이다. 이렇게 해서 보내면 나머지는 자동으로 저장을 해준다.
//Create, Read, Update, Delete 줄여서 CRUD라고 한다.
//이 인터페이스만 만들어 두어도 CRUD가 자동으로 생성이 된다.