package com.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.Stone;
import com.spring.repo.StoneRepository;

@Service
public class StoneServiceImpl implements StoneService{
	
	@Autowired
	StoneRepository sr; 

	@Override
	public String saveStone(Stone stone) {
		sr.save(stone);
		return "New stone added to the collection";
	}

	@Override
	public String updateStone(Stone stone) {
		sr.saveAndFlush(stone);
		return "The stone details are updated";
	}

	@Override
	public String deleteStone(int id) {
		Optional<Stone> op = sr.findById(id);
		if(op.isPresent()) {
			sr.deleteById(id);
			return "The stone has been removed from the collection";
		}
		return "The stone does not exist";
	}

	@Override
	public Stone getStone(int id) {
		Optional<Stone> op = sr.findById(id);
		if(op.isPresent()) {
			;
			return op.get();
		}
		return null;
	}

	@Override
	public List<Stone> getAll() {
		List<Stone> list = sr.findAll();
		return list;
	}

	@Override
	public int add(int []a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return (sum);
	}

}
