package me.seonwoo.springbootdeveloper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository;
    public void test() {
        // 생성(Create)
        memberRepository.save(new Member(1L, "A")); // 전달 인수로 엔티티 Member를 넘김

        // 조회(Read)
        Optional<Member> member = memberRepository.findById(1L); // 단건 조회
        List<Member> allMembers = memberRepository.findAll(); // 전체 조회

        // 삭제(Delete)
        memberRepository.deleteById(1L); // delete() 메서드를 호출해 엔티티를 전달 인수로 넘겨 삭제할 수 있음
    }
}