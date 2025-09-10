package com.codingSamurai.libraryMS.dto;

import com.codingSamurai.libraryMS.entities.Loan;
import com.codingSamurai.libraryMS.entities.Students;

import java.util.List;

public class StudentsDto {


    private Long id;

    private String name;
    private String course;
    private String email;
    private String phone;

    private List<Loan> borrowedBooks;
    private List<Loan> returnedBooks;

    public StudentsDto(Long id, String name, String course, String email, String phone, List<Loan> borrowedBooks, List<Loan> returnedBooks) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.email = email;
        this.phone = phone;
        this.borrowedBooks = borrowedBooks;
        this.returnedBooks = returnedBooks;
    }

    public StudentsDto() {
    }

    public StudentsDto(Students entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.course = entity.getCourse();
        this.email = entity.getEmail();
        this.phone = entity.getPhone();
        this.borrowedBooks = entity.getBorrowedBooks();
        this.returnedBooks = entity.getReturnedBooks();


    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public List<Loan> getBorrowedBooks() {
        return borrowedBooks;
    }

    public List<Loan> getReturnedBooks() {
        return returnedBooks;
    }
}
