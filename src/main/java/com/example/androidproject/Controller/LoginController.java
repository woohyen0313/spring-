package com.example.androidproject.Controller;

import com.example.androidproject.Model.Member;
import com.example.androidproject.Model.MemberDao;
import com.example.androidproject.Repository.MemberRepository;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.lang.model.type.NullType;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private MemberDao memberDao;
    @Autowired
    private MemberRepository repository;



    @PostMapping(value="/member/join")
    @ResponseBody
    public void join(@RequestBody Member member){

        memberDao.save(member);
    }

    @GetMapping(value="/member/login")
    @ResponseBody
    public  Boolean login(@RequestBody Member member, HttpServletRequest request){
       Boolean check = memberDao.login(member);

        if(check==true){

            HttpSession session= request.getSession();
            session.setAttribute("OnlineMember",member);
            return true;
        }
        else {
            return false;

        }
    }

}