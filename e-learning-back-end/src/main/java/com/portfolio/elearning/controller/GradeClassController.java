package com.portfolio.elearning.controller;

import com.portfolio.elearning.entity.GradeClass;
import com.portfolio.elearning.service.GradeClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class GradeClassController {

    @Autowired
    private GradeClassService gradeClassService;

    @PostMapping("/admin/grade-class")
    public ResponseEntity addGradeClass(@RequestBody GradeClass gradeClass){
        return gradeClassService.addGradeClass(gradeClass);
    }
}
