package me.seonwoo.springbootdeveloper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// DB에서 데이터를 가져오는 퍼시스턴스 계층 역할
@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}