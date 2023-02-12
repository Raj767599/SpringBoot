package com.raj.springcrud.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Generated;

import java.util.Date;

@Setter
@Getter
@ToString
@Entity
@Table(name="tbl_employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")

    private Long id;

//    @Column(name = "name")
    @NotNull(message = "name should not be null")
    private String name;
//    @Column(name = "age")
    private Long age=0L;
//    @Column(name = "location")
    @NotEmpty(message = "not empty location") // @NotBlank(message = "not empty location")
    private String location;
//    @Column(name = "email")
    @Email(message = "Enter valid Email")
    private String email;
//    @Column(name = "department")
    private String department;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private Date createdAt;

    @CreationTimestamp
    @Column(name = "updated_at")
    private Date updatedAt;

}
