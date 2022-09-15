package com.example.security.controller;

import com.example.security.entity.Notice;
import com.example.security.repository.NoticeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NoticeController {

    private final NoticeRepository noticeRepository;

    public NoticeController(NoticeRepository noticeRepository) {
        this.noticeRepository = noticeRepository;
    }

    @GetMapping("/notices")
    public List<Notice> getNotices() {
        return noticeRepository.findAllActiveNotices();
    }
}
