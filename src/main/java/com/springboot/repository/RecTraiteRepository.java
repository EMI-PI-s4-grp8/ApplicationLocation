package com.springboot.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.model.ReclamationTraite;

public interface RecTraiteRepository extends JpaRepository<ReclamationTraite, Long>{
	@Query("select p from ReclamationTraite p ")
	public List<ReclamationTraite> chercherRT();
	
}
