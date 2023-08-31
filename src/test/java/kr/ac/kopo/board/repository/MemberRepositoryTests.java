package kr.ac.kopo.board.repository;

import kr.ac.kopo.board.entity.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
public class MemberRepositoryTests {
    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void insertMembers(){
//        반복문: i를 1씩 증가 시킴. 100번 반복
        IntStream.rangeClosed(1, 100).forEach(i->{
            Member member = Member.builder()
                    .email("user"+ i + "@kopo.ac.kr")
                    .password("1111")
                    .name("USER" + i)
                    .build();
//           위의 Member 객체를 사용해 member 테이블에 insert(데이터행 삽임)

            memberRepository.save(member);
        });
    }
}
