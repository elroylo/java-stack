package com.codingdojo.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.languages.models.Language;
import com.codingdojo.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	// adding the book repository as a dependency
    private final LanguageRepository LanguageRepository;
    
    public LanguageService(LanguageRepository LanguageRepository) {
        this.LanguageRepository = LanguageRepository;
    }
    // returns all the books
    public List<Language> allLanguages() {
        return LanguageRepository.findAll();
    }
    // creates a book
    public Language createLanguage(Language b) {
        return LanguageRepository.save(b);
    }
    // retrieves a book
    public Language findLanguage(Long id) {
        Optional<Language> optionalLanguage = LanguageRepository.findById(id);
        if(optionalLanguage.isPresent()) {
            return optionalLanguage.get();
        } else {
            return null;
        }
    }
    // updates a book
    public Language updateLanguage(Long id, String name, String creator, String version) {
    	Optional<Language> optionalLanguage = LanguageRepository.findById(id);
        if(optionalLanguage.isPresent()) {
        	Language language = optionalLanguage.get();
        	language.setName(name);
        	language.setCreator(creator);
        	language.setVersion(version);
            return LanguageRepository.save(language);
        } else {
            return null;
        }
    }
    // deletes a book
    public void deleteLanguage(Long id) {
        Optional<Language> optionalBook = LanguageRepository.findById(id);
        if(optionalBook.isPresent()) {
        	LanguageRepository.delete(optionalBook.get());
        } 
    }
}
