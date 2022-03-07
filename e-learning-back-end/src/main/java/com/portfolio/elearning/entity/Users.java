package com.portfolio.elearning.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
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
    @NotNull
    @Pattern(regexp = "^(?=.*[a-z])(?=.*\\d)[a-z\\d]{8,}$")
    private String username;
    @NotNull
    private String password;
    @NotNull
    @Pattern(regexp = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$")
    private String email;
    @NotNull
    private String roleId;
    private boolean deleted;

    @NotNull
    private String status;
    @CreationTimestamp
    private Timestamp createdDate;
    private int createdBy;
    private Timestamp updatedDate;
    private int updatedBy;
}
