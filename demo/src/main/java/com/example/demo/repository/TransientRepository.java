package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.TransientAnnotationDomain;

@Repository
public interface TransientRepository extends JpaRepository<TransientAnnotationDomain, Long> {

}
