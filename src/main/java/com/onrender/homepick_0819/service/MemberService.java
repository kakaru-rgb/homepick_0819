package com.onrender.homepick_0819.service;

import com.onrender.homepick_0819.dto.MemberJoinDto;
import com.onrender.homepick_0819.repository.MemberRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MemberService{

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;

    public MemberService(MemberRepository memberRepository, PasswordEncoder passwordEncoder){
        this.memberRepository = memberRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void join(MemberJoinDto dto){
        // 아이디 중복 체크
        if (memberRepository.existsByUsername(dto.getUsername())) {
            throw new IllegalArgumentException("이미 존재하는 아이디입니다.");
        }

        // 비밀번호 암호화 후 DTO 저장
        String encodedPassword = passwordEncoder.encode(dto.getPassword());
        dto.setPassword(encodedPassword);

        // DB에 저장
        memberRepository.save(dto);
    }
}
