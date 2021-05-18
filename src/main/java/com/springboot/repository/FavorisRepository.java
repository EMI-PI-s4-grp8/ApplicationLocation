package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.Favoris;

@Repository
public interface FavorisRepository extends JpaRepository<Favoris, Long> {  

}
