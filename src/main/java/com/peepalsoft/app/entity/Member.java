package com.peepalsoft.app.entity;

import com.peepalsoft.app.entity.notes.CoreNoteBaseEntity;
import com.peepalsoft.app.entity.notes.enums.MemberRoleEnum;
import com.peepalsoft.app.entity.notes.enums.MemberStatusEnum;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Reference;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table
@Entity
@Getter @Setter
public class Member extends CoreNoteBaseEntity {
    private String firstName;
    private String lastName;
    private String address;
    private String contactNumber;
    private MemberRoleEnum memberRole;
    private int refRoleTypeEntityId; // Student or Teacher
    @Reference(value = MemberStatusEnum.class)
    private MemberStatusEnum status;
}
