package com.spring.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Stone;
import com.spring.service.StoneService;

@RestController
@RequestMapping("/stone")
public class StoneController {
	
	@Autowired
	private StoneService sr;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveStone(@RequestBody Stone stone){
		String str = sr.saveStone(stone);
		return new ResponseEntity<>(str,HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updateStone(@RequestBody Stone stone){
		String str= sr.updateStone(stone);
		return new ResponseEntity<>(str,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteStone(@PathVariable int id){
		String str = sr.deleteStone(id);
		return new ResponseEntity<>(str, HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Stone> getStone(@PathVariable int id) {
		return new ResponseEntity<>(sr.getStone(id),HttpStatus.FOUND);
	}
	
	
	@GetMapping("/get")
	public ResponseEntity<List<Stone>> getall(){
		return new ResponseEntity<>(sr.getAll(),HttpStatus.FOUND);
		
	}
	
	@PostMapping("/add")
	public ResponseEntity<Integer> add(@RequestParam (value ="arr")int [] a) {
		return new ResponseEntity<>(sr.add(a),HttpStatus.OK);
		
	}
	
	
	
	

}
