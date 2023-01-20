package com.example.learningplatform.service;

import com.example.learningplatform.dao.StudentDao;
import com.example.learningplatform.ds.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    public void saveStudent(Student student){
        studentDao.save(student);
    }

    public Iterable<Student> findAllStudent(){
       return studentDao.findAll();
    }
}
