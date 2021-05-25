package com.gon.admin.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
//롬복 어노테이션
@Getter
//setter를 두지 않는 이유: 차후 기능 변경 시 클래스의 인스턴스 값들이 언제 어디서 변하는지 구분이 복잡
@NoArgsConstructor  //기본생성자 자동추가 (public Posts(){}와 같은 기능)
//jpa 어노테이션(주요기능의 어노테이션을 class에 가깝게 두어 관리 추천)
@Entity //테이블과 링크될 클래스임을 명시
public class Posts {
    @Id //pk 필드
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment를 위한 추가
    private  Long id; //pk키는 long타입으로 두길 추천(책 p.91 참조)

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder //빌드에 포함하고자 하는곳에 명시
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
