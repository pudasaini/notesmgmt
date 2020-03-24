package com.peepalsoft.app.entity;

import com.peepalsoft.app.entity.notes.CoreNoteBaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Reference;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table
@Entity
@Getter @Setter
public class Student extends CoreNoteBaseEntity {
    @Reference(value = Member.class)
    private int refMemberId;
    private String className;
    private String sectionName;
    private String rollNo;
}
