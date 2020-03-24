package com.peepalsoft.app.entity.notes;


import com.peepalsoft.app.entity.notes.enums.EntityStatusEnum;
import com.peepalsoft.app.entity.notes.enums.NotePolicyEnum;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Reference;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table
@Getter @Setter
public class Note extends CoreNoteBaseEntity {
    private String noteTitle;
    private String description;
    private String noteUrl;
    @Reference(value = NotePolicyEnum.class)
    private NotePolicyEnum notePolicy;
    private EntityStatusEnum status = EntityStatusEnum.ACTIVE;

}
