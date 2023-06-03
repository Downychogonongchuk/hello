package com.exam.examproject.Service;

import com.exam.examproject.repository.memberRepository;
import jakarta.transaction.Transactional; //**오류되돌려줌
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Transactional
@Service
@RequiredArgsConstructor
public class memberService {
    private final memberRepository memberRepo;
}
