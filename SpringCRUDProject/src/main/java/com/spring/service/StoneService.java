package com.spring.service;

import java.util.List;

import com.spring.model.Stone;

public interface StoneService {
	
	public String saveStone(Stone stone);
	
	public String updateStone(Stone stone);
	
	public String deleteStone(int id);
	
	public Stone getStone(int id);
	
	public List<Stone> getAll();
	
	public int add(int [] a);

}
