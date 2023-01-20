package com.example.learningplatform.dao;

import com.example.learningplatform.ds.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentDao extends JpaRepository<Student,Integer> {

}
