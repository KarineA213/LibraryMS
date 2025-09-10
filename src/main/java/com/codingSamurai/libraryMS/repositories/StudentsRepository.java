package com.codingSamurai.libraryMS.repositories;

import com.codingSamurai.libraryMS.entities.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Students, Integer> {
}
