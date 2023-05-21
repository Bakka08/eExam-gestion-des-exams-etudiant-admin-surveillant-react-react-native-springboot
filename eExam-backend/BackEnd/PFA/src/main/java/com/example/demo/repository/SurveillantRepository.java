package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Surveillant;

public interface SurveillantRepository extends JpaRepository<Surveillant, Integer>{
Surveillant findById(long id);
}
