package com.nigar.libraryapi.controller;

import com.nigar.libraryapi.entity.Member;
import com.nigar.libraryapi.service.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nigar.libraryapi.dto.MemberDto;

import java.util.List;

@RestController

public class MemberController {
    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members")
    public List<MemberDto> getAllMembers() {
        return memberService.getAllMembers();
    }
}
