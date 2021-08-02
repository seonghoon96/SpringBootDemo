package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); // 회원이 저장소에 저장
    Optional<Member> findById(Long Id); // Id로 회원 찾기
    Optional<Member> findByName(String name);
    List<Member> findAll();

}
