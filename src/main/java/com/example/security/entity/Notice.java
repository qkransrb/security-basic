package com.example.security.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(
        name = "notice_details"
)
@Getter
@Setter
@NoArgsConstructor
public class Notice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "notice_id")
    private int noticeId;

    @Column(name = "notice_summary")
    private String noticeSummary;

    @Column(name = "notice_details")
    private String noticeDetails;

    @Column(name = "notice_beg_dt")
    private Date noticeBegDt;

    @Column(name = "notice_end_dt")
    private Date noticeEndDt;

    @Column(name = "create_dt")
    private Date createDt;

    @Column(name = "update_dt")
    private Date updateDt;

    @Builder
    public Notice(String noticeSummary, String noticeDetails, Date noticeBegDt, Date noticeEndDt, Date createDt, Date updateDt) {
        this.noticeSummary = noticeSummary;
        this.noticeDetails = noticeDetails;
        this.noticeBegDt = noticeBegDt;
        this.noticeEndDt = noticeEndDt;
        this.createDt = createDt;
        this.updateDt = updateDt;
    }
}
