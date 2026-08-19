package com.onrender.homepick_0819.service;

import com.onrender.homepick_0819.dto.QnaDto;
import com.onrender.homepick_0819.repository.QnaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QnaService{

    private final QnaRepository qnaRepository;

    public QnaService(QnaRepository qnaRepository){
        this.qnaRepository = qnaRepository;
    }

    public List<QnaDto> getAllQnaList(){
        return qnaRepository.findAll();
    }

    public void createQna(QnaDto qna){
        qnaRepository.save(qna);
    }
}