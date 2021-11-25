package com.andrezzasturm.workshopmongo.services;

import com.andrezzasturm.workshopmongo.domain.Post;
import com.andrezzasturm.workshopmongo.repository.PostRepository;
import com.andrezzasturm.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.stereotype.Service;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PostService {
    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
