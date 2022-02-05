package com.portfolio.elearning.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id;
    @NotBlank
    @Pattern(regexp = "^(?=.*[a-z])(?=.*\\d)[a-z\\d]{8,}$")
    private String username;
    @NotBlank
    private String password;
    @NotBlank
    private String roleId;
    private boolean deleted;

    @NotBlank
    private String status;
    @CreationTimestamp
    private Timestamp createdDate;
    private int createdBy;
    private Timestamp updatedDate;
    private int updatedBy;
}
