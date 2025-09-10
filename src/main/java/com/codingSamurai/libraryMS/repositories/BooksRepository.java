package com.codingSamurai.libraryMS.repositories;

import com.codingSamurai.libraryMS.entities.Books;
import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;


public interface BooksRepository extends JpaRepository<Books, Long> {



    List<Books> findById(SingularAttribute<AbstractPersistable, Serializable> id);



}
