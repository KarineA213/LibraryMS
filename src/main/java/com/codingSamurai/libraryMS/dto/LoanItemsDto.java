package com.codingSamurai.libraryMS.dto;

import com.codingSamurai.libraryMS.entities.Books;
import com.codingSamurai.libraryMS.entities.Loan;
import com.codingSamurai.libraryMS.entities.LoanItems;
import com.codingSamurai.libraryMS.entities.enums.Condition;

public class LoanItemsDto {

    private Long id;
    private Long loanId;
    private Long bookId;
    private String bookTitle;
    private Condition conditionOnLoan;
    private Condition conditionOnReturn;

    public LoanItemsDto() {
    }

    public LoanItemsDto(Long id, Long loanId, Long bookId, String bookTitle,
                        Condition conditionOnLoan, Condition conditionOnReturn) {
        this.id = id;
        this.loanId = loanId;
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.conditionOnLoan = conditionOnLoan;
        this.conditionOnReturn = conditionOnReturn;
    }

    public LoanItemsDto(LoanItems entity) {
//        this.id = entity.getId();
//        this.loanId = entity.getLoan().getId();
        this.bookId = entity.getBook().getId();
        this.bookTitle = entity.getBook().getTitle();
        this.conditionOnLoan = entity.getConditionOnLoan();
        this.conditionOnReturn = entity.getConditionOnReturn();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLoanId() {
        return loanId;
    }

    public void setLoanId(Long loanId) {
        this.loanId = loanId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public Condition getConditionOnLoan() {
        return conditionOnLoan;
    }

    public void setConditionOnLoan(Condition conditionOnLoan) {
        this.conditionOnLoan = conditionOnLoan;
    }

    public Condition getConditionOnReturn() {
        return conditionOnReturn;
    }

    public void setConditionOnReturn(Condition conditionOnReturn) {
        this.conditionOnReturn = conditionOnReturn;
    }
}