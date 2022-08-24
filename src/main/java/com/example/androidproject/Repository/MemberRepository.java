package com.example.androidproject.Repository;

import com.example.androidproject.Model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MemberRepository extends CrudRepository<Member,Long>, JpaRepository<Member,Long> {

    Member findByid(long id);

    // Member save(Member  member);
   //  Optional<Member> findById(Long id);
   //  Optional<Member>findMyPassword(String password);
  //  List<Member> findAll();

}
