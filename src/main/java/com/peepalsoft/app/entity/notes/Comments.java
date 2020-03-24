package com.peepalsoft.app.entity.notes;

import com.peepalsoft.app.entity.notes.enums.EntityStatusEnum;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Reference;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
@Getter @Setter
public class Comments extends CoreNoteBaseEntity {
    private String description;

    private EntityStatusEnum status = EntityStatusEnum.ACTIVE;
    @Reference(value = Note.class)
    private int refNoteId;
}
