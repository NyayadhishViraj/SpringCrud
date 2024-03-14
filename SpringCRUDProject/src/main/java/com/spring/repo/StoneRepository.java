package com.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.model.Stone;

public interface StoneRepository extends JpaRepository<Stone,Integer>{

}
