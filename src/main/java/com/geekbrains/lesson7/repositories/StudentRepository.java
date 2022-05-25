package com.geekbrains.lesson7.repositories;

import com.geekbrains.lesson7.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query("select s.name from Student s where s.id = ?1")
    String getNameById(Long id);
}
