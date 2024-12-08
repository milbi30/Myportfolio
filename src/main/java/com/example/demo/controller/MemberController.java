package com.example.demo.controller;

import com.example.demo.dto.MemberDTO;
import com.example.demo.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;
    //생성자 주입

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }


    @GetMapping("/member/save")
    public String saveForm() {return "save";}

    @PostMapping("/member/save")
    public String save(@ModelAttribute MemberDTO memberDTO) {
        System.out.println("MemberController.save");
        // memberDTO에서 값을 출력
        System.out.println("memberDTO =" + memberDTO);
        memberService.save(memberDTO);
        return "index";
    }
}