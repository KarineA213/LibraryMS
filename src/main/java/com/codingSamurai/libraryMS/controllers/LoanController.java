package com.codingSamurai.libraryMS.controllers;

import com.codingSamurai.libraryMS.dto.LoanDto;
import com.codingSamurai.libraryMS.services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @Autowired
    private LoanService service;


    @GetMapping("/{id}")
    public ResponseEntity<LoanDto> findById(@PathVariable Long id) {
        LoanDto dto = service.findById(id);
        return ResponseEntity.ok(dto); //cod 200
    }


    @GetMapping
    public ResponseEntity<Page<LoanDto>> findAll (Pageable pageable) {
        Page<LoanDto> loans = service.findAll(pageable);
        return ResponseEntity.ok(loans);
    }





}
