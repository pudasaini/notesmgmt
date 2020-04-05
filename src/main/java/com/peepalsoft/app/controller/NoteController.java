package com.peepalsoft.app.controller;

import com.peepalsoft.app.repo.NoteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController("note")
public class NoteController {

    NoteRepo noteRepo;
    @Autowired

    public void setNoteRepo(NoteRepo noteRepo) {
        this.noteRepo = noteRepo;
    }

    @GetMapping(path = "/view-page")
    public ModelAndView createPage(){
        ModelAndView model = new ModelAndView("note/view");
        return model;
    }

}
