package kr.ac.kopo.board.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString(exclude = "writer")
public class Board extends BaseEntity{
    //pk지정, bno 자동증가
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bno;

    private String title;
    private String content;

//  지연(Lazy) 로딩 방식 설정
//  즉각(Eager) 로딩 방식은 기본설정되어있음, 모든 관계에 대해 Join을 하기 때문에 불필요한 조인이 발생함
//    데이터의 양이 많을수록 즉각로딩 방식이 실행시간오래걸림
    @ManyToOne(fetch = FetchType.LAZY)
    private Member writer;//board 테이블에 writer_email 컬럼생성이 되고 FK(Member 테이블의 email컬럼 값만 참조)가 설정됨

}
