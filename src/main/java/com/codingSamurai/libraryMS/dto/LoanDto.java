package com.codingSamurai.libraryMS.dto;

import com.codingSamurai.libraryMS.entities.Loan;
import com.codingSamurai.libraryMS.entities.LoanItems;
import com.codingSamurai.libraryMS.entities.Students;
import com.codingSamurai.libraryMS.entities.enums.LoanStatus;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class LoanDto {

    private Long id;
    private List<LoanItemsDto> loanItems;
    private Students students;
    private LocalDateTime loanDate;
    private LocalDateTime dueDate;
    private LocalDateTime returnDate;
    private LoanStatus status;

    public LoanDto(Long id, List<LoanItemsDto> loanItems, Students student,
                   LocalDateTime loanDate, LocalDateTime dueDate,
                   LocalDateTime returnDate, LoanStatus status) {
        this.id = id;
        this.loanItems = loanItems;
        this.students = students;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
        this.returnDate = returnDate;
        this.status = status;
    }

    public LoanDto(Loan entity) {
        id = entity.getId();
        students = entity.getStudents();
        loanDate = entity.getLoanDate();
        dueDate = entity.getDueDate();
        returnDate = entity.getReturnDate();
        status = entity.getStatus();

        if (entity.getLoanItems() != null) {
            this.loanItems = entity.getLoanItems().stream()
                    .map(LoanItemsDto::new)
                    .collect(Collectors.toList());
        }
    }

    public LoanDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<LoanItemsDto> getLoanItems() {
        return loanItems;
    }

    public void setLoanItems(List<LoanItemsDto> loanItems) {
        this.loanItems = loanItems;
    }

    public Students getStudent() {
        return students;
    }

    public void setStudent(Students student) {
        this.students = students;
    }

    public LocalDateTime getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDateTime loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

    public LoanStatus getStatus() {
        return status;
    }

    public void setStatus(LoanStatus status) {
        this.status = status;
    }
}