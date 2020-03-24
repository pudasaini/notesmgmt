package com.peepalsoft.app.entity;

import com.peepalsoft.app.entity.notes.CoreNoteBaseEntity;
import com.peepalsoft.app.entity.notes.enums.TeacherCategoryEnum;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Reference;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table
@Entity
@Getter @Setter
public class Teacher extends CoreNoteBaseEntity {
    @Reference(value = Member.class)
    private int refMemberId;
    private String faculty;
    private TeacherCategoryEnum teacherCategoryEnum;
}
