package com.example.ginkou.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ginkou.model.UsresetModel;

@Repository
public interface MainRepository extends JpaRepository<UsresetModel, Long> {
	
}
