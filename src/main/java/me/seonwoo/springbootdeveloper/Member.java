package me.seonwoo.springbootdeveloper;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED) // proteced는 기본 생성자
// 접근 제어자는 public 또는 protected, protected가 더 안전하므로 접근 제어자가 protected인 기본 생성자 생성
@AllArgsConstructor
@Getter
@Entity // Member 객체를 JPA가 괸리하는 엔티티로 지정-> Member 클래스와 실제 데이터베이스의 테이블을 매핑
// @Entity(name="member_list") // name 파라미터로 Member 클래스와 'member_list'라는 이름을 가진 테이블과 매핑 예시
public class Member {
    @Id // 'LONG'타입 id 필드를 테이블 기본키로 지정
    @GeneratedValue(strategy=GenerationType.IDENTITY) // 기본키를 자동으로 1씩 증가
    @Column(name="id", updatable=false)
    private Long id; //DB 테이블의 'id' 컬럼과 매칭

    @Column(name="name", nullable=false) // name이라는 not null 컬럼과 매핑
    private String name; // DB 테이블의 'name' 컬럼과 매칭
}
