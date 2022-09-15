package com.example.security.repository;

import com.example.security.entity.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NoticeRepository extends JpaRepository<Notice, Integer> {

    @Query("select n from Notice n where current_date between n.noticeBegDt and n.noticeEndDt")
    List<Notice> findAllActiveNotices();
}
