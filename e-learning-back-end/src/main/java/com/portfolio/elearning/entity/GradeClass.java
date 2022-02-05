package com.portfolio.elearning.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GradeClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id;
    @NotNull
    @Size(min = 0, max = 15)
    private String classGrade;
    private boolean deleted;
    @CreationTimestamp
    private Timestamp createdAt;
    private int createdBy;
    @CreationTimestamp
    private Timestamp updatedAt;
    private int updatedBy;
}
