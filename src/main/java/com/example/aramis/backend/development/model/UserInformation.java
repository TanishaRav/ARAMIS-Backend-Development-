package com.example.aramis.backend.development.model;

/*
Author: Tanisha Ravindran
Alstom intern
Created for educational purposes
 */

import jakarta.persistence.*;
        import java.time.LocalDate;

@Entity
@Table(name = "userinformation") // must match the table name in Postgres exactly
public class UserInformation {

    @Id
    @Column(name = "userid")
    private String userId;

    @Column(name = "userrole")
    private String userRole;

    @Column(name = "creationdate")
    private LocalDate creationDate;

    @Column(name = "lastchangeddate")
    private LocalDate lastChangedDate;

    // Getters and Setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDate getLastChangedDate() {
        return lastChangedDate;
    }

    public void setLastChangedDate(LocalDate lastChangedDate) {
        this.lastChangedDate = lastChangedDate;
    }
}
