package com.example.learningplatform.dao;

import com.example.learningplatform.ds.Language;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LanguageDao extends JpaRepository<Language,Integer> {
}
