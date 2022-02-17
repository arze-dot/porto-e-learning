package com.portfolio.elearning.service;

import com.portfolio.elearning.entity.GradeClass;
import com.portfolio.elearning.repository.GradeClassRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class GradeClassService {

    @Autowired
    private GradeClassRepo gradeClassRepo;

    public ResponseEntity addGradeClass(GradeClass gradeClass){
        try {
            gradeClassRepo.save(gradeClass);
            return new ResponseEntity("Saving class grade successful", HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity("Failed to save class grade", HttpStatus.BAD_REQUEST);
        }
    }

}
