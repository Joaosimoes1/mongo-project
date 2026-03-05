package com.joaosimoes.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaosimoes.workshopmongo.domain.Post;
import com.joaosimoes.workshopmongo.domain.User;
import com.joaosimoes.workshopmongo.dto.UserDTO;
import com.joaosimoes.workshopmongo.exception.ObjectNotFoundException;
import com.joaosimoes.workshopmongo.repository.PostRepository;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	public List<Post> findAll(){
		return repo.findAll();
	}
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	} 
	
	
}
