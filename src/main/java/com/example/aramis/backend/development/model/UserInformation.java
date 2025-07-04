package com.example.aramis.backend.development.model;

/*
Author: Tanisha Ravindran
Alstom intern
Created for educational purposes
 */

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "userinformation") // Matches Postgres table name
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInformation {

    @Id
    @GeneratedValue
    @Column(name = "userid", updatable = false, nullable = false, columnDefinition = "uuid")
    private UUID userId;

    @Column(name = "userrole", nullable = false)
    private String userRole;

    @Column(name = "creationdate", nullable = false)
    private LocalDate creationDate;

    @Column(name = "lastchangeddate", nullable = false)
    private LocalDate lastChangedDate;
}
