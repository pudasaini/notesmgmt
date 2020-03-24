package com.peepalsoft.app.entity.notes;

import com.peepalsoft.app.entity.notes.enums.FileTypeEnum;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Reference;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table
@Entity
@Getter @Setter
public class NoteFileDetail extends CoreNoteBaseEntity {
    @Reference(value = Note.class)
    private int refNoteId;
    private String fileUrl;
    private FileTypeEnum fileType;
}
