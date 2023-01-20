package com.example.learningplatform.service;

import com.example.learningplatform.dao.LanguageDao;
import com.example.learningplatform.ds.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageService {

    @Autowired
    private LanguageDao languageDao;

    public void saveLanguage(Language language){
        languageDao.save(language);
    }

    public List<Language> findAllLanguage() {
        return languageDao.findAll();
    }

}
