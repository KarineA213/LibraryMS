package com.codingSamurai.libraryMS.services;

import com.codingSamurai.libraryMS.dto.LoanDto;
import com.codingSamurai.libraryMS.entities.Loan;
import com.codingSamurai.libraryMS.entities.LoanItems;
import com.codingSamurai.libraryMS.repositories.BooksRepository;
import com.codingSamurai.libraryMS.repositories.LoanRepository;
import com.codingSamurai.libraryMS.repositories.StudentsRepository;
import com.codingSamurai.libraryMS.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.stream.Collectors;

@Service
public class LoanService {

    @Autowired
    private LoanRepository repository;


    @Autowired
    private StudentsRepository studentsRepository;

    @Autowired
    private BooksRepository booksRepository;
    @Autowired
    private InternalResourceViewResolver internalResourceViewResolver;

    @Transactional
    public LoanDto findById(long id) {
        Loan entity = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Resource not found with id " + id)
        );
        return new LoanDto(entity);
    }

    @Transactional
    public Page<LoanDto>  findAll(Pageable pageable) {
        Page<Loan> result = repository.findAll(pageable);
        return result.map(loan -> new LoanDto(loan));

    }


    @Transactional
    public LoanDto insert(LoanDto loans) {

        Loan loan = new Loan();
        copyDtoToEntity(loans, loan);
        Loan savedLoan = repository.save(loan);
        return new LoanDto(savedLoan);

    }


    @Transactional
    public LoanDto update(Long id, LoanDto source) {

        try {
            Loan entity = repository.getReferenceById(id);
            copyDtoToEntity(source, entity);
            entity = repository.save(entity);
            return new LoanDto(entity);

        }catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException("Resource not found with id " + id);
        }
    }



    private void copyDtoToEntity(LoanDto source, Loan entity) {
        entity.setStudent(source.getStudent()); // Assume que StudentDto tem um método toEntity()

        entity.setLoanDate(source.getLoanDate());
        entity.setDueDate(source.getDueDate());
        entity.setReturnDate(source.getReturnDate());
        entity.setStatus(source.getStatus());




    }


}



