package com.example.androidproject.Model;

import com.example.androidproject.Repository.MemberRepository;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class MemberDao {

    @Autowired
    private MemberRepository repository;

    public void save(Member member){
        repository.save(member);
    }

    public Boolean login(Member member){

        if(Objects.equals(member.getPassword(), repository.findByid(member.getId()).getPassword())) return true;

        else return false;
    }




}
