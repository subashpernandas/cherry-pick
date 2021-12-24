package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Staff;

@Repository
public interface StaffRepo extends JpaRepository<Staff, Integer>{

}
