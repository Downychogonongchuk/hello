package com.exam.examproject.Service;

import com.exam.examproject.dto.Board;
import com.exam.examproject.dto.BoardResponse;
import com.exam.examproject.repository.BoardRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

@Transactional
@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public void savePost(BoardResponse boardDto){
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul"));
        Locale.setDefault(Locale.KOREA);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String todayfm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));

        Board board = Board.builder()
                .title(boardDto.getTitle())
                .content(boardDto.getContent())
                .author(boardDto.getAuthor())
                .createdDate(todayfm)
                .modifiedDate(todayfm)
                .build();

        boardRepository.save(board);
    }
}
