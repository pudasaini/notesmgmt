package com.peepalsoft.app.controller;

import com.peepalsoft.app.entity.Member;
import com.peepalsoft.app.repo.MemberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("member")
public class MemberController {
    @Autowired
    MemberRepo memberRepo;


    @GetMapping(path = "/create-page")
    public ModelAndView createpage() {
        ModelAndView model = new ModelAndView("member/create");
        // model.addObject("member", memberRepo.findAll());
        return model;
    }

    @PostMapping(path = "/")
    public void saveValues(@RequestBody Member member) {
        Member member1 = new Member();
        member1 = memberRepo.save(member);
        if (member1 == null) {
            System.out.println("No values to save!");
        }
        System.out.println("Values have been saved!");
    }

    @GetMapping(value = "/getall")
    public List<Member> findData() {
        List<Member> list = memberRepo.findAll();
        return list;
    }
}