package com.example.helloworld.domain.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.helloworld.domain.Test;

@Repository
public interface TestRepository extends JpaRepository<Test, UUID>{

}
