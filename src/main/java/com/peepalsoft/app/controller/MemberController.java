package com.peepalsoft.app.controller;

import com.peepalsoft.app.entity.Member;
import com.peepalsoft.app.entity.notes.enums.MemberRoleEnum;
import com.peepalsoft.app.repo.MemberRepo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.xml.stream.Location;
import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;
import java.util.List;

@RestController
@RequestMapping("member")
public class MemberController {


    private MemberRepo memberRepo;

    @Autowired
    public void setMemberRepo(MemberRepo memberRepo) {
        this.memberRepo = memberRepo;
    }


    @GetMapping(path = "/create-page")
    public ModelAndView createpage() {
        ModelAndView model = new ModelAndView("member/create");
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
    @GetMapping(value="/view-page")
    public ModelAndView data(){
        ModelAndView model = new ModelAndView("member/view");
        // model.addObject("students", new Students());
        return model;
    }
    @DeleteMapping("/delete/{id}")
    void  delete(@PathVariable int  id) {
        Member member = memberRepo.findById(id).get();
        if (member == null)
        {
            System.out.println("The requested id was not found");
        }
        memberRepo.delete(member);
    }


}