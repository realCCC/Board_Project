package kr.ac.kopo.board.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardDTO {
//    글 번호
    private Long bno;
//    글 제목
    private String title;
//    글 내용
    private String content;
//    글 작성자 이메일
    private String writerEmail;
//    글 작성자 이름
    private String writerName;
//    글 등록된날짜
    private LocalDateTime regDate;
//    글 수정된날짜
    private LocalDateTime modDate;
//    해당 게시글 댓글 개수
    private int replyCount;


}
