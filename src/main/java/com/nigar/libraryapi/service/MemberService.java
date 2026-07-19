package com.nigar.libraryapi.service;

import com.nigar.libraryapi.entity.Member;
import com.nigar.libraryapi.repository.MemberRepository;
import org.springframework.stereotype.Service;

import com.nigar.libraryapi.dto.MemberDto;
import java.util.stream.Collectors;

import java.util.List;

@Service

public class MemberService {
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public List<MemberDto> getAllMembers() {
        return memberRepository.findAll()
                .stream()
                .map(member -> new MemberDto(
                        member.getId(),
                        member.getFullName(),
                        member.getEmail()
                ))
                .collect(Collectors.toList());
    }
}
