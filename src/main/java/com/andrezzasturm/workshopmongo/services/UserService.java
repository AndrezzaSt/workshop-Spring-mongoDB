package com.andrezzasturm.workshopmongo.services;

import com.andrezzasturm.workshopmongo.domain.User;
import com.andrezzasturm.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired //injeção de dependencia automatica do Spring
    private UserRepository repo;


    public List<User> findAll() {
        return repo.findAll(); //retorna todos os objetos de tipo user
    }
}
