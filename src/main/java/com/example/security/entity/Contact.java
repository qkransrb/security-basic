package com.example.security.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(
        name = "contact_messages"
)
@Getter
@Setter
@NoArgsConstructor
public class Contact {

    @Id
    @Column(name = "contact_id")
    private String contactId;

    @Column(name = "contact_name")
    private String contactName;

    @Column(name = "contact_email")
    private String contactEmail;

    @Column(name = "subject")
    private String subject;

    @Column(name = "message")
    private String message;

    @Column(name = "create_dt")
    private Date createDt;

    @Builder
    public Contact(String contactId, String contactName, String contactEmail, String subject, String message, Date createDt) {
        this.contactId = contactId;
        this.contactName = contactName;
        this.contactEmail = contactEmail;
        this.subject = subject;
        this.message = message;
        this.createDt = createDt;
    }
}
